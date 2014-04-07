package se.riges.search.lm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.opengis.gml._3.*;

import com.vividsolutions.jts.geom.*;

/**
 * @author fredrikw
 * @version $Id: GmlTypeConverter.java 14310 2013-06-12 11:22:14Z tomhel $
 * @since 4/16/13
 */
class GmlConverter {
  
  private static final ObjectFactory objectFactory = new ObjectFactory();
  private static final GeometryFactory geometryFactory = new GeometryFactory();

  private static long idCounter = 1;

  private boolean swapAxes = false;
  private List<Integer> neReferenceSystems;

  private final static GmlConverter gmlTypeConverter = new GmlConverter();

  public GmlConverter() {
    List<Integer> neRefSys = new ArrayList<Integer>();
    neRefSys.add(3006);
    neRefSys.add(3007);
    neRefSys.add(3008);
    neRefSys.add(3009);
    neRefSys.add(3010);
    neRefSys.add(3011);
    neRefSys.add(3012);
    neRefSys.add(3013);
    neRefSys.add(3014);
    neRefSys.add(3015);
    neRefSys.add(3016);
    neRefSys.add(3017);
    neRefSys.add(3018);
    neRefSys.add(0);
    this.neReferenceSystems = Collections.unmodifiableList(neRefSys);
  }

  public GmlConverter(boolean swapAxes) {
    this();
    this.swapAxes = swapAxes;
  }

  public void setNeReferenceSystems(List<Integer> neReferenceSystems) {
    this.neReferenceSystems = Collections.unmodifiableList(neReferenceSystems);
  }

  public void setSwapAxes(boolean swapAxes) {
    this.swapAxes = swapAxes;
  }

  public Geometry toJtsGeometry(AbstractGeometryType vendorGeometry) {
    return fromAbstractGeometryTypeInternal(vendorGeometry);
  }

  public AbstractGeometryType toVendorGeometry(Geometry jtsGeometry) {
    return toAbstractGeometryTypeInternal(jtsGeometry);
  }

  public static ObjectFactory getObjectFactory() {
    return objectFactory;
  }

  public static BoundingShapeType toBoundingShapeType(Geometry geometry) {
    return gmlTypeConverter.toBoundingShapeTypeInternal(geometry);
  }

  protected BoundingShapeType toBoundingShapeTypeInternal(Geometry geometry) {
    BoundingShapeType boundingShapeType = objectFactory.createBoundingShapeType();
    EnvelopeType envelopeType = objectFactory.createEnvelopeType();
    envelopeType.setSrsName("EPSG:" + geometry.getSRID());
    Envelope envelope = geometry.getEnvelopeInternal();
    envelopeType.setLowerCorner(toDirectPositionTypeInternal(envelope.getMinX(), envelope.getMinY(), geometry.getSRID()));
    envelopeType.setUpperCorner(toDirectPositionTypeInternal(envelope.getMaxX(), envelope.getMaxY(), geometry.getSRID()));
    boundingShapeType.setEnvelope(envelopeType);
    return boundingShapeType;
  }

  public static AbstractGeometryType toAbstractGeometryType(Geometry geometry) {
    return gmlTypeConverter.toAbstractGeometryTypeInternal(geometry);
  }

  protected AbstractGeometryType toAbstractGeometryTypeInternal(Geometry geometry) {
    if(geometry.getClass() == Point.class) return toPointTypeInternal((Point) geometry);
    if(geometry.getClass() == LineString.class) return toLineStringTypeInternal((LineString) geometry);
    if(geometry.getClass() == Polygon.class) return toPolygonTypeInternal((Polygon) geometry);
    if(geometry.getClass() == MultiPoint.class) return toMultiPointTypeInternal((MultiPoint) geometry);
    if(geometry.getClass() == MultiLineString.class) return toMultiCurveTypeInternal((MultiLineString) geometry);
    if(geometry.getClass() == MultiPolygon.class) return toMultiSurfaceTypeInternal((MultiPolygon) geometry);
    throw new IllegalArgumentException("Unsupported geometry: " + geometry);
  }

  public static Envelope fromBoundingShapeType(BoundingShapeType boundingShapeType) {
    EnvelopeType envelopeType = boundingShapeType.getEnvelope();
    List<Double> lowerCorner = envelopeType.getLowerCorner().getValue();
    List<Double> upperCorner = envelopeType.getUpperCorner().getValue();
    Envelope envelope = new Envelope();
    envelope.expandToInclude(lowerCorner.get(0), lowerCorner.get(1));
    envelope.expandToInclude(upperCorner.get(0), upperCorner.get(1));
    return envelope;
  }

  public static Geometry fromAbstractGeometryType(AbstractGeometryType geometryType) {
    return gmlTypeConverter.fromAbstractGeometryTypeInternal(geometryType);
  }

  protected Geometry fromAbstractGeometryTypeInternal(AbstractGeometryType geometryType) {
    if(geometryType.getClass() == PointType.class) return fromPointTypeInternal((PointType) geometryType);
    if(geometryType.getClass() == LineStringType.class) return fromLineStringTypeInternal((LineStringType) geometryType);
    if(geometryType.getClass() == PolygonType.class) return fromPolygonTypeInternal((PolygonType) geometryType);
    if(geometryType.getClass() == MultiPointType.class) return fromMultiPointTypeInternal((MultiPointType) geometryType);
    if(geometryType.getClass() == MultiCurveType.class) return fromMultiCurveTypeInternal((MultiCurveType) geometryType);
    if(geometryType.getClass() == MultiSurfaceType.class) return fromMultiSurfaceTypeInternal((MultiSurfaceType) geometryType);
    throw new IllegalArgumentException("Unsupported geometry: " + geometryType);
  }
  
  
  // JTS -> GML

  public static PointType toPointType(Point point) {
    return gmlTypeConverter.toPointTypeInternal(point);
  }

  protected PointType toPointTypeInternal(Point point) {
    PointType pointType = objectFactory.createPointType();
    pointType.setId(getId());
    pointType.setSrsName("EPSG:" + point.getSRID());
    if(!isTwoDimensional(point)) {
      pointType.setSrsDimension(getDimension(point));
    }
    pointType.setPos(toDirectPositionTypeInternal(point.getCoordinate(), point.getSRID()));
    return pointType;
  }

  public static LineStringType toLineStringType(LineString lineString) {
    return gmlTypeConverter.toLineStringTypeInternal(lineString);
  }

  protected LineStringType toLineStringTypeInternal(LineString lineString) {
    LineStringType lineStringType = objectFactory.createLineStringType();
    lineStringType.setId(getId());
    lineStringType.setSrsName("EPSG:" + lineString.getSRID());
    if(!isTwoDimensional(lineString)) {
      lineStringType.setSrsDimension(getDimension(lineString));
    }
    lineStringType.setPosList(toDirectPositionListTypeInternal(lineString.getCoordinates(), lineString.getSRID()));
    return lineStringType;
  }

  public static PolygonType toPolygonType(Polygon polygon) {
    return gmlTypeConverter.toPolygonTypeInternal(polygon);
  }

  protected PolygonType toPolygonTypeInternal(Polygon polygon) {
    PolygonType polygonType = objectFactory.createPolygonType();
    polygonType.setId(getId());
    polygonType.setSrsName("EPSG:" + polygon.getSRID());
    if(!isTwoDimensional(polygon)) {
      polygonType.setSrsDimension(getDimension(polygon));
    }
    AbstractRingPropertyType exteriorRing = objectFactory.createAbstractRingPropertyType();
    exteriorRing.setAbstractRing(objectFactory.createLinearRing(toLinearRingTypeInternal(polygon.getExteriorRing())));
    polygonType.setExterior(exteriorRing);
    List<AbstractRingPropertyType> interiorList = polygonType.getInterior();
    final int interiorRingCount = polygon.getNumInteriorRing();
    for (int i = 0; i < interiorRingCount; i++) {
      AbstractRingPropertyType interiorRing = objectFactory.createAbstractRingPropertyType();
      interiorRing.setAbstractRing(objectFactory.createLinearRing(toLinearRingTypeInternal(polygon.getInteriorRingN(i))));
      interiorList.add(interiorRing);
    }
    return polygonType;
  }

  public static MultiPointType toMultiPointType(MultiPoint multiPoint) {
    return gmlTypeConverter.toMultiPointTypeInternal(multiPoint);
  }

  protected MultiPointType toMultiPointTypeInternal(MultiPoint multiPoint) {
    MultiPointType multiPointType = new MultiPointType();
    multiPointType.setId(getId());
    multiPointType.setSrsName("EPSG:" + multiPoint.getSRID());
    if(!isTwoDimensional(multiPoint)) {
      multiPointType.setSrsDimension(getDimension(multiPoint));
    }
    List<PointPropertyType> pointMemberList = multiPointType.getPointMember();
    final int pointCount = multiPoint.getNumGeometries();
    for(int i = 0; i < pointCount; i++) {
      PointPropertyType pointMember = objectFactory.createPointPropertyType();
      PointType pointType = toPointTypeInternal((Point) multiPoint.getGeometryN(i));
      if(multiPointType.getSrsName().equals(pointType.getSrsName())) {
        pointType.setSrsName(null);
      }
      if(objectsEquals(multiPointType.getSrsDimension(), pointType.getSrsDimension())) {
        pointType.setSrsDimension(null);
      } else {
        pointType.setSrsDimension(getDimension(multiPoint.getGeometryN(i)));
      }
      pointMember.setPoint(pointType);
      pointMemberList.add(pointMember);
    }
    return multiPointType;
  }

  public static MultiCurveType toMultiCurveType(MultiLineString multiLineString) {
    return gmlTypeConverter.toMultiCurveTypeInternal(multiLineString);
  }

  protected MultiCurveType toMultiCurveTypeInternal(MultiLineString multiLineString) {
    MultiCurveType multiCurveType = objectFactory.createMultiCurveType();
    multiCurveType.setId(getId());
    multiCurveType.setSrsName("EPSG:" + multiLineString.getSRID());
    if(!isTwoDimensional(multiLineString)) {
      multiCurveType.setSrsDimension(getDimension(multiLineString));
    }
    List<CurvePropertyType> curveMemberList = multiCurveType.getCurveMember();
    final int curveCount = multiLineString.getNumGeometries();
    for(int i = 0; i < curveCount; i++) {
      CurvePropertyType curveMember = objectFactory.createCurvePropertyType();
      LineStringType lineStringType = toLineStringTypeInternal((LineString) multiLineString.getGeometryN(i));
      if(multiCurveType.getSrsName().equals(lineStringType.getSrsName())) {
        lineStringType.setSrsName(null);
      }
      if(objectsEquals(multiCurveType.getSrsDimension(), lineStringType.getSrsDimension())) {
        lineStringType.setSrsDimension(null);
      } else {
        lineStringType.setSrsDimension(getDimension(multiLineString.getGeometryN(i)));
      }
      curveMember.setAbstractCurve(objectFactory.createLineString(lineStringType));
      curveMemberList.add(curveMember);
    }
    return multiCurveType;
  }

  public static MultiSurfaceType toMultiSurfaceType(MultiPolygon multiPolygon) {
    return gmlTypeConverter.toMultiSurfaceTypeInternal(multiPolygon);
  }

  protected MultiSurfaceType toMultiSurfaceTypeInternal(MultiPolygon multiPolygon) {
    MultiSurfaceType multiSurfaceType = objectFactory.createMultiSurfaceType();
    multiSurfaceType.setId(getId());
    multiSurfaceType.setSrsName("EPSG:" + multiPolygon.getSRID());
    if(!isTwoDimensional(multiPolygon)) {
      multiSurfaceType.setSrsDimension(getDimension(multiPolygon));
    }
    List<SurfacePropertyType> surfaceMemberList = multiSurfaceType.getSurfaceMember();
    final int surfaceCount = multiPolygon.getNumGeometries();
    for(int i = 0; i < surfaceCount; i++) {
      SurfacePropertyType surfaceMember = objectFactory.createSurfacePropertyType();
      PolygonType polygonType = toPolygonTypeInternal((Polygon) multiPolygon.getGeometryN(i));
      if(multiSurfaceType.getSrsName().equals(polygonType.getSrsName())) {
        polygonType.setSrsName(null);
      }
      if(objectsEquals(multiSurfaceType.getSrsDimension(), polygonType.getSrsDimension())) {
        polygonType.setSrsDimension(null);
      } else {
        polygonType.setSrsDimension(getDimension(multiPolygon.getGeometryN(i)));
      }
      surfaceMember.setAbstractSurface(objectFactory.createPolygon(polygonType));
      surfaceMemberList.add(surfaceMember);
    }
    return multiSurfaceType;
  }


  // GML -> JTS

  public static Point fromPointType(PointType pointType) {
    return gmlTypeConverter.fromPointTypeInternal(pointType);
  }

  protected Point fromPointTypeInternal(PointType pointType) {
    int srid = extractSrid(pointType.getSrsName());
    Point point = geometryFactory.createPoint(toCoordinateSequenceInternal(pointType.getPos().getValue(), pointType.getSrsDimension(), srid));
    point.setSRID(srid);
    return point;
  }

  public static Point fromPointType(PointType pointType, AbstractGeometryType parent) {
    return gmlTypeConverter.fromPointTypeInternal(pointType, parent);
  }

  protected Point fromPointTypeInternal(PointType pointType, AbstractGeometryType parent) {
    int srid = pointType.getSrsName() != null ? extractSrid(pointType.getSrsName()) : extractSrid(parent.getSrsName());
    BigInteger dimension = pointType.getSrsDimension() != null ? pointType.getSrsDimension() : parent.getSrsDimension();
    Point point = geometryFactory.createPoint(toCoordinateSequenceInternal(pointType.getPos().getValue(), dimension, srid));
    point.setSRID(srid);
    return point;
  }

  public static LineString fromLineStringType(LineStringType lineStringType) {
    return gmlTypeConverter.fromLineStringTypeInternal(lineStringType);
  }

  protected LineString fromLineStringTypeInternal(LineStringType lineStringType) {
    int srid = extractSrid(lineStringType.getSrsName());
    LineString lineString = geometryFactory.createLineString(toCoordinateSequenceInternal(lineStringType.getPosList().getValue(), lineStringType.getSrsDimension(), srid));
    lineString.setSRID(srid);
    return lineString;
  }

  public static LineString fromLineStringType(LineStringType lineStringType, AbstractGeometryType parent) {
    return gmlTypeConverter.fromLineStringTypeInternal(lineStringType, parent);
  }

  protected LineString fromLineStringTypeInternal(LineStringType lineStringType, AbstractGeometryType parent) {
    int srid = lineStringType.getSrsName() != null ? extractSrid(lineStringType.getSrsName()) : extractSrid(parent.getSrsName());
    BigInteger dimension = lineStringType.getSrsDimension() != null ? lineStringType.getSrsDimension() : parent.getSrsDimension();
    LineString lineString = geometryFactory.createLineString(toCoordinateSequenceInternal(lineStringType.getPosList().getValue(), dimension, srid));
    lineString.setSRID(srid);
    return lineString;
  }

  public static Polygon fromPolygonType(PolygonType polygonType) {
    return gmlTypeConverter.fromPolygonTypeInternal(polygonType);
  }

  protected Polygon fromPolygonTypeInternal(PolygonType polygonType) {
    int srid = extractSrid(polygonType.getSrsName());
    LinearRingType exteriorRing = (LinearRingType) polygonType.getExterior().getAbstractRing().getValue();
    LinearRing exterior = geometryFactory.createLinearRing(toCoordinateSequenceInternal(exteriorRing.getPosList().getValue(), polygonType.getSrsDimension(), srid));
    LinearRing[] interiorArray = new LinearRing[polygonType.getInterior().size()];
    for(int i = 0; i < interiorArray.length; i++) {
      LinearRingType interiorRing = (LinearRingType) polygonType.getInterior().get(i).getAbstractRing().getValue();
      interiorArray[i] = geometryFactory.createLinearRing(toCoordinateSequenceInternal(interiorRing.getPosList().getValue(), polygonType.getSrsDimension(), srid));
    }
    Polygon polygon = geometryFactory.createPolygon(exterior, interiorArray);
    polygon.setSRID(srid);
    return polygon;
  }

  public static Polygon fromPolygonType(PolygonType polygonType, AbstractGeometryType parent) {
    return gmlTypeConverter.fromPolygonTypeInternal(polygonType, parent);
  }

  protected Polygon fromPolygonTypeInternal(PolygonType polygonType, AbstractGeometryType parent) {
    int srid = polygonType.getSrsName() != null ? extractSrid(polygonType.getSrsName()) : extractSrid(parent.getSrsName());
    BigInteger dimension = polygonType.getSrsDimension() != null ? polygonType.getSrsDimension() : parent.getSrsDimension();
    LinearRingType exteriorRing = (LinearRingType) polygonType.getExterior().getAbstractRing().getValue();
    LinearRing exterior = geometryFactory.createLinearRing(toCoordinateSequenceInternal(exteriorRing.getPosList().getValue(), dimension, srid));
    LinearRing[] interiorArray = new LinearRing[polygonType.getInterior().size()];
    for(int i = 0; i < interiorArray.length; i++) {
      LinearRingType interiorRing = (LinearRingType) polygonType.getInterior().get(i).getAbstractRing().getValue();
      interiorArray[i] = geometryFactory.createLinearRing(toCoordinateSequenceInternal(interiorRing.getPosList().getValue(), dimension, srid));
    }
    Polygon polygon = geometryFactory.createPolygon(exterior, interiorArray);
    polygon.setSRID(srid);
    return polygon;
  }

  public static MultiPoint fromMultiPointType(MultiPointType multiPointType) {
    return gmlTypeConverter.fromMultiPointTypeInternal(multiPointType);
  }

  protected MultiPoint fromMultiPointTypeInternal(MultiPointType multiPointType) {
    List<PointPropertyType> pointMember = multiPointType.getPointMember();
    Point[] pointArray = new Point[pointMember.size()];
    for(int i = 0; i < pointArray.length; i++) {
      pointArray[i] = fromPointTypeInternal(pointMember.get(i).getPoint(), multiPointType);
    }
    MultiPoint multiPoint = geometryFactory.createMultiPoint(pointArray);
    multiPoint.setSRID(extractSrid(multiPointType.getSrsName()));
    return multiPoint;
  }

  public static MultiLineString fromMultiCurveType(MultiCurveType multiCurveType) {
    return gmlTypeConverter.fromMultiCurveTypeInternal(multiCurveType);
  }

  protected MultiLineString fromMultiCurveTypeInternal(MultiCurveType multiCurveType) {
    List<CurvePropertyType> curveMember = multiCurveType.getCurveMember();
    LineString[] lineStringArray = new LineString[curveMember.size()];
    for(int i = 0; i < lineStringArray.length; i++) {
      LineStringType member = (LineStringType) curveMember.get(i).getAbstractCurve().getValue();
      lineStringArray[i] = fromLineStringTypeInternal(member, multiCurveType);
    }
    MultiLineString multiLineString = geometryFactory.createMultiLineString(lineStringArray);
    multiLineString.setSRID(extractSrid(multiCurveType.getSrsName()));
    return multiLineString;
  }

  public static MultiPolygon fromMultiSurfaceType(MultiSurfaceType multiSurfaceType) {
    return gmlTypeConverter.fromMultiSurfaceTypeInternal(multiSurfaceType);
  }

  protected MultiPolygon fromMultiSurfaceTypeInternal(MultiSurfaceType multiSurfaceType) {
    List<SurfacePropertyType> surfaceMember = multiSurfaceType.getSurfaceMember();
    Polygon[] polygonArray = new Polygon[surfaceMember.size()];
    for(int i = 0; i < polygonArray.length; i++) {
      PolygonType member = (PolygonType) surfaceMember.get(i).getAbstractSurface().getValue();
      polygonArray[i] = fromPolygonTypeInternal(member, multiSurfaceType);
    }
    MultiPolygon multiPolygon = geometryFactory.createMultiPolygon(polygonArray);
    multiPolygon.setSRID(extractSrid(multiSurfaceType.getSrsName()));
    return multiPolygon;
  }
  
  


  // Util

  public static DirectPositionType toDirectPositionType(double x, double y) {
    return gmlTypeConverter.toDirectPositionTypeInternal(x, y, -1);
  }

  protected DirectPositionType toDirectPositionTypeInternal(double x, double y, int srid) {
    DirectPositionType directPositionType = objectFactory.createDirectPositionType();
    List<Double> coordinateList = directPositionType.getValue();
    if(swapAxes && neReferenceSystems.contains(srid)) {
      coordinateList.add(y);
      coordinateList.add(x);
    } else {
      coordinateList.add(x);
      coordinateList.add(y);
    }
    return directPositionType;
  }

  public static DirectPositionType toDirectPositionType(Coordinate coordinate) {
    return gmlTypeConverter.toDirectPositionTypeInternal(coordinate, -1);
  }

  protected DirectPositionType toDirectPositionTypeInternal(Coordinate coordinate, int srid) {
    DirectPositionType directPositionType = objectFactory.createDirectPositionType();
    List<Double> coordinateList = directPositionType.getValue();
    if(swapAxes && neReferenceSystems.contains(srid)) {
      coordinateList.add(coordinate.y);
      coordinateList.add(coordinate.x);
    } else {
      coordinateList.add(coordinate.x);
      coordinateList.add(coordinate.y);
    }
    if(!Double.isNaN(coordinate.z)) {
      coordinateList.add(coordinate.z);
    }
    return directPositionType;
  }

  public static DirectPositionListType toDirectPositionListType(Coordinate[] coordinates) {
    return gmlTypeConverter.toDirectPositionListTypeInternal(coordinates, -1);
  }

  protected DirectPositionListType toDirectPositionListTypeInternal(Coordinate[] coordinates, int srid) {
    DirectPositionListType directPositionListType = objectFactory.createDirectPositionListType();
    List<Double> coordinateList = directPositionListType.getValue();
    for(Coordinate coordinate : coordinates) {
      if(swapAxes && neReferenceSystems.contains(srid)) {
        coordinateList.add(coordinate.y);
        coordinateList.add(coordinate.x);
      } else {
        coordinateList.add(coordinate.x);
        coordinateList.add(coordinate.y);
      }
      if(!Double.isNaN(coordinate.z)) {
        coordinateList.add(coordinate.z);
      }
    }
    return directPositionListType;
  }

  public static LinearRingType toLinearRingType(LineString lineString) {
    return gmlTypeConverter.toLinearRingTypeInternal(lineString);
  }

  protected LinearRingType toLinearRingTypeInternal(LineString lineString) {
    LinearRingType linearRingType = objectFactory.createLinearRingType();
    linearRingType.setPosList(toDirectPositionListTypeInternal(lineString.getCoordinates(), lineString.getSRID()));
    return linearRingType;
  }

  protected CoordinateSequence toCoordinateSequenceInternal(List<Double> coordinateList, BigInteger bigDimension, int srid) {
    int dimension = 2;
    if(bigDimension != null) {
      dimension = bigDimension.intValue();
    }
    if(dimension != 2 && dimension != 3) {
      throw new IllegalArgumentException("Invalid dimension: " + dimension + ". Allowed dimensions are 2 and 3.");
    }
    if(coordinateList.size() % dimension != 0) {
      throw new IllegalArgumentException("Invalid number of coordinates found in geometry!");
    }

    // Build list of coordinates.
    Coordinate[] coordinates = new Coordinate[coordinateList.size() / dimension];
    for(int i = 0, j = 0; i < coordinates.length; i++, j += dimension) {
      if(swapAxes && neReferenceSystems.contains(srid)) {
        coordinates[i] = new Coordinate(coordinateList.get(j + 1), coordinateList.get(j));
      } else {
        coordinates[i] = new Coordinate(coordinateList.get(j), coordinateList.get(j + 1));
      }
      if(dimension == 3) {
        coordinates[i].z = coordinateList.get(j + 2);
      }
    }
    return geometryFactory.getCoordinateSequenceFactory().create(coordinates);
  }

  private static final Object lockObj = new Object();

  protected static String getId() {
    synchronized (lockObj) {
      return "GM_" + idCounter++;
    }
  }

  /**
   * Nollställ räknaren för testsyften.
   */
  protected static void resetCounter() {
    synchronized (lockObj) {
      idCounter = 1;
    }
  }

  public static boolean isTwoDimensional(Geometry geometry) {
    return Double.isNaN(geometry.getCoordinate().z);
  }

  public static BigInteger getDimension(Geometry geometry) {
    return Double.isNaN(geometry.getCoordinate().z) ? BigInteger.valueOf(2) : BigInteger.valueOf(3);
  }

  public static boolean objectsEquals(Object a, Object b) {
    return (a == b) || (a != null && a.equals(b));
  }

  public static int extractSrid(String epsg) {
    if(epsg == null) {
      throw new IllegalArgumentException("No srsName found in geometry!");
    }
    return Integer.parseInt(epsg.substring(epsg.lastIndexOf(':') + 1));
  }

}
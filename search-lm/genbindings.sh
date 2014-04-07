wsimport -extension -Xnocompile -d src/main/java http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1/fastighet-1.4.wsdl
wsimport -extension -Xnocompile -d src/main/java http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1/adress-1.1.wsdl
wsimport -extension -Xnocompile -d src/main/java http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3/registerbeteckning-3.2.wsdl
wsimport -extension -Xnocompile -d src/main/java -b bindings.xjc http://namespace.lantmateriet.se/distribution/products/address/v2/address-2.0.wsdl
wsimport -extension -Xnocompile -d src/main/java -b bindings.xjc http://namespace.lantmateriet.se/distribution/products/placename/v1/placename-1.1.wsdl
wsimport -extension -Xnocompile -d src/main/java http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1/byggnad-1.3.wsdl


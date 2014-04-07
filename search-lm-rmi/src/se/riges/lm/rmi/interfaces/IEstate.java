package se.riges.lm.rmi.interfaces;

import java.rmi.RemoteException;

/**
 * 
 * @author Per Fahlén - Sweco Position AB
 *
 *Interface for data parameter and return value for Estate over RMI
 *
 */
public interface IEstate extends IinterfaceBase{

	public String getGeometry();
}

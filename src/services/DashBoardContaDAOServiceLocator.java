/**
 * DashBoardContaDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class DashBoardContaDAOServiceLocator extends org.apache.axis.client.Service implements services.DashBoardContaDAOService {

    public DashBoardContaDAOServiceLocator() {
    }


    public DashBoardContaDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DashBoardContaDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DashBoardContaDAO
    private java.lang.String DashBoardContaDAO_address = "http://localhost:8081/DAC_Cadastros/services/DashBoardContaDAO";

    public java.lang.String getDashBoardContaDAOAddress() {
        return DashBoardContaDAO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DashBoardContaDAOWSDDServiceName = "DashBoardContaDAO";

    public java.lang.String getDashBoardContaDAOWSDDServiceName() {
        return DashBoardContaDAOWSDDServiceName;
    }

    public void setDashBoardContaDAOWSDDServiceName(java.lang.String name) {
        DashBoardContaDAOWSDDServiceName = name;
    }

    public services.DashBoardContaDAO getDashBoardContaDAO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DashBoardContaDAO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDashBoardContaDAO(endpoint);
    }

    public services.DashBoardContaDAO getDashBoardContaDAO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.DashBoardContaDAOSoapBindingStub _stub = new services.DashBoardContaDAOSoapBindingStub(portAddress, this);
            _stub.setPortName(getDashBoardContaDAOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDashBoardContaDAOEndpointAddress(java.lang.String address) {
        DashBoardContaDAO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.DashBoardContaDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                services.DashBoardContaDAOSoapBindingStub _stub = new services.DashBoardContaDAOSoapBindingStub(new java.net.URL(DashBoardContaDAO_address), this);
                _stub.setPortName(getDashBoardContaDAOWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DashBoardContaDAO".equals(inputPortName)) {
            return getDashBoardContaDAO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao", "DashBoardContaDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao", "DashBoardContaDAO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DashBoardContaDAO".equals(portName)) {
            setDashBoardContaDAOEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

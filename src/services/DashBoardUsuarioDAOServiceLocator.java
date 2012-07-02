/**
 * DashBoardUsuarioDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class DashBoardUsuarioDAOServiceLocator extends org.apache.axis.client.Service implements services.DashBoardUsuarioDAOService {

    public DashBoardUsuarioDAOServiceLocator() {
    }


    public DashBoardUsuarioDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DashBoardUsuarioDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DashBoardUsuarioDAO
    private java.lang.String DashBoardUsuarioDAO_address = "http://localhost:8081/DAC_Cadastros/services/DashBoardUsuarioDAO";

    public java.lang.String getDashBoardUsuarioDAOAddress() {
        return DashBoardUsuarioDAO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DashBoardUsuarioDAOWSDDServiceName = "DashBoardUsuarioDAO";

    public java.lang.String getDashBoardUsuarioDAOWSDDServiceName() {
        return DashBoardUsuarioDAOWSDDServiceName;
    }

    public void setDashBoardUsuarioDAOWSDDServiceName(java.lang.String name) {
        DashBoardUsuarioDAOWSDDServiceName = name;
    }

    public services.DashBoardUsuarioDAO getDashBoardUsuarioDAO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DashBoardUsuarioDAO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDashBoardUsuarioDAO(endpoint);
    }

    public services.DashBoardUsuarioDAO getDashBoardUsuarioDAO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.DashBoardUsuarioDAOSoapBindingStub _stub = new services.DashBoardUsuarioDAOSoapBindingStub(portAddress, this);
            _stub.setPortName(getDashBoardUsuarioDAOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDashBoardUsuarioDAOEndpointAddress(java.lang.String address) {
        DashBoardUsuarioDAO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.DashBoardUsuarioDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                services.DashBoardUsuarioDAOSoapBindingStub _stub = new services.DashBoardUsuarioDAOSoapBindingStub(new java.net.URL(DashBoardUsuarioDAO_address), this);
                _stub.setPortName(getDashBoardUsuarioDAOWSDDServiceName());
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
        if ("DashBoardUsuarioDAO".equals(inputPortName)) {
            return getDashBoardUsuarioDAO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao", "DashBoardUsuarioDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao", "DashBoardUsuarioDAO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DashBoardUsuarioDAO".equals(portName)) {
            setDashBoardUsuarioDAOEndpointAddress(address);
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

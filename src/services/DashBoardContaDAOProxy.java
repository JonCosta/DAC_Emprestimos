package services;

public class DashBoardContaDAOProxy implements services.DashBoardContaDAO {
  private String _endpoint = null;
  private services.DashBoardContaDAO dashBoardContaDAO = null;
  
  public DashBoardContaDAOProxy() {
    _initDashBoardContaDAOProxy();
  }
  
  public DashBoardContaDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initDashBoardContaDAOProxy();
  }
  
  private void _initDashBoardContaDAOProxy() {
    try {
      dashBoardContaDAO = (new services.DashBoardContaDAOServiceLocator()).getDashBoardContaDAO();
      if (dashBoardContaDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dashBoardContaDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dashBoardContaDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dashBoardContaDAO != null)
      ((javax.xml.rpc.Stub)dashBoardContaDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public services.DashBoardContaDAO getDashBoardContaDAO() {
    if (dashBoardContaDAO == null)
      _initDashBoardContaDAOProxy();
    return dashBoardContaDAO;
  }
  
  public services.DashBoardConta buscarContaUsuario(int idusuario) throws java.rmi.RemoteException{
    if (dashBoardContaDAO == null)
      _initDashBoardContaDAOProxy();
    return dashBoardContaDAO.buscarContaUsuario(idusuario);
  }
  
  
}
package services;

public class DashBoardUsuarioDAOProxy implements services.DashBoardUsuarioDAO {
  private String _endpoint = null;
  private services.DashBoardUsuarioDAO dashBoardUsuarioDAO = null;
  
  public DashBoardUsuarioDAOProxy() {
    _initDashBoardUsuarioDAOProxy();
  }
  
  public DashBoardUsuarioDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initDashBoardUsuarioDAOProxy();
  }
  
  private void _initDashBoardUsuarioDAOProxy() {
    try {
      dashBoardUsuarioDAO = (new services.DashBoardUsuarioDAOServiceLocator()).getDashBoardUsuarioDAO();
      if (dashBoardUsuarioDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dashBoardUsuarioDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dashBoardUsuarioDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dashBoardUsuarioDAO != null)
      ((javax.xml.rpc.Stub)dashBoardUsuarioDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public services.DashBoardUsuarioDAO getDashBoardUsuarioDAO() {
    if (dashBoardUsuarioDAO == null)
      _initDashBoardUsuarioDAOProxy();
    return dashBoardUsuarioDAO;
  }
  
  public int buscarUsuario(services.DashBoardUsuario u) throws java.rmi.RemoteException{
    if (dashBoardUsuarioDAO == null)
      _initDashBoardUsuarioDAOProxy();
    return dashBoardUsuarioDAO.buscarUsuario(u);
  }
  
  
}
package Classes.Proxy_Pattern.example1;

public class ProxyInternetAccess implements OfficeInternetAccess{

    private String employeeName;
    private RealInternetAccess realAccess;
    
    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole() > 4){
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        }else{
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    private int getRole() {
        return 9;
    } 
}

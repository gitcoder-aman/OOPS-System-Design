package Classes.Proxy_Pattern.example1;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Coder Aman");
        access.grantInternetAccess();
    }
}

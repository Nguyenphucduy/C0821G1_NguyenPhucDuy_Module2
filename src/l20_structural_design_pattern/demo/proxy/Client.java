package l20_structural_design_pattern.demo.proxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

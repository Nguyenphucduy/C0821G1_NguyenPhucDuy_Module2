package l20_structural_design_pattern.demo.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to: " + serverHost);
    }
}

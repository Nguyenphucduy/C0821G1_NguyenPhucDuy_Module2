package s22_proxy_pattern;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy("FireFox");
        fileDownloaderProxy.download("abc.com");
        System.out.println("----------");
        fileDownloaderProxy.download("google.com");

        System.out.println("----------");
        fileDownloaderProxy.download("ggg.com");
    }
}

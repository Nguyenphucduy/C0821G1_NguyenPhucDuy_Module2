package l20_structural_design_pattern.demo.s22_proxy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    private String userAgent;

    public FileDownloader(String userAgent) {
        System.out.println("Init");
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url) {
        System.out.println("Download file at URL: " + url + " - userAgent: " + this.userAgent);

//        try {
//            URL u = new URL(url);
//            URLConnection urlConnection = u.openConnection();
////            urlConnection.setRequestProperty("Use");
//
//            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            String outPut = "", current;
//            while ((current = in.readLine())  != null){
//                outPut += current;
//            }
//            System.out.println(outPut);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

//    public static void main(String[] args) {
//        FileDownloader fileDownloader = new FileDownloader("Moliza");
//        fileDownloader.download("https://vnexpress.net/australia-se-tieu-diet-10-000-con-ngua-hoang-4381122.html");
//    }
}

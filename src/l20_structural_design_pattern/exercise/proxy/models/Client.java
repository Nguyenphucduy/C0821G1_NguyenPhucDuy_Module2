package l20_structural_design_pattern.exercise.proxy.models;

import l20_structural_design_pattern.exercise.proxy.service.Downloader;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("google.com","proxy.csv");
    }
}

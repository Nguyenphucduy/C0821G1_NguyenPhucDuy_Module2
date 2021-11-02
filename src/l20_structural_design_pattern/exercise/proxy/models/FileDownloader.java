package l20_structural_design_pattern.exercise.proxy.models;

import l20_structural_design_pattern.exercise.proxy.service.Downloader;

public class FileDownloader implements Downloader {
    private String UserAgent;

    public FileDownloader(String userAgent) {
        UserAgent = userAgent;
    }

    @Override
    public void download(String URL,String path) {
        System.out.println("doing connection to : " + URL);
        System.out.println("doing downloading : " + path);
    }
}

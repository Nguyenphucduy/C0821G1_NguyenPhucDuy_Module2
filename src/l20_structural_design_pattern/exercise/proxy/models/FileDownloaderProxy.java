package l20_structural_design_pattern.exercise.proxy.models;

import l20_structural_design_pattern.exercise.proxy.service.Downloader;

public class FileDownloaderProxy implements Downloader {
    FileDownloader fileDownloader = new FileDownloader("FireFox"); // không cần truyền tham số User-Agent nữa

    @Override
    public void download(String URL,String path) {
        fileDownloader.download(URL,path);
    }
}

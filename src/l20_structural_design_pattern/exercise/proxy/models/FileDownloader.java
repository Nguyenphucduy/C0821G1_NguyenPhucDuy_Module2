package l20_structural_design_pattern.exercise.proxy.models;

import l20_structural_design_pattern.exercise.proxy.service.Downloader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String UserAgent;

    public FileDownloader(String userAgent) {
        UserAgent = userAgent;
    }

    @Override
    public void download(String URL, String path) throws IOException {
        System.out.println("doing connection to : " + URL + " " + this.UserAgent);
        System.out.println("doing downloading : " + path + " " + this.UserAgent);
    }
}

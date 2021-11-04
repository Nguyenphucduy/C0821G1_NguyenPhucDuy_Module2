package l20_structural_design_pattern.exercise.proxy.service;

import java.io.IOException;
import java.net.MalformedURLException;

public interface Downloader {
    void download(String URL,String path) throws IOException;
}

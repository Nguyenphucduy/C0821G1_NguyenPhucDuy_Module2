package review.week5.service;

import review.week5.model.Candidate;

import java.io.IOException;
import java.util.List;

public interface IFileService {
    void writeBuffer(Candidate candidate, String path) throws IOException;
    List<String[]> readCSV( String path) throws IOException;
}

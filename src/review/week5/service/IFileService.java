package review.week5.service;

import review.week5.model.Candidate;

import java.io.IOException;
import java.util.List;

public interface IFileService {
    void writeBuffer(Candidate candidate) throws IOException;
    List<Candidate> readCSV(List<Candidate> candidatesList) throws IOException;
}

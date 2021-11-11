package review.week5.service;

import review.week5.model.Candidate;

import java.io.IOException;
import java.util.List;

public interface ICandidateService {
    void showAll();
    void search();
    void remove();
    void sort();
}

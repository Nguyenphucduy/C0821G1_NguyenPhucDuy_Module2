package review.week5.service.impl;

import review.week5.model.Candidate;

import java.util.Comparator;

public class SortCandidateByYearOfBirth implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}

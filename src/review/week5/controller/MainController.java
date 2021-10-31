package review.week5.controller;

import review.week5.model.Candidate;
import review.week5.service.impl.CandidateService;
import review.week5.service.impl.FileService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) throws IOException {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        CandidateService candidateService = new CandidateService();
        FileService fileService = new FileService();
        while (check) {
            System.out.println("Candidate management system:");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern ");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    candidateService.addExperience();
                    break;
                case 2:
                    candidateService.addFresher();
                    break;
                case 3:
                    candidateService.addIntern();
                    break;
                case 4:
                    candidateService.search();
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
        List<Candidate> candidateList = fileService.readCSV(candidateService.getCandidateList());
        for (Candidate candidate : candidateList) {
            System.err.println(candidate);
        }
    }
}

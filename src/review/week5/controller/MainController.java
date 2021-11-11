package review.week5.controller;

import review.week5.model.Candidate;
import review.week5.service.impl.CandidateService;
import review.week5.common.FileWriteRead;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) throws IOException {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        CandidateService candidateService = new CandidateService();
        FileWriteRead fileService = new FileWriteRead();
        try {
            while (check) {
                System.out.println("Candidate management system:");
                System.out.println("1. Experience");
                System.out.println("2. Fresher");
                System.out.println("3. Intern ");
                System.out.println("4. Search");
                System.out.println("5. Read File .csv");
                System.out.println("6. DisPlay list");
                System.out.println("7. Remove ");
                System.out.println("8. Sort");
                System.out.println("9. Exit");
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
                        List<Candidate> experienceList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\experience.csv");
                        System.err.println("ex------------------------------------------------------------------");
                        for (Candidate experience : experienceList) {
                            System.err.println(experience);
                        }
                        List<Candidate> fresherList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\fresher.csv");
                        System.err.println("fr------------------------------------------------------------------");
                        for (Candidate fresher : fresherList) {
                            System.err.println(fresher);
                        }
                        List<Candidate> internList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\intern.csv");
                        System.err.println("in-------------------------------------------------------------------");
                        for (Candidate intern : internList) {
                            System.err.println(intern);
                        }
                        break;
                    case 6:
                        candidateService.showAll();
                        break;
                    case 7:
                        candidateService.remove();
                        break;
                    case 8:
                        candidateService.sort();
                        break;
                    case 9:
                        check = false;
                        break;
                }
            }
        }catch (Exception exception){
            System.err.println( "Error");
        }
    }
}

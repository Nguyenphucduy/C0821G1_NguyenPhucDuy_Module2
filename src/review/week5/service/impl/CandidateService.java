package review.week5.service.impl;

import review.week5.model.Candidate;
import review.week5.model.Experience;
import review.week5.model.Fresher;
import review.week5.model.Intern;
import review.week5.service.*;
import review.week5.utils.Validate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateService implements ICandidateService, IExperienceService, IFresherService, IInternService {

    private List<Candidate> candidateList;

    public CandidateService(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public CandidateService() {
        this.candidateList = new ArrayList<>();
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    FileService fileService = new FileService();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addExperience() throws IOException {
        String choice;
        do {
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
            switch (choice) {
                case "Yes":
                    System.out.print("Enter Id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter First Name :");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name :");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter address :");
                    String address = scanner.nextLine();
                    int birthDay = Validate.inputYearOfBirth();
                    String email = Validate.inputEmail();
                    String phone = Validate.inputPhone();
                    int expInYear = Validate.checkExpInYear();
                    System.out.print("Enter Pro Skill : ");
                    String proSkill = scanner.nextLine();
                    Experience experience = new Experience(id, firstName, lastName, birthDay, address, phone, email, expInYear, proSkill);
                    fileService.writeBuffer(experience, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\experience.csv");
                    candidateList.add(experience);
                    System.out.println("Completed");
                    break;
                case "No":
                    break;
            }
        } while (!choice.equals("No"));
        showAll();
    }

    @Override
    public void addFresher() throws IOException {
        String choice;
        do {
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
            switch (choice) {
                case "Yes":
                    System.out.print("Enter Id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter First Name :");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name :");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter address :");
                    String address = scanner.nextLine();
                    int yearOfBirth = Validate.inputYearOfBirth();
                    String email = Validate.inputEmail();
                    String phone = Validate.inputPhone();
                    String graduationRank = Validate.choiceGraduationRank();
                    System.out.print("Enter education : ");
                    String education = scanner.nextLine();
                    System.out.print("Enter graduationDate : ");
                    int graduationDate = Integer.parseInt(scanner.nextLine());
                    Fresher fresher = new Fresher(id, firstName, lastName, yearOfBirth, address, phone, email, graduationDate, graduationRank, education);
                    fileService.writeBuffer(fresher, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\fresher.csv");
                    candidateList.add(fresher);
                    System.out.println("Completed");
                    break;
                case "No":
                    break;
            }
        } while (!choice.equals("No"));
        showAll();

    }

    @Override
    public void addIntern() throws IOException {
        String choice;
        do {
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
            switch (choice) {
                case "Yes":
                    System.out.print("Enter Id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter First Name :");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name :");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter address :");
                    String address = scanner.nextLine();
                    int birthDay = Validate.inputYearOfBirth();
                    String email = Validate.inputEmail();
                    String phone = Validate.inputPhone();
                    System.out.print("Enter majors : ");
                    String majors = scanner.nextLine();
                    System.out.print("Enter semester : ");
                    int semester = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter University Name : ");
                    String universityName = scanner.nextLine();
                    Intern intern = new Intern(id, firstName, lastName, birthDay, address, phone, email, majors, semester, universityName);
                    fileService.writeBuffer(intern, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\intern.csv");
                    candidateList.add(intern);
                    System.out.println("Completed");
                    break;
                case "No":
                    break;
            }
        } while (!choice.equals("No"));
        showAll();

    }

    @Override
    public void showAll() {
        for (Candidate candidate : candidateList) {
            System.out.println(candidate.toString());
        }

    }

    @Override
    public void search() {
        boolean check = true;
        int index = 0;
        System.out.println("Enter First Name or Last Name");
        String name = scanner.nextLine();
        for (int i = 0; i < candidateList.size(); i++) {
            if (candidateList.get(i).getFirstName().equals(name)) {
                check = true;
                index = i;
                System.out.println(candidateList.get(i));
            } else if (candidateList.get(i).getLastName().equals(name)) {
                System.out.println(candidateList.get(i));
                index = i;
                check = true;
            }else {
                check = false;
            }
        }
        if (check){
            System.out.println(candidateList.get(index));
        }else {
            System.err.println("Not found");
        }
    }
}


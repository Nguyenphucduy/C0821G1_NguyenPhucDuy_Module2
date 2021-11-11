package review.week5.service.impl;

import review.week5.common.FileWriteRead;
import review.week5.model.Candidate;
import review.week5.model.Experience;
import review.week5.model.Fresher;
import review.week5.model.Intern;
import review.week5.service.*;
import review.week5.common.Validate;

import java.io.*;
import java.util.*;

public class CandidateService implements ICandidateService, IExperienceService, IFresherService, IInternService {

    private List<Candidate> candidateList;

    public CandidateService(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public CandidateService() throws IOException {
        this.candidateList = new ArrayList<>();
        candidateList.addAll(fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\experience.csv"));
        candidateList.addAll(fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\fresher.csv"));
        candidateList.addAll(fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\intern.csv"));
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    FileWriteRead fileService = new FileWriteRead();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addExperience() throws IOException {
        String choice;
        do {
            String id = Validate.inputID();
            System.out.print("Enter First Name :");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name :");
            String lastName = scanner.nextLine();
            System.out.print("Enter address :");
            String address = scanner.nextLine();
            int birthDay = Validate.inputYearOfBirth();
            String email = Validate.inputEmail();
            String phone = Validate.inputPhone();
            int expInYear = Validate.inputExpInYear();
            System.out.print("Enter Pro Skill : ");
            String proSkill = scanner.nextLine();
            Experience experience = new Experience(id, firstName, lastName, birthDay, address, phone, email, expInYear, proSkill);
            fileService.writeBuffer(experience, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\experience.csv");
            candidateList.add(experience);
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
        } while (!choice.equals("No"));
        System.out.println("Completed-----------------------------------------");
        showAll();
    }


    @Override
    public void addFresher() throws IOException {
        String choice;
        do {
            String id = Validate.inputID();
            System.out.print("Enter the first Name :");
            String firstName = scanner.nextLine();
            System.out.print("Enter the last Name :");
            String lastName = scanner.nextLine();
            System.out.print("Enter the address :");
            String address = scanner.nextLine();
            int yearOfBirth = Validate.inputYearOfBirth();
            String email = Validate.inputEmail();
            String phone = Validate.inputPhone();
            String graduationRank = Validate.inputGraduationRank();
            System.out.print("Enter the university name : ");
            String education = scanner.nextLine();
            System.out.print("Enter the graduation date : ");
            int graduationDate = Integer.parseInt(scanner.nextLine());
            Fresher fresher = new Fresher(id, firstName, lastName, yearOfBirth, address, phone, email, graduationDate, graduationRank, education);
            fileService.writeBuffer(fresher, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\fresher.csv");
            candidateList.add(fresher);
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
        } while (!choice.equals("No"));
        System.out.println("Completed---------------------------------------------");
        showAll();
    }

    @Override
    public void addIntern() throws IOException {
        String choice;
        do {
            String id = Validate.inputID();
            System.out.print("Enter the first Name :");
            String firstName = scanner.nextLine();
            System.out.print("Enter the last Name :");
            String lastName = scanner.nextLine();
            System.out.print("Enter the address :");
            String address = scanner.nextLine();
            int birthDay = Validate.inputYearOfBirth();
            String email = Validate.inputEmail();
            String phone = Validate.inputPhone();
            System.out.print("Enter the majors : ");
            String majors = scanner.nextLine();
            System.out.print("Enter the semester : ");
            int semester = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the university Name : ");
            String universityName = scanner.nextLine();
            Intern intern = new Intern(id, firstName, lastName, birthDay, address, phone, email, majors, semester, universityName);
            fileService.writeBuffer(intern, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\review\\week5\\data\\intern.csv");
            candidateList.add(intern);
            System.out.println(" Do you want to continue (Yes/No)?");
            choice = scanner.nextLine();
        } while (!choice.equals("No"));
        System.out.println("Completed-------------------------------");
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
        System.out.print("Enter First Name or Last Name : ");
        String name = scanner.nextLine();
        for (int i = 0; i < candidateList.size(); i++) {
            // contain() tìm kiếm 1 phần
            if (candidateList.get(i).getFirstName().contains(name) || candidateList.get(i).getLastName().contains(name)) {
                index = i;
                check = true;
                break; // nếu ko break hắn sẽ chạy đến phần tử cuối cùng
            } else {
                check = false;
            }
        }
        if (!check) {
            System.err.println("Not found");
        } else {
            System.out.println("searched ---------------------------------------------");
            System.out.println(candidateList.get(index));
        }
    }

    @Override
    public void remove() {
        System.out.println("list of Candidate Start  ---------------------------- ");
        for (int i = 0; i < candidateList.size(); i++) {
            System.out.println(candidateList.get(i));
        }
        System.out.println("list of Candidate End   ---------------------------- ");
        System.out.print("Enter the id you want remove : ");
        String id = scanner.nextLine();
        Candidate candidateFix = null;
        for (Candidate candidate : candidateList) {
            if (id.equals(candidate.getId())) {
                candidateFix = candidate;
            }
        }
        candidateList.remove(candidateFix);
        System.out.println("Remove done ----------------------------");
    }

    @Override
    public void sort() {
        boolean check = true;
        while (check) {
            System.out.println("Enter the criteria you want to sort");
            System.out.println("1. Sort with id");
            System.out.println("2. Sort with year of birth ");
            System.out.println("3. Return the menu ");
            System.out.print(" Enter the choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Collections.sort(candidateList, new SortCandidateByID());
                    System.out.println("list of your -----------------------");
                    showAll();
                    break;
                case 2:
                    Collections.sort(candidateList, new SortCandidateByYearOfBirth());
                    System.out.println("list of your -----------------------");
                    showAll();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("no choice");
                    break;
            }
        }
    }
}


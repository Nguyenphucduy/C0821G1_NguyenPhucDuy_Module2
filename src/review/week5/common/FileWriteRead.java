package review.week5.common;

import review.week5.model.Candidate;
import review.week5.model.Experience;
import review.week5.model.Fresher;
import review.week5.model.Intern;
import review.week5.service.IFileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements IFileService {
    @Override
    public void writeBuffer(Candidate candidate, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);// true tránh việc ghi đè
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(candidate.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Override
    public List<Candidate> readBuffer(String path) throws IOException {
        List<Candidate> candidateList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Candidate experience;
            Candidate fresher;
            Candidate intern;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 9) {
                    experience = new Experience(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]), temp[8]);
                    candidateList.add(experience);
                } else if (temp.length == 10) {
                    if (temp[0].equals("11")){
                        fresher = new Fresher(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]), temp[8], temp[9]);candidateList.add(fresher);
                        candidateList.add(fresher);
                    }else if (temp[0].equals("22")){
                        intern = new Intern(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6],(temp[7]), Integer.parseInt(temp[8]), temp[9]);
                        candidateList.add(intern);
                    }
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return candidateList;
    }
}

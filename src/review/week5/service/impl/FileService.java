package review.week5.service.impl;

import review.week5.model.Candidate;
import review.week5.model.Experience;
import review.week5.model.Fresher;
import review.week5.service.IFileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService implements IFileService {
    @Override
    public void writeBuffer(Candidate candidate,String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);// true tránh việc ghi đè
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(candidate.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Override
    public List<String[]> readCSV(String path) throws IOException {
        List<String[]> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
//            Candidate experience;
//            Candidate fresher;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
//                experience = new Experience(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]), temp[8]);
////                fresher = new Fresher(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]), temp[8],temp[9]);
//                candidatesList.add(experience);
//                candidatesList.add(fresher);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close(); // close buffer - > tự động close FileRead
        }
        return list;
    }
}

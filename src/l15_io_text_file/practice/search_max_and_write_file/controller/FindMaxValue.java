package l15_io_text_file.practice.search_max_and_write_file.controller;

import l15_io_text_file.practice.search_max_and_write_file.model.ReadAndWriteFile;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\practice\\search_max_and_write_file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\practice\\search_max_and_write_file\\controller\\result.txt", maxValue);
    }
}

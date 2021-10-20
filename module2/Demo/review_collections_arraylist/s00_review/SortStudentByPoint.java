package s00_review;

import java.util.Comparator;

public class SortStudentByPoint implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        double result = o1.getPoint() - o2.getPoint();
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

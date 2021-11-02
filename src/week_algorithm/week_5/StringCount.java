package week_algorithm.week_5;

import java.util.HashSet;
import java.util.Set;

public class StringCount {
    int differentSubstringsTrie2(String inputStr) {
        inputStr+= " ";
        Set<String> set = new HashSet<String>();
        for(int i=1;i<inputStr.length();i++)
            for(int j=0;j<inputStr.length()-i;j++)
                set.add(inputStr.substring(j,j+i));
        return set.size();
    }
}

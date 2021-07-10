package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSubsequence {

    public static List<String> getSubsequences(String str) {
        if (str.length() == 0) {
            List<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        char c = str.charAt(0);
        String rest = str.substring(1);
        List<String> res = getSubsequences(rest);

        List<String> result = new ArrayList<>();
        for (String s : res) {
            result.add("" + s);
            result.add(c + s);
        }
        return result;
    }
}

package Recursion;

import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoardSequence {
    static String[] seqMap = {"0","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static List<String> keySeq(String str) {
        if (str.length() == 0) {
            List<String> seq = new ArrayList<>();
            seq.add("");
            return seq;
        }
        char first = str.charAt(0);
        List<String> ret = keySeq(str.substring(1));
        List<String> result = new ArrayList<>();
        String charSeq = seqMap[first - '0'];
        for (String s : ret) {
            for (int i = 0; i < charSeq.length(); i++) {
                result.add(charSeq.charAt(i) + s);
            }
        }
        return result;
    }
}

package myPackage.datastructure;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();

        Arrays.sort(strs);

        String s = strs[0];
        String l = strs[strs.length - 1];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == l.charAt(i)) {
                prefix.append(s.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }

    public static String verticalScanningLCP(String[] strs){

        if(strs == null || strs.length == 0)
            return "";

        for(int i=0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


    public static void main(String[] args) {

        String[] strs = {"flower", "flow","flight"};

        System.out.println(verticalScanningLCP(strs));
    }
}

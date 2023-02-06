package myPackage.datastructure;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        String[] strs = s.split("\s+");
        int l = strs.length;

        String lastStr = strs[l-1];
        return lastStr.length();
    }

    public static void main(String[] args) {

        String s ="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}

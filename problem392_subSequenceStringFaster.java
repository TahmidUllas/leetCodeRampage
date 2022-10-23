public class problem392_subSequenceStringFaster {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int count = 0;
        for (char charOf2 : tArr) {
            if (charOf2 == sArr[count]) count++;
            if (count == sArr.length) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "aabbcc"));
        System.out.println(isSubsequence("abc", "cabaa"));
        System.out.println(isSubsequence("abc", "acvcbc"));
        System.out.println(isSubsequence("", "bbaa"));
        System.out.println(isSubsequence("aaaa", ""));
        System.out.println(isSubsequence("aaaa", "bbaa"));
        System.out.println(isSubsequence("aaaa", "baaaab"));
    }
}

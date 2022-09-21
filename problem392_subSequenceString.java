
public class problem392_subSequenceString {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        boolean flag = false;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cnt >= t.length()) return false;
            for (int j = cnt; j < t.length(); j++) {
                if (sArr[i] == tArr[j]) {
                    flag = true;
                    cnt = j;
                    cnt++;
                    break;
                } else if (j == tArr.length - 1 && sArr[i] != tArr[j]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        return flag;
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

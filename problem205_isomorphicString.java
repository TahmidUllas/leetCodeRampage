import java.util.HashMap;
import java.util.Map;

public class problem205_isomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == 1) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(sArr[i])) {
                if (map.containsValue(tArr[i])) {
                    return false;
                }
                map.put(sArr[i], tArr[i]);
            } else if (map.get(sArr[i]) != tArr[i]) {
                return false;
            }
            tArr[i] = map.get(sArr[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("paper", "ttile"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

}

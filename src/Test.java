import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s = "xabacabad";
        System.out.println(method(s));
    }
    
    static char method(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        char res = '_';
        for (char c:chars) {
            if (map.containsKey(c)) {
                int integer = Integer.valueOf(map.get(c));
                integer++;
                map.put(c,integer);
            } else {
                map.put(c,1);
            }
        }

        map.entrySet().forEach(e -> {
            if (e.getValue() == 1) {
                list.add( e.getKey().charValue());
            }
        });

        if (list.size() != 0) {
            return list.get(0);
        }
        return res;
    }
}
// найти символ в строке который первый не повторяется
// tolowercase
// если такого символа нет вернут "_"

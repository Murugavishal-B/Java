package Problems.Method1;
import java.util.HashMap;
import java.util.Map;
public class RomanToInt {

    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                num -= m.get(s.charAt(i));
            } else {
                num += m.get(s.charAt(i));
            }
        }

        return num;
    }

    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        String s = "MCMXCIV"; // Example Roman numeral
        int result = converter.romanToInt(s);
        System.out.println("The integer value of " + s + " is: " + result);
    }
}

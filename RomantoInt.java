
import java.util.HashMap;

public class RomantoInt {
    public static int romanToInt(String s){
        HashMap<Character,Integer> a = new HashMap<>();
        a.put('I', 1);
        a.put('V', 5);
        a.put('X',10);
        a.put('L', 50);
        a.put('C', 100);
        a.put('D', 500);
        a.put('M', 1000);

        int result = 0;
        int preValue = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            int presentValue = a.get(s.charAt(i));

            if (presentValue < preValue) {
                result -= presentValue;
            } else {
                result += presentValue;
            }

            preValue = presentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); 
        System.out.println(romanToInt("IV")); 
        System.out.println(romanToInt("IX")); 
    }
}

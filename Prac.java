import java.util.*;

public class Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "ana";
        String s2 = "nua";

        Map<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!mpp.containsKey(ch) || mpp.get(ch)==0){
                System.out.println(false);
                return;
            }
            mpp.put(ch, mpp.get(ch)-1);
        }
        System.out.println(true);
    }
}
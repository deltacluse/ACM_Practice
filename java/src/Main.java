import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        in = in.trim();
        if(in.isEmpty()) {
            System.out.println(0);
        }
        else {
            int count = 1;
            for(int i=1; i<in.length(); i++) {
                if(in.charAt(i) == ' ' && in.charAt(i+1) != ' ')
                    count++;
            }
            System.out.println(count);
        }
    }
}
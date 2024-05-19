package Day1;

import java.util.*;

public class Advice {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String list[] = {"Option A", "Option B", "Option C", "Option D"};
        String qn = Sc.nextLine();
        while(!qn.equalsIgnoreCase("quit")) {
            int r = new Random().nextInt(list.length);
            System.out.println(list[r]);
            qn = Sc.nextLine();
        }
    }
}

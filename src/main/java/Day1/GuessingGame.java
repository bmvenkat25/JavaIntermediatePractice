package Day1;
import com.sun.deploy.util.StringUtils;

import java.util.*;
public class GuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner Sc = new Scanner(System.in);
        int x = random.nextInt(100);
        while(true){
            System.out.println("Guess the number : ");
            int n = Sc.nextInt();
            if(n == x) {
                System.out.println("Success");
                break;
            }
            else if(n>x)
                System.out.println("Too high, Try again !");
            else if(n<x)
                System.out.println("Too low, Try again !");
        }

    }
}

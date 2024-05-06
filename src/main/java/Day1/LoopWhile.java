package Day1;
import java.util.*;
public class LoopWhile {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = Sc.nextInt();
        System.out.println("Enter last number : ");
        int lastNumber = Sc.nextInt();
        while(firstNumber<=lastNumber)
        {
            System.out.println(firstNumber);
            firstNumber ++;
        }
    }
}

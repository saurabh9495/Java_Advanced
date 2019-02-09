package problems;
import java.lang.Math;
import java.util.Scanner;

public class problem7 {
    public problem7(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and exponet");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(Math.pow(a,b));
    }
}

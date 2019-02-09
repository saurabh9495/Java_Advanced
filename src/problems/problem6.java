package problems;
import java.util.Arrays;
import java.util.Scanner;

public class problem6 {
    public problem6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        Arrays.sort(array);
        System.out.println("largest number = "+array[n-1]+" Smallest number = "+array[0]);
    }
}

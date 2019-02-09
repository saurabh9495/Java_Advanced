package problems;

import java.util.Scanner;

public class pattern5 {
    public pattern5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of Square");
        int h = in.nextInt();
        System.out.println("Enter the width of Square");
        int w = in.nextInt();
        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                System.out.print("B");
            }
            System.out.println();
        }
    }
}

package problems;

public class problem9 {
    problem9(){
        for(int i=0;i<7;i++){
            for(int j=0;j<6-i;j++){
                System.out.print(" ");
            }
            for(int j=6-i;j<8+i;j++){
                System.out.print("$");
            }
            for(int j=7+i;j<14;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

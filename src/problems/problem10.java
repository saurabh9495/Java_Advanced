package problems;

public class problem10 {
    public problem10(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            System.out.print("#");
            for(int j=7-i;j<7+i;j++){
                System.out.print(" ");
            }
            System.out.print(("#"));
            for(int j=7+i;j<14;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int j=0;j<16;j++){
            System.out.print("#");
        }
    }
}

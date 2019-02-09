package problems;

public class pattern1 {
    public pattern1(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=6-i;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

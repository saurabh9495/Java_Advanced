package problems;

public class pattern2 {
    public pattern2(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}

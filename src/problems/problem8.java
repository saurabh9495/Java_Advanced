package problems;

public class problem8 {
    public problem8(){
        int multiplication =1;
        int sum =0;
        for(int i=1;i<=100;i++){
            if(i<20 && i%2==1){
                multiplication*=i;
            }
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Multiplication = "+multiplication+" Sum = "+sum);
    }
}

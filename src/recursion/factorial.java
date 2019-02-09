package recursion;

public class factorial {
    private int fact;

    public factorial(){
        this.fact = factorial(5);
    }

    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
    }
    public int getFact(){
        return this.fact;
    }
}

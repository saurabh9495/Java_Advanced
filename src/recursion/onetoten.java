package recursion;

public class onetoten {
    public onetoten(){
        printnumbers(10);
    }
    public void printnumbers(int num){
        if (num==0){
            return;
        }
        else {
            System.out.println(num);
            printnumbers(num-1);
        }
    }
}

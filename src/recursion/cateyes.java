package recursion;

public class cateyes {
    public cateyes(){
        System.out.println("Cats Eyes = "+cateyes(1));
    }
    public static int cateyes(int cats){
        if(cats ==0){
            return 0;
        }
        else {
            return 2 + cateyes(cats -1);
        }
    }
}

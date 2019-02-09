package meanstack;

public class programmer extends developer{
    private boolean c;
    private boolean cplusplus;
    private boolean java;
    private boolean python;


    public programmer(String angular, String react, String docker, String kubernetes, boolean c, boolean cplusplus, boolean java, boolean python ) {
        super(angular, react, docker, kubernetes);
        this.c = c;
        this.cplusplus = cplusplus;
        this.java = java;
        this.python = python;
    }

    public void setC(boolean c){
        this.c = c;
    }
    public void setCplusplus(boolean cplusplus){
        this.cplusplus = cplusplus;
    }
    public void setJava(boolean java){
        this.java = java;
    }
    public void setPython(boolean python){
        this.python = python;
    }

    public boolean getC(){
        return this.c;
    }
    public boolean getCplusplus(){
        return this.cplusplus;
    }
    public boolean getJava(){
        return this.java;
    }
    public boolean getPython(){
        return this.python;
    }
}

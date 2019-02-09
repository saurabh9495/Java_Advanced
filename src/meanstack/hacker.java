package meanstack;

public class hacker extends programmer {
    private int kali;
    private int burpsuite;
    private int metasploit;
    private int gcp;


    public hacker(String angular, String react, String docker, String kubernetes, boolean c, boolean cplusplus, boolean java, boolean python, int kali, int burpsuite, int metasploit, int gcp) {
        super(angular, react, docker, kubernetes, c, cplusplus, java, python);
        this.kali = kali;
        this.burpsuite = burpsuite;
        this.metasploit = metasploit;
        this.gcp = gcp;
    }

    public void setKali(int kali){
        this.kali = kali;
    }
    public void setBurpsuite(int burpsuite){
        this.burpsuite = burpsuite;
    }
    public void setMetasploit(int metasploit){
        this.metasploit = metasploit;
    }
    public void setGcp(int gcp){
        this.gcp = gcp;
    }

    public int getKali(){
        return this.kali;
    }
    public int getBurpsuite(){
        return this.burpsuite;
    }
    public int getMetasploit(){
        return this.metasploit;
    }
    public int getGcp(){
        return this.gcp;
    }
}

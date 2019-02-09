package meanstack;

public class developer {
    private String angular = "";
    private String react = "";
    private String docker = "";
    private String kubernetes = "";

    public developer(String angular,String react, String docker, String kubernetes){
        this.angular = angular;
        this.react = react;
        this.docker = docker;
        this.kubernetes = kubernetes;
    }

    public void setAngular(String angular){
        this.angular = angular;
    }
    public void setReact(String react){
        this.react = react;
    }
    public void setDocker(String docker){
        this.docker = docker;
    }
    public void setKubernetes(String kubernetes){
        this.kubernetes = kubernetes;
    }

    public String getAngular(){
        return this.angular;
    }
    public String getReact(){
        return this.react;
    }
    public String getDocker(){
        return this.docker;
    }
    public String getKubernetes(){
        return this.kubernetes;
    }
}

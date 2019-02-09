package meanstack;

import java.util.Scanner;

public class main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the traits you have as a developer");
        System.out.println("Do you know angular if yes, write in brief otherwise write no");
        String angular = in.nextLine();
        System.out.println("Do you know react if yes, write in brief otherwise write no");
        String react = in.nextLine();
        System.out.println("Do you know docker if yes, write in brief otherwise write no");
        String docker = in.nextLine();
        System.out.println("Do you know kubernetes if yes, write in brief otherwise write no");
        String kubernetes = in.nextLine();
        System.out.println("Now lets see what traits do you posses as a programmer");
        System.out.println("Do you know c if yes, write true otherwise write false");
        boolean c = in.nextBoolean();
        System.out.println("Do you know c++ if yes, write true brief otherwise write false");
        boolean cplusplus = in.nextBoolean();
        System.out.println("Do you know java if yes, write true brief otherwise write false");
        boolean java = in.nextBoolean();
        System.out.println("Do you know python if yes, write true brief otherwise write false");
        boolean python = in.nextBoolean();
        System.out.println("Well nice, what are your traits as a hacker");
        System.out.println("Do you know kali if yes, rate yourself between 1 to 10");
        int kali = in.nextInt();
        System.out.println("Do you know burpsuite if yes, rate yourself between 1 to 10");
        int burpsuite = in.nextInt();
        System.out.println("Do you know metasploit if yes, rate yourself between 1 to 10");
        int metasploit = in.nextInt();
        System.out.println("Do you know gcp if yes, rate yourself between 1 to 10");
        int gcp = in.nextInt();
        hacker original = new hacker(angular,react,docker,kubernetes,c,cplusplus,java,python,kali,burpsuite,metasploit,gcp);
        System.out.println(original.getAngular());
        System.out.println(original.getReact());
        System.out.println(original.getDocker());
        System.out.println(original.getKubernetes());
        System.out.println(original.getC());
        System.out.println(original.getCplusplus());
        System.out.println(original.getJava());
        System.out.println(original.getPython());
        System.out.println(original.getKali());
        System.out.println(original.getBurpsuite());
        System.out.println(original.getMetasploit());
        System.out.println(original.getGcp());
        
        
        
    }
}

import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n,m;
        n=v.nextInt();
        m=v.nextInt();
        double a,t;
        a=(n+m);
        t=a/2;
        System.out.printf("%.4f",t);
    }
}
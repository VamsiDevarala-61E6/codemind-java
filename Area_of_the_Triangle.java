import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double f,s,t,d;
        f=(a+b+c);
        s=f/2;
        t=s*(s-a)*(s-b)*(s-c);
        d=Math.sqrt(t);
        System.out.printf("%.2f",d);
    }
}
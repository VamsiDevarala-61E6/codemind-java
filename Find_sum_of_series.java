import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        double p=0.0;
        for(double i=1;i<=n;i++)
        {
            p=p+1/i;
        }
        System.out.printf("%.2f",p);
    }
}
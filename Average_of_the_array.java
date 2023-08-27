import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int[] x=new int[n];
        double s=0;
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
            s+=x[i];
        }
        double f=s/n;
        System.out.printf("%.2f",f);
    }
}
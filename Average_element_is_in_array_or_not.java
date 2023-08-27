import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int[] x=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
            s+=x[i];
        }
        int k=s/n;
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(k==x[i])
            {
                f=1;
                System.out.println("True");
                break;
            }
        }
        if(f==0)
         System.out.println("False");
    }
}
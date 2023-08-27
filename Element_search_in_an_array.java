import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        int s=v.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(s==x[i])
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
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        double s=0,c=0;
        for(int i:x)
        {
            if(prime(i))
            {
                s+=i;
                c+=1;
            }
        }
        double d=s/c;
        System.out.printf("%.2f",d);
    }
    public static boolean prime(int n)
    {
        if(n==1)
          return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
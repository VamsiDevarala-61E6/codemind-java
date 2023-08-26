import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n,k;
        n=v.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
       // k=v.nextInt();
        int c=0;
        for(int i:x)
        {
            if(prime(i))
            {
                c++;
            }
        }
         System.out.println(c);
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

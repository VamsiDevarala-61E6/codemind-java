import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int a,b;
        a=v.nextInt();
        b=v.nextInt();
        int p=0;
        for(int i=a;i<=b;i++)
        {
            if(prime(i))
            {
             p++;   
            }
        }
        System.out.println(p);
    }
    public static boolean prime(int n)
    {
        int c=0;
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c==0;
    }
}
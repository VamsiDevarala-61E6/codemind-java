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
        int c=0;
        for(int i:x)
        {
            if(pali(i)==true)
            {
                c++;
            }
            
        }
        System.out.println(c);
    }
    public static boolean pali(int n)
    {
        int t=n,r=0;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(t==r)
          return true;
        else
          return false;
    }
}
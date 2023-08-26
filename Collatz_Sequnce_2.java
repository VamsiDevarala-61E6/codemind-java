import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n,b;
        n=v.nextInt();
        b=v.nextInt();
        int max=collat(n);
        int k=0;
        for(int i=n;i<=b;i++)
        {
            if(collat(i)>=max)
            {
                max=collat(i);
                k=i;
            }
        }
       // System.out.println(max);
        System.out.print(k);
    }
    public static int collat(int n)
    {
        int c=0;
        while(n!=1)
        {
            c++;
            if(n%2==0)
            {
              n=n/2; 
            }
            else if(n%2!=0)
            {
                n=3*n+1;
            }
            else if(n==1)
            {
                break;
            }
        }
        //System.out.print(c);
        return c;
    }
}
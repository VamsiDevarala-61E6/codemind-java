import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        for(int i=n+1;;i++)
        {
            if(pali(i) && prime(i)){
            System.out.println(i);
            break;
            }
        }
    }
    public static boolean prime(int n)
    {
        if(n==1)
            return false;
        
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0)
            return false;     
            
        return true;
    }
    public static boolean pali(int n)
    {
        int temp=n,r=0;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        return temp==r;
    }
}
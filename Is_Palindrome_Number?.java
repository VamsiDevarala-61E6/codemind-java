import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        System.out.println(pali(n));
    }
    public static int pali(int n){
        int t=n,r=0;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(t==r)
          return 2;
        else
          return 1;
    }
}
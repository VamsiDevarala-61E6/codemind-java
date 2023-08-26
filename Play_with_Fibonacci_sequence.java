import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
            int n;
            n=v.nextInt();
            int a=0,b=1,c=0;
            System.out.print(a+" "+b+" ");
            for(int j=3;j<=n;j++)
            {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        
    }
}
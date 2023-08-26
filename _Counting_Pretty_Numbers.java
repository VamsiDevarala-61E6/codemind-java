import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a,b;
            a=v.nextInt();
            b=v.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                if(j%10==2||j%10==3||j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
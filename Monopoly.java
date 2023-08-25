import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int t;
        t=v.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a,b,c;
            a=v.nextInt();
            b=v.nextInt();
            c=v.nextInt();
            int p=a+b+c;
            int mx=Math.max(a,b);
            mx=Math.max(mx,c);
            if(p-mx<mx)
              System.out.println("YES");
            else
              System.out.println("NO");
        }
    }
}
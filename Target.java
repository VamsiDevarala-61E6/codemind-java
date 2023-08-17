import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int a,b,c,d;
        a=v.nextInt();
        b=v.nextInt();
        c=v.nextInt();
        d=v.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
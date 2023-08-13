import java.util.Scanner;
public class Vamsi{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int t,i;
        t=v.nextInt();
        for(i=1;i<=t;i++)
        {
            String s,m;
            s=v.next();
            int h=Integer.parseInt(s,8);
            m=Integer.toString(h,2);
            System.out.println(m);
        }
    }
}
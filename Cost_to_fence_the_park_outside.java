import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int l,b,w,c;
        l=v.nextInt();
        b=v.nextInt();
        w=v.nextInt();
        c=v.nextInt();
        int p=l+2*w;
        int k=b+2*w;
        int a=(p*k)-(l*b);
        int an=a*c;
        System.out.println(an);
    }
}
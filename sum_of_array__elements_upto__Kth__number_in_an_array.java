import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        int k=v.nextInt();
        int c,s=0;
        for(int i=0;i<n;i++)
        {
            s+=x[i];
            if(x[i]==k)
            {
                break;
            }
        }
        System.out.println(s);
    }
}
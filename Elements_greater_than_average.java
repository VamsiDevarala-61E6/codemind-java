import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int[] x=new int[n];
        int s=0,c=0;
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
            s+=x[i];
        }
        int k=s/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=k)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
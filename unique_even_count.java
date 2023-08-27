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
        int c,s=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                if(x[i]%2==0)
                {
                    s++;
                }
            }
        }
        System.out.println(s);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        String a,b;
        int n;
        Double u,t;
        a=v.nextLine();
        b=v.nextLine();
        n=v.nextInt();
        if(n<199)
        {
           u=n*1.20;
        }
        else if(n>=200 && n<400){
            u=n*1.50;
        }
        else if(n>=400 && n<600)
        {
            u=n*1.80;
        }
        else
        {
            u=n*2.00;
        }
    
    if(u>400)
    {
        t=u+u*0.15;
    }
    else
    {
        t=u+100;
    }
    System.out.printf("%.2f",t);
    }
    
}
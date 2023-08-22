import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        char ch;
        ch=v.next().charAt(0);
        if(ch=='v' || ch=='V')
        {
            System.out.println("Violet");
        }
        else if(ch=='i'||ch=='I')
        {
            System.out.println("Indigo");
        }
        else if(ch=='B'||ch=='b')
        {
            System.out.println("Blue");
        }
        else if(ch=='G'||ch=='g')
        {
            System.out.println("Green");
        }
        else if(ch=='Y'||ch=='y')
        {
            System.out.println("Yellow");
        }
        else if(ch=='O'||ch=='o')
        {
            System.out.println("Orange");
        }
        else if(ch=='R'||ch=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st variable:");
        System.out.println("Enter the 2nd variable:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);

    }
}

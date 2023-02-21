import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth:");
        int b=sc.nextInt();
        int a=l*b;
        System.out.println("The area of the rectangle is:"+a);
    }
}

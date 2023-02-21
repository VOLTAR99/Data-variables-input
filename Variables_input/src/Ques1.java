import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("enter the value of y:");
        int y=sc.nextInt();
        int z=x*y;
        System.out.println("the product of x and y is:"+z);
    }
}

/*Java Stdin and Stdout II*/
/**=========================================================================**/
import java.util.Scanner;

public class Java_practice_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.skip("\r\n");
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

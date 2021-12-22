/*Java Loops I*/
/**===============================================================**/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java_practice_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 0; i++ < 10;){
            System.out.println(N+" x "+i+" = "+N*i);
        }
        bufferedReader.close();
    }
}

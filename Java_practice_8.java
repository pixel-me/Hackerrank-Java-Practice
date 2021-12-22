/*Java Loops II*/
/**======================================================================**/
import java.util.*;
import java.io.*;

class Solution{
    static int pow(int x, int n){
        int r = 1;
        for(int i =1 ; i<=n; i++ ){
            r*=x;
        }
        return r;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int r = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // r+=a;
            for(int j = 0; j < n; j++){
                r += (a+pow(2,j)*b);
                System.out.print(r+" ");
                r-=a;
            }
            System.out.println();
        }
        in.close();
    }
}

package Day_04;
import java.util.Scanner;
import static java.lang.System.out;
public class Pattern04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            int nstr = (n+1)-row;
            int nspace = n-nstr;
            for(int i = 1; i <= nspace; i++){
                out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                out.print("*\t");
            }
            out.println();
        }
    }
}

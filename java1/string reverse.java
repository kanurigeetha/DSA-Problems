import java.io.; import java.util.;

public class Solution {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    StringBuilder R = new StringBuilder(A);
    StringBuilder S = new StringBuilder(A).reverse();
    String msg = "Yes";
    for (int i = 0; i < A.length(); i++) {
        if (R.charAt(i) != S.charAt(i)) {
            msg = "No";
            break;
        }
    }
    System.out.println(msg);
}
}
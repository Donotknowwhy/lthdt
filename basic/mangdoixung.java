/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mangdoixung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i-- > 0) {
            boolean check = true;
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }

            for (int j = 0; j <= n / 2; j++) {
                if (a[j] != a[n - j - 1]) {
                    check = false;
                    break;
                }
            }

            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

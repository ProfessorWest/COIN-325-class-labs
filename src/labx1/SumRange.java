/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labx1;
import java.util.Scanner;
/**
 *
 * @author pwest
 */
public class SumRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int sum = sumRange(start, end);
        if(sum != 0) {
            System.out.println("Your sum is " + sum + ".");
        }
    }
    public static int sumRange(int start, int end) {
        int sum = 0;
        if (end < start) {
            System.out.println("The second integer must be less than the first!");
            return 0;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

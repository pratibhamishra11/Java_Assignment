import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortedList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered : ");
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        System.out.println("Enter the elments : ");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.println(a);
        sc.close();
    }
}
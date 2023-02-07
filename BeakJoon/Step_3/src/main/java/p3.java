import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < j; ) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}

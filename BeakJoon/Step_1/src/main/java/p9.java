import java.util.Scanner;

// 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c = 2, d = 2, e = 2, f = 8;

        a = a - sc.nextInt();
        b = b - sc.nextInt();
        c = c - sc.nextInt();
        d = d - sc.nextInt();
        e = e - sc.nextInt();
        f = f - sc.nextInt();

        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.print(e + " ");
        System.out.print(f);

    }
}

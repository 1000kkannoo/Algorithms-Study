import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2588 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
public class p11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B % 10));
        sb.append('\n');

        sb.append(A * ((B % 100) / 10));
        sb.append('\n');

        sb.append(A * (B / 100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);

    }

}
/*
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}

 */



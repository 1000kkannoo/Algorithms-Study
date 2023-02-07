import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int price = sc.nextInt();
        int ea = sc.nextInt();

        for (int i = 0; i < ea; i++){
            int pr = sc.nextInt();
            int pea = sc.nextInt();
            sum += pr * pea;
        }
        if(price == sum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}

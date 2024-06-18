import java.util.Scanner;

public class Baek_Level2_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, SumMinute;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        B = A * 60 + B;
        B = B + C;
        A = (B/60) % 24;
        SumMinute = B % 60;
            
        System.out.println(A + " " + SumMinute);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {
            case "Soal1":
                soal1(sc);
                break;
            case "Soal2":
                soal2(sc);
                break;
            case "Soal3":
                soal3(sc);
                break;
            case "Soal4":
                soal4(sc);
                break;
            case "Soal5":
                soal5(sc);
                break;
        }

        sc.close();
    }

    // soal 1
    static void soal1(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((b > 0 && a > Integer.MAX_VALUE - b) ||
            (b < 0 && a < Integer.MIN_VALUE - b)) {
            System.out.println("OVERFLOW");
        } else {
            System.out.println(a + b);
        }
    }

    // soal 2
    static void soal2(Scanner sc) {
        float xF = sc.nextFloat();
        float yF = sc.nextFloat();

        double xD = (double) xF;
        double yD = (double) yF;

        float sumFloat = xF + yF;
        double sumDouble = xD + yD;

        double diff = Math.abs(sumDouble - sumFloat);
        System.out.printf("%.6f%n", diff);
    }

    // soal 3
    static void soal3(Scanner sc) {
        int N = sc.nextInt();

        Integer a = N;
        Integer b = a;
        a = a + 1;

        System.out.println("==: " + (a == b));
        System.out.println("equals: " + a.equals(b));
    }

    // soal  4
    static void soal4(Scanner sc) {
        String S = sc.next();

        String a = S;
        String b = new String(S);

        a = a + "X";

        System.out.println("==: " + (a == b));
        System.out.println("equals: " + a.equals(b));
    }

    // soal 5
    static void soal5(Scanner sc) {
        String intStr = sc.next();
        String doubleStr = sc.next();
        String boolStr = sc.next();

        int i = Integer.parseInt(intStr);
        double d = Double.parseDouble(doubleStr);
        boolean b = Boolean.parseBoolean(boolStr);

        double result = i * d;
        if (!b) {
            result *= -1;
        }

        System.out.printf("%.2f%n", result);
    }
}

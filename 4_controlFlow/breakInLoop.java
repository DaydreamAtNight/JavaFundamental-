import java.util.Scanner;

public class breakInLoop {
    public static void main(String[] args) {
        // label, !not recommended, always use default
        label1: for (int i = 0; i < 10; i++) {
            label2: for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break label2;
                }
                System.out.println("i = " + i + " j = " + j);
            }
            if (i == 3) {
                break label1;
            }
        }
        practiceBreak();
    }

    public static void practiceBreak() {
        Scanner userInput = new Scanner(System.in);
        int wrongCountTolerant = 3;
        System.out.println("plz input password");
        for (;;) {
            String s = userInput.nextLine();
            // System.out.println(s == "password"); // there is no == in string
            // if (s.equals("password")) {
            if ("password".equals(s)) { // better, avoid NULL pointer problem
                System.out.println("success logging in");
                break;
            } else {
                if (--wrongCountTolerant <= 0) {
                    System.out.println("wrong password >> no chance left, exit");
                    break;
                } else {
                    System.out.println("wrong password >> " + (wrongCountTolerant) + " chances left");
                }
            }

        }
    }
}

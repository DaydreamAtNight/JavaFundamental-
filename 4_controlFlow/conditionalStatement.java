import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz input the age: ");
        int age = scanner.nextInt();

        if (age < 18 && age > 0) {
            System.out.println("you are child");
        } else if (age < 30) {
            System.out.println("you are adult but still young");
        } else {
            System.out.println("you are about to be die");
        }

        // switch 1:

        System.out.println("plz input a character: ");
        char c = scanner.next().charAt(0);
        char c2 = 'c';
        double try_double = 1.1;
        // switch (try_double) { // Cannot switch on a value of type double. Only
        // convertible int values, strings or enum variables are permitted
        switch (c) {
            case 'a':
                System.out.println("a");
                break; // if no break, run next case directly

            case 'b':
                System.out.println("b");
                break;

            // case c2: // case expressions must be constant expressions
            case 'c':
                System.out.println("c");
                break;

            default: // optional
                System.out.println("nothing");
                break;
        }

        // switch 2:

        System.out.println("plz input a month number: ");
        int mon = scanner.nextInt();
        switch (mon) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("winter");
                break;
        }

    }
}

// only byte, short, int, char, enum is valid
// no double
// case must be constant. not variable
// default is only optional
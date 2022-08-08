public class nestedLoop {
    public static void main(String[] args) {
        // nested loop, recommended <= 3 layers
        int countNumber = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("output " + (i * 6 + j));
                countNumber++;
            }
        }
        System.out.println("finished nested loop, run System.out.println " + countNumber + " times."); // 6*7

        // 9*9 multiple table
        System.out.println("print 9*9 multiply table");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("" + i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
        
        practice();
    }

    public static void practice() {
        // hollow pyramid
        System.out.println("print hollow pyramid");
        int height = 5;
        // step 1, half solid
        System.out.println("  step 1: print half solid pyramid");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // step 2, full solid
        System.out.println("  step 2: print full solid pyramid");
        for (int i = 0; i < height; i++) {
            for (int j = i + 1; j < height; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // step 3, hollow solid
        System.out.println("  step 3: print hollow pyramid");
        for (int i = 0; i < height; i++) {
            for (int j = i + 1; j < height; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i == height - 1 || j == 0 || j == 2 * i)
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // hollow diamond
        height = 20;
        int half_height = height / 2;
        System.out.println("\nprint hollow diamond");
        for (int i = 0; i < half_height; i++) {
            for (int j = i + 1; j < half_height; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i)
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < half_height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * (half_height - i - 2) + 1; j++) {
                if (j == 0 || j == 2 * (half_height - i - 2))
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

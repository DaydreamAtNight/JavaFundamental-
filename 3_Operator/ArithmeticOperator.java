public class ArithmeticOperator {
    public static void main(String [] args){
        System.out.println(10/3); // 3 int
        System.out.println(10.0/3); // 3.333 double
        // a%b = a - a/b*b
        System.out.println(10%3); // 1
        System.out.println(-10%3); // -1
        System.out.println(10%-3); // 1
        System.out.println(-10%-3); // -1

        int i = 1;
        i = i++;
        System.out.println(i); // 1

        int j = 1;
        j = ++j;
        System.out.println(j); // 2

        
    }
}

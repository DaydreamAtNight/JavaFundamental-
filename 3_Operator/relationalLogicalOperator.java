public class relationalLogicalOperator {
    public static void main(String [] args){
        // one new relational operator
        System.out.println("lsr" instanceof String); // true

        // logical operator, difference between & and &&
        // same result, different underlying algorithm
        // & evaluates both sides of the operation.
        // && evaluates the left side of the operation, if it's true, it continues and evaluates the right side.
        
        int a = 4;
        int b = 9;
        if(a < 1 && ++b < 50){  // if a<1 = False, ++b will not run, more effective
            System.out.println("first printed out ");
        }
        System.out.println("a = "+a+" b=: "+b);

        if(a < 1 & ++b < 50){   // ++b is run even though first statement is false
            System.out.println("second printed out ");
        }
        System.out.println("a = "+a+" b=: "+b);

    }
}

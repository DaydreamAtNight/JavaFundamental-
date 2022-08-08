public class loop {
    public static void main(String [] args){
        // for loop, same as c++
        for (int i = 0; i < 10; i++){
            System.out.println("number "+i);
        }
        for (int i = 0, j=1; i < 10; i++, j++){
            System.out.println("number i: "+i+" number j: "+j);
        }
        // while loop, first discriminate, then run
        int i = 0;
        while(i < 10){ 
            System.out.println("number i: "+i);
            i++;
        }

        // do while loop, first run then discriminate, at least one run
        i = 0;
        do {
            System.out.println("number i: "+i);
            i++;
        }
        while(i<10);
    }
}

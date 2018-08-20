import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Integer> factors;

    //Main method
    public static void main(String[] args) {
        Random rand = new Random();
        for (int x = 0; x < 10; x++) {
            int num = rand.nextInt(10000000);
            if (isPrime(num)) System.out.println(num + " is Prime");
            else {
                System.out.println(num + " is not Prime, and has the following factors:\n");
                System.out.println("Factors of " + num + ":\n");
                for (int factor:factors)
                    System.out.println(factor);
            }
            System.out.println("----------(_)------------(_)--------------------(_)----------");
        }

    }

    static boolean isPrime(int x) {
        factors=new ArrayList<>();

        if (isEven(x)){      //first check if the number is even, if so then
            return x == 2;  //return true if the number is 2. 2 is prime
       }
 else {
            findFactors(x);
            factors.add(x);  //add x as it is divisible by itself
            return factors.size() <= 2;
        }
    }

    /**A helper function that finds factors of a given number
     * @param num the integer to find factors for
     * */
    static void findFactors(int num) {

        factors.add(1);
        for (int x=2;x<=(num/2); x++)
            if (num % x == 0)
                factors.add(x);
            //factors.add(num);
    }

    static boolean isEven(int x)
    {
        return x % 2 == 0;
    }
}

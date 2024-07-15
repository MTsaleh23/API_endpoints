// Import statement:
import java.util.ArrayList;
import java.util.Arrays;
class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int num){
        if(num <= 1){
            System.out.println( num + " most be bigger than 1 to be prime");
            return false;
        }
        if(num <= 3){
            System.out.println(num +" is prime number");
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            System.out.println(num +" is even number or multiples of 3");
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                System.out.println(num +" is divadable by more than 1 and itself");
                return false;
            }
        }
        System.out.println(num +" is prime number");
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] nums){

        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : nums){
            if(isPrime(num)){
                primes.add(num);
            }
        }

        return primes;
    }


    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        for (int number : numbers) {
            pd.isPrime(number);
        }

        System.out.println("primes list: " + pd.onlyPrimes(numbers));

    }
}
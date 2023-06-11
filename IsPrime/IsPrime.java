/* Write a function isPrime which gets an integer num and returns true if the num is prime number else false. */

class IsPrime {
    public static boolean isPrime(int num) {
        
        int aux=0;
        for (int i=1;i<=num;i++){
            if (num % i == 0){
                aux=aux+1;
            }
        }
        if (aux == 2){
            return true;
        }
        else {
            return false;
        }
    }
}

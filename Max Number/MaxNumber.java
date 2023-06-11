/* Write a function named max that receives two numbers as input and returns the bigger number among the two.

For example let's assume the input is 132 and 154. the function should return 154 because it is bigger than 132.

Difficulty Level: Easy */

class Max {
    public static int max(int n1, int n2) {
        int maior;
        if (n1 >= n2){
            maior = n1;
        }
        else {
            maior = n2;
        }
        return maior;
    }
}

public class MaxNumber {
   
    public static void main(String[] args) {
        System.out.println (Max.max(3, 4));
    }
}
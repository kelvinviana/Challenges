/* Write function fact which gets num and returns factorial of num.

Examples,

Factorial of 6 (6!)  ->  1 * 2 * 3 * 4 * 5 * 6 = 720
Factorial of 3 (3!)  ->  1 * 2 * 3 = 6 */

class FactorialFunction {
    public static int fact(int num) {
        int aux = num;
        for (int i=1;i<num;i++){
            aux = aux*i;
        }
        num = aux;
        return num;
    }
}

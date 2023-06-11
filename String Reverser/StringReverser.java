/* Write a function reverse which gets string as input and returns the string reversed. */

class Reverse {
    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int esquerda = 0;
        int direita = chars.length - 1;
        while (esquerda < direita){
            char temp = chars[esquerda];
            chars[esquerda] = chars[direita];
            chars[direita] = temp;
            esquerda++;
            direita--;
        } 
        return new String(chars);
    }
}

public class StringReverser {
    public static void main(String[] args) {
        Reverse.reverse("Abacaxi");
    }
}
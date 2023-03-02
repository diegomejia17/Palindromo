import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    //is palindromo
        System.out.println(isPalindromo("ana"));
        System.out.println(isPalindromo("RECONOCER"));
        System.out.println(isPalindromo("vaca"));

    }
    public static boolean isPalindromo(String word){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        String reverseWord = "";
        while (!stack.isEmpty()){
            reverseWord += stack.pop();
        }
        return word.equals(reverseWord);

    }
}
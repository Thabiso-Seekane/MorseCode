import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String textToChange = "";
        String newText = "";
        Scanner input = new Scanner(System.in);

        char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] morseLetters = {
                "/",".-", "-...", "-.-.", "-..",
                ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----."};


        System.out.println("Please enter some text.");
        textToChange = input.nextLine();
        textToChange = textToChange.toLowerCase();

        for (int i = 0; i < textToChange.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (textToChange.charAt(i) == letters[j]) {
                    newText += morseLetters[j];
                    newText += "  ";
                    break;
                }
            }
        }
        System.out.println("Text in Morse Code");
        System.out.println(newText);

    }
}

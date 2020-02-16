import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String message;
        message = "What's your name?";
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String inputText = in.nextLine();
        System.out.println("Hello " + inputText + "!");
        in.close();
    }
}
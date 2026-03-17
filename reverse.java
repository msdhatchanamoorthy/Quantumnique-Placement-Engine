import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i != 0) {
                reversed += " ";
            }
        }
        System.out.println("Reversed string: " + reversed);

    }
}

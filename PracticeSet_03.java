import java.util.Locale;

public class PracticeSet_03 {
    public static void main(String[] args) {
        // Question no.1
            // Write a java program to convert a string to lowercase
        String name = "Dinesh Behera";
//        System.out.println(name.toLowerCase());
        name = name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        // Question no.2
        // Write a java program to replace space with underscores

        String text = "To my friend";
        text = text.replace(" " , "_");
        System.out.println(text);

        // Question no.3
        // Write a java program to fill in a letter template which looks like
        // letter = "Dear |<|name|>|"
        // replace = |<|name|>| with a string (some name)
        String letter = "Dear |<|name|>|";
        letter = letter.replace("|<|name|>|" , "Dinesh");
        System.out.println(letter);

    }
}

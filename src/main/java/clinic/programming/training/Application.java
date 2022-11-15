package clinic.programming.training;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public int countWords(String words) {
        String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for (String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();

        int count = app.countWords("I am pramod");
        System.out.println("Total words are:"+count);

    }
}
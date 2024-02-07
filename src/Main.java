import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<String>();
        boolean done = false;
        strings.addAll(Arrays.asList("","","","","","","","","",""));
        int listLength = strings.size();
        String welBack = "";

        do {
            System.out.println("Welcome " + welBack + "to ListMaker, your starting list is " + listLength + ":");
            System.out.println(strings);

        } while (!done);
    }
}
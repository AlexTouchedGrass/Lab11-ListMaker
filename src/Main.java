import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList <String> strings = new ArrayList<String>();
        boolean done = false;
        strings.addAll(Arrays.asList("","","","","","","","","",""));
        int listLength = strings.size();
        String welcBack = "";
        String userMenuInput  = "";
        String userStringInput = "";

        do {
            System.out.println("Welcome " + welcBack + "to ListMaker, your starting list is " + listLength + ":");
            System.out.println(strings);
            sleep(100);

            System.out.println("You can input any of the following: \nA to add an item to the list. \nD to delete an item from the list. \nP to print the list. \nQ to quit the program.");

            if () {

            } else if () {

            } else if () {

            } else if () {

            }
        } while (!done);
    }
}
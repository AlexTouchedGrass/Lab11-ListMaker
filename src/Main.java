import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Thread.sleep;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        strings.addAll(Arrays.asList("", "", "", "", "", "", "", "", "", ""));
        int listLength = strings.size();
        String welcBack = "";
        String userMenuInput = "";
        String userStringInput = "";

        do {
            System.out.println("Welcome " + welcBack + "to ListMaker, your starting list is " + listLength + ":");
            System.out.println(strings);
            sleep(100);

            System.out.println("You can input any of the following: \nA to add an item to the list. \nD to delete an item from the list. \nP to print the list. \nQ to quit the program.");
            userMenuInput = scan.nextLine();
            if (userMenuInput.equalsIgnoreCase("A")) {
                add
            } else if (userMenuInput.equalsIgnoreCase("D")) {

            } else if (userMenuInput.equalsIgnoreCase("P")) {

            } else if (userMenuInput.equalsIgnoreCase("Q")) {

            }
        } while (!done);
    }

    //Add Method
    public static void addList(){
        strings.add()
    }
    //Delete Method
    public static void deleteList(){

    }
    //Print Method
    public static void printList(){

    }
    //Quit Method
    public static void quitList(){

    }
}
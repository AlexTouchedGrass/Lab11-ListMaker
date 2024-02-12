import java.util.ArrayList;

import static java.lang.Thread.sleep;

import java.util.Scanner;
import java.util.Arrays;
public class ListMaker {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {


        ArrayList<Object> strings = new ArrayList<>(Arrays.asList("For", "The", "Emperor", "For", "The", "Corpse", "Emperor", "For", "The", "Weaver"));
        boolean done = false;
        String welcBack = "";
        String userMenuInput = "";

        do {
            sleep(1000);
            int listLength = strings.size();
            int listRealLength = strings.size() - 1;
            System.out.println("Welcome " + welcBack + "to ListMaker, your starting list is " + listLength + " Word(s) long:\n");
            System.out.println(strings);
            sleep(2500); //Feel Free To Delete all Sleeps when you playtest, they probably don't interfere with anything, but they're just to make the appearance of text more spaced out, giving users time to read.

            System.out.println("\nYou can input any of the following, but I recommend starting with P or Print List, it will give you the accurate locations of the words in the list.");
            sleep(2500);
            System.out.println("A to add an item to the list. \nD to delete an item from the list. \nP to print the list. \nQ to quit the program.");
            userMenuInput = scan.nextLine();
            if (userMenuInput.equalsIgnoreCase("A")) {
                System.out.println("What would you like to add to the list? Enter Below: ");
                addList(strings);
                System.out.println("Your new list is: \n" + strings);
                welcBack = "back ";
                sleep(2000);
            } else if (userMenuInput.equalsIgnoreCase("D")) {
                System.out.println("Which word would you like taken out of the list?\nPlease enter the index # for the word you want deleted. [0-" + listRealLength + "]");
                deleteList(strings);
                welcBack = "back ";
                sleep(2000);
            } else if (userMenuInput.equalsIgnoreCase("P")) {
                System.out.println("Your list will be printed shortly. The numbers next to each word are their actual positioning in the list.\n");
                sleep(2000);
                System.out.println(printList(strings));
                System.out.println("\n");
                welcBack = "back ";
            } else if (userMenuInput.equalsIgnoreCase("Q")) {
                System.out.println("Sorry you are feeling this way, that makes me sad.\n");
                sleep(1500);
                done = quitList();
                welcBack = "back ";
            }
        } while (!done);
    }

    //Add Method
    public static void addList(ArrayList<Object> array){ //EASIEST
        String string = InputHelper.getNonZeroLenString(scan,"Enter a WORD, blank space will not work.");
        array.add(string);
    }

    //Delete Method
    public static void deleteList(ArrayList<Object> array){ //HARDEST
        int ranges = InputHelper.getRangedInt(scan,"If you aren't sure what the index is maybe try Printing the List.",0,array.size());

        array.remove(ranges);
        System.out.println("Your new list is : \n" + array);
    }
    //Print Method
    public static String printList(ArrayList<Object> array){ //Mid took a while to figure out
        StringBuilder saveString = new StringBuilder();
        for (int i = 0; i < array.size();i++) {
            saveString.append(" \n").append(i).append(" - ").append(array.get(i)).append(" ");

        }
        return saveString.toString();
    }
    //Quit Method
    public static boolean quitList(){ //Easy but a lot of code
        boolean done = false;
        boolean quitListDone = false;
        System.out.println("Are you sure you would like to quit the ListMaker program? Enter [Y/N]");
        do {
            String userDone = scan.nextLine();
            if (userDone.equalsIgnoreCase("Y")) {
                System.out.println("Goodbye, you don't know what you're missing.");
                done = true;
                quitListDone = true;
            } else if (userDone.equalsIgnoreCase("N")) {
                System.out.println("Good to hear, I knew you weren't really done.");
                quitListDone = true;
            } else {
                System.out.println("That is not [Y/N], if you typed the full word that won't work, try again.\n");
            }
        } while (!quitListDone);

        return done;
    }
}

package demo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("It works!");
    }
    public static void greeting(){
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        System.out.println("Hej" + input);
    }
    public void askAboutYourMom(){
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        System.out.println("Your age pls: " + input);
    }
    public  void  thisSHit(){
        System.out.println("This is shit");
    }
}

import java.util.Scanner;
public class ElizaChat {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
    String name = input.nextLine();
    System.out.println("Nice to meet you, Hannah Snow, How has your day been?");
    String day = input.nextLine();
    System.out.println("Okay, Anything in particular that makes you feel that "+day+"?");
    String reason = input.nextLine();
    System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
    System.out.println("Here are you repsonses: "+name+" "+day+" "+reason);
    }
}

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a string");
        System.out.println("the program will find white spaces in between them");
        String sentence = keyboard.nextLine();
        int counter = 0;
        for(int i = 0; i<sentence.length(); i++)
        {
            if(sentence.charAt(i) == (' '))
            {
                counter++;
            }
        }
        System.out.println("we have: " + counter +" white spaces");


    }
}

import java.util.Scanner;
//Scanner allows us to get input from the user
public class Askme {
    public static void main(String[] args){  //Main method,
        //think of it as main()= "Start here"
        //public > Access modifier:java access from outside the class
        //static > belongs to the class: java can sun main() without creating
        //void > return type > this method does not return a value
        //args > variable name :Name of the array,  the name given to String[] containing all the
        //String[] > array of strings: collection of text values
        Scanner input = new Scanner(System.in);// created a Scanner called input
        //system.in > means receive info from keyboard
        System.out.print("what is your name? ");// will display, what is your name
        String name = input.nextLine();// waits for your input
        //String means the variable stores what is provided in text
        //name: is a variable, this creating a box and it is called name
        System.out.println("hello, " + name + " !");
        // . > means access something inside or belongs to
        //out> standard output on the screen
        //println > print line, display something then move cursor to next line
        // + > called concatenation, to join things
        input.close(); //input is the scanner name from line 12

    }


}

public class week2 { // the class can be accessed from outside the class

    public static void main(String[] args) {// The main method, starts executing the program

        String name = "Susan"; //String is a data type that stores text, name is the variable name
        int age = 30;//int is a primitive data type for whole numbers
        double price = 12.50;//double is a primitive data type for numbers with decimals
        char grade = 'A'; //char is a primitive data type for 1 character
        //char's value used single quotations ''
        boolean isStudent = true;//primitive data type, can only contain true or false. It is for logic truth
        // = is an assignment operator
        //true is the boolean value


        System.out.println("=== Primitive Data Types ===");//System to print the string of text then terminate the line and start on the new line

        System.out.println("Age: " + age);          // "Age: " is a string, + joins the string with the variable value
        System.out.println("Price: $" + price);    // double
        System.out.println("Grade: " + grade);     // char
        System.out.println("Student: " + isStudent); // boolean



        int number1 = 10; //create an integer variable called number 1, assign it value 10
        int number2 = 5;

        System.out.println("\n=== Addition ===");// \n means new line, java leaves a blank line before printing. \n is called escape sequence
        System.out.println(number1 + number2);// + here means mathematical addition



        String firstName = "Susan";//string variable
        String lastName = "Smith";

        System.out.println("\n=== String Concatenation ===");
        System.out.println(firstName + " " + lastName);// string concatenation, not addition



        System.out.println("\n=== Concatenation vs Addition ===");

        System.out.println(10 + 5);
        System.out.println("10" + "5");
        System.out.println("Answer: " + 10 + 5);
        System.out.println("Answer: " + (10 + 5));



        int length = 10;
        int width = 5;

        int area = length * width;

        System.out.println("\n=== Expressions ===");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);



        System.out.println("\n=== Escape Characters ===");

        System.out.println("Hello\nWorld");

        System.out.println("\nName:\t" + name);// \t means tab, same as Tab key
        System.out.println("Age:\t" + age);
        System.out.println("Grade:\t" + grade);
    }
}
package de.smialkowski;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args) {
        System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
    }


    public static void featureUnderDevelopment(String[] args) {
        System.out.println("Test"); // Testing in the main method
    }

    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}

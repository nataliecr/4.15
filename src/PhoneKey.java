import java.util.Scanner;

public class PhoneKey {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String temp = input.nextLine();
    char letter = temp.toLowerCase().charAt(0);
    
    if (letter < 'A' || letter > 'z'){
      System.out.println(letter + " is an invalid input");
      System.exit(0);
    } // if  
    
    switch (letter){
        case 'a':
        case 'b':
        case 'c':
            System.out.println("The corresponding number is 2"); break;
        case 'd':
        case 'e':
        case 'f':
            System.out.println("The corresponding number is 3"); break;
        case 'g':
        case 'h':
        case 'i':
            System.out.println("The corresponding number is 4"); break;
        case 'j':
        case 'k':
        case 'l':
            System.out.println("The corresponding number is 5"); break;
        case 'm':
        case 'n':
        case 'o':
            System.out.println("The corresponding number is 6"); break;
        case 'p':
        case 'q':
        case 'r':
        case 's':
            System.out.println("The corresponding number is 7"); break;
        case 't':
        case 'u':
        case 'v':
            System.out.println("The corresponding number is 8"); break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            System.out.println("The corresponding number is 9"); break;
    } // switch
  }  // main
} // PhoneKey

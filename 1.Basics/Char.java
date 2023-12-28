public class Char {
    
        public static void main(String[] args) {
        char myChar; //Character type data, size 2-bytes.
        myChar = 'A'; //direct assign character A, with single quote
        System.out.println("The value of myChar: "+ myChar); //display the value of myChar
        myChar = 70; //ASCII value of a character F 
        System.out.println("The value of myChar: " + myChar);
        myChar = '\u0041'; //unicode Hexadecimal value for integer (From 0000 to FFFF) 
        System.out.println("The value of myChar: " + myChar);
        }
        }
    

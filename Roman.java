//imports
import java.util.Scanner;

class Roman {

    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in); 
        // get user input
        System.out.print("Enter Roman value: ");
        String roman = s.nextLine(); 
        // method call
        int total = calInteger(roman); 
        // print final value
        System.out.println("Integer value : " + total); 

    }
    
    //checking roman values using method. method call rmChk
    static int rmChk(char letter) { 
        int val = 0;
        String let = String.valueOf(letter);
        // if conditions
        if (let.equals("I")) {
            val = 1;
        } else if (let.equals("V")) {
            val = 5;
        } else if (let.equals("X")) {
            val = 10;
        } else if (let.equals("L")) {
            val = 50;
        } else if (let.equals("C")) {
            val = 100;
        } else if (let.equals("M")) {
            val = 1000;
        } else {
            //invalid output printion
            System.out.println("Invalid Letter: " + let);
        }
        //return value
        return val;
    }

    //calculate final integer values using method
    static int calInteger(String roman) {
        // set total val as 0
        int total = 0; 
        // for loop 
        for (int i = 0; i < roman.length(); i++) { 
            // get the value of frist romen char
            int chk1 = rmChk(roman.charAt(i)); 
            //// check if i + 1 less than to text length
            if (i + 1 < roman.length()) { 
                // get the value of second romen char
                int chk2 = rmChk(roman.charAt(i + 1)); 
                // compare two values
                if (chk1 >= chk2) { 
                     // if grater than second one add val1 to total
                    total = total + chk1;
                } else {
                    // else subract val1 from total
                    total = total -  chk1; 
                }
                // else i + 1 grater than text length add val1 to total
            } else {
                total = total + chk1; 
            }

        }
        return total; // return final output
    }
}

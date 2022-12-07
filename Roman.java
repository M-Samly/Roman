import java.util.Scanner;

class Roman {

    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        String out = sc.nextLine();
        //Method calling
        int tot = calculate(out);
        //print output
        System.out.println(out+ " : "+tot);
    }
    //methods
    //create new method
    static int calculate(String out){
        //total initiate
        int total = 0;
        //for loop 
        for (int i = 0; i < out.length(); i++) {
            String num = String.valueOf(out.charAt(i));
            //if else 
            if (num.equalsIgnoreCase("I")) {
                //calculate total
                total = total + 1;
            } else if (num.equalsIgnoreCase("V")) {
                //calculate total
                total = total + 5;
            } else if (num.equalsIgnoreCase("X")) {
                //calculate total
                total = total + 10;
            } else if (num.equalsIgnoreCase("L")) {
                //calculate total
                total = total + 50;
            } else if (num.equalsIgnoreCase("C")) {
                //calculate total
                total = total + 100;
            } else if (num.equalsIgnoreCase("D")) {
                //calculate total
                total = total + 500;
            } else if (num.equalsIgnoreCase("M")) {
                //calculate total
                total = total + 1000;
            }else{
                System.out.println("Invalid Input");
            }
        }
        return total;
    }
}
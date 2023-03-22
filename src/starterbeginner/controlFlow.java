package starterbeginner;

import java.util.Scanner;

class controlFlow {
    public static void main(String[] args) {
        int temp = 30;
        if(temp > 20) {
            System.out.println(false);
        }
        else if(temp == 30)
            System.out.println(true);

        int income = 120_000;
        String result = income > 100_000 ? "FirstClass" : "Economy";
        System.out.println(result);

        String role = "admin";
        String output = role == "admin" ? "Your are an admin": (role != "admin" ? "You are moderator" : "you are a guest");
        System.out.println(output);

        switch (role){
            case "admin":
                System.out.println("you are an admin");
                break;

            case "moderator":
                System.out.println("moderating role");
                break;

            default:
                System.out.println("default");

        }

        // FIZZBUZZ PROJECT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
//        int FIZZ = scanner.nextInt();
//
//        if(FIZZ % 3 == 0 && FIZZ % 5 ==0){
//            System.out.println("FizzBuzz");
//        }
//        else if (FIZZ % 3 == 0)
//            System.out.println("BUZZ");
//        else if (FIZZ % 5 ==0)
//            System.out.println("FIZZ");
//        else
//            System.out.println(FIZZ);


//        String fizz =  FIZZ % 5 == 0 ? (FIZZ % 3 == 0 ? "BUZZ": ""): "";
//        System.out.println(fizz);

        String input = "";
        while(!(input.equals("quit"))){
            input = scanner.next();
            System.out.println(input);
        }



    }
}

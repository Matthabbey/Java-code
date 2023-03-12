package starterbeginner;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         // DAY PRIMITIVE DATA TYPES
        byte age = 50;
        Date now = new Date();
        System.out.println(now);
        long num = 3_123_456_789L;
        char isAlpha = 'A';
        float allAph = 10.99F;
        boolean isWorking = false;
        int herAge = age;
        System.out.println(num);
        System.out.println(isAlpha);
        System.out.println(allAph);
        System.out.println(isWorking);
        System.out.println(herAge);
        System.out.println(age);
        System.out.println("Hello World!");

        // DAY 2 REFERENCE DATA TYPE
        Point point1 = new Point(1, 1);
        Point point3 = new Point(2,3);
        Point point2 = point1;
        System.out.println(Arrays.toString(new Point[]{point2, point3}));
        point1.y = 20;
        System.out.println(point2.getY());

        // STRINGS
        String message = new String("Hello World");
        String message1 = "                 Hello World Start1              ";
        int msg = message.charAt(2);
        int msg2 = message1.length();
        System.out.println(msg);
        System.out.println(msg2);
        System.out.println(message.replace("o", "49"));
        System.out.println(message1.toLowerCase());
        System.out.println(message1.trim());
        System.out.println(message1.toUpperCase());

        //Escape Sequences
          String text = "Hello World \"Main\"";
        String messages = "c:\t\\Windows\\";
        String message1q = "c:\n\\Windows\\";
        System.out.println(messages);
        System.out.println(message1q);
          System.out.println(text);

          // ARRAY
        int[] numbers = new int[15];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 3;
        numbers[10] = 4;
        System.out.println(numbers);
        Arrays.sort(numbers);

        String arr = Arrays.toString(numbers);
        System.out.println(arr);

        int[][] number = new int[2][4];
        number[0][1] = 1;
        System.out.println(Arrays.deepToString(number));

        // FINAL
        final float PI = 3.14F;
        System.out.println(PI);

        //ARITHMETICS
        int result = 10 / 3;
        System.out.println(result);

        double res = (double) 10 % (double) 3;
        System.out.println(res);

        int x = 1;
        ++x;
//        int y = ++x;
        int y = x++;
        x += 2; //adding 2 to x
        System.out.println(y); // the prefix of ++x would add 1 to variable y and also x which would give 2 and 2
        System.out.println(x); // the postfix of x++ would only add 1 to the value of x and y would remain the same.

        //ORDER OF OPERATION (bracket, */, +-)
        int z = 10 + 3 * 9;
        System.out.println(z);

        //CASTING
        // byte > short > int > long > float > double
        double v = 12.1;
        int r = (int) v + 3;
        System.out.println(r);

        String cd = "34";
        int a = Integer.parseInt(cd) + 5;
        System.out.println(a);

        //THE MATH CLASS
        int math = Math.max(2,5);
        System.out.println(math);
        int math1 = (int) Math.round(Math.random() * 100);
        System.out.println(math1);
        int math2 = (int) Math.ceil(1.2);
        System.out.println(math2);


            //NUMBER FORMATTING
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance(); //
        String result4 = NumberFormat.getPercentInstance().format(0.2);
        String result3 = percent.format(0.1);
        System.out.println(result4);
        System.out.println(result3);
        String result1 = currency.format(123456789.892);
        System.out.println(result1);

        //SCANNER
        Scanner scan = new Scanner(System.in);
        System.out.print("Name:");
        byte name = scan.nextByte();
        String name1 = scan.nextLine().trim();
        System.out.println("You are " + name1 + " years old");
        System.out.println("You are "+ name1);




            //       PROJECT MORTGAGE CALCULATOR
        final byte PERCENT = 100;
        final byte MONTHS = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int amount = scanner.nextInt();
//
        System.out.print("Rate: ");
        float rate = (scanner.nextFloat() / PERCENT) / MONTHS;
//
        System.out.print("Period (Year):");
        int year = scanner.nextInt();
        int numOfPayment = year * MONTHS;

        double power = Math.pow(Double.parseDouble(String.valueOf(1 + rate)), numOfPayment);
        int output = (int) (amount *  power / power - 1);

        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(output));
    }
}
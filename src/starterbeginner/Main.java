package starterbeginner;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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

        String arr = Arrays.toString(numbers);
        System.out.println(arr);


    }
}
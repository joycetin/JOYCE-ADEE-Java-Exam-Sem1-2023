import java.util.Scanner;
import java.util.*;
public class Question1 {

            public static void main(String[] args) {
                //i) a program to display the sum of even numbers less than 8
                        int limit = 8;
                        int sum = 0;

                        for (int i = 0; i < limit; i += 2) {
                            sum += i;
                        }

                        System.out.println("The sum of even numbers less than 8 is: " + sum);

                // ii) a program to input 5 numbers from the keyboard and output their average
                       Scanner in = new Scanner(System.in);

                        System.out.print("Input first number: ");
                        int num1 = in.nextInt();

                        System.out.print("Input second number: ");
                        int num2 = in.nextInt();

                          System.out.print("Input third number: ");
                        int num3 = in.nextInt();

                          System.out.print("Input fourth number: ");
                        int num4 = in.nextInt();

                          System.out.print("Input fifth number: ");
                        int num5 = in.nextInt();

                        int average = (num1+num2+num3+num4+num5);

                        System.out.println(average);
                        
                //iii) a,
                int a = -5 + 8 * 6;
                System.out.println(a);

                //b,
                int b = (55+9)%9;
                System.out.println(b);

                //c,
                int c = 20 + -3 * 5 / 8;
                System.out.println(c);

                //d,
                int d = 5+15/3*2-8%3;
                System.out.println(d);

                //iv
                //a program for an arraylist of animals in a collection

                //creating an arraylist
                ArrayList<String> Animals = new ArrayList<String>();
                //adding animals to the colllection
                Animals.add("Dog");
                Animals.add("Pig");
                Animals.add("Cow");
                Animals.add("Sheep");
                System.out.println(Animals);
            }


    }


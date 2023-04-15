package java_in_21days;
import java.util.Scanner;

public class Weather {
      public static void main(String[] arguments) {
 // Date: 4/11/23  
 
//          float fah = 86;
//          System.out.println(fah + " degrees Fahrenheit is ...");
////          // to convert Fahrenheit into Celsius
//          // bgin by subtracting 32
//          fah = fah - 32;
//          //Divide the answer by 9
//          fah = fah / 9;
//          // Multiply the answer by 5
//          fah = fah * 5;
//          System.out.println(fah + " degrees Celsius\n");
//          
//          float cel = 33;
//          System.out.println(cel + " degrees Celsius is ...");
//          
//          // to convert Celsius into Fahrenheit 
//          // begin by multiplying by 9
//          cel = cel * 9;
//          
//          //Divide the answer by 5
//          cel = cel / 5;
//          
//          // add 32 to the answer
//          cel = cel + 32;
//          System.out.println(cel + " degrees Fahrenheit");
//      }
//}
// exercise 1
//            double initialInvestment = 14000;
//            double y1 = initialInvestment * 1.4;
//            double year1Total;
//            double y2 = y1 -1500;
//            double y3 = y2 * 1.12;
//            double yearAccumulation = y3 * 1;
//            System.out.println(yearAccumulation);
//book solution:
//        float total = 14000;
//        System.out.println("Original investment: $" + total);
//        // Inceases by 40 percent the first year
//        total = total + (total * .4F);
//        System.out.println("After one year: $" + total);
//        // Loses $1,500 the second year
//        total = total - 1500F;
//        System.out.println("After two years: $" + total);
//        // Increases by 12 percent the third year
//        total = total + (total * .12F);
//        System.out.println("After three years: $" + total);
// exercise 2
//            int num1 = 444;
//            int num2 = 31;
//            float results = num1/num2;
//            float remainder = num1 % num2;
//            System.out.println(num1 + " divided by " + num2 + " equals " + results);
//            System.out.println("The remainder of " + num1 " and " + num2 " equals " + remainder);
//            System.out.println("The remainder and results of " num1 "and " num2 " are as follows: " + remainder +"\t" + results);
//Book solution;
//        float number1 = 15;
//        float number2 = 6;
//        float result = number1 / number2;
//        float remainder = number1 % number2;
//        System.out.println(number1 + " divided by " + number2);
//        System.out.println("\nResult\tRemainder");
//        System.out.println(result + "\t" + remainder);
// extra practice:

          int originalDebt = 38985;
          System.out.println("Your remaining debt is $" + originalDebt);
          float principle = .072f;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of years the loan term is: ");
          int loanlength = sc.nextInt();
          float total = ((originalDebt * principle)* loanlength) + originalDebt ; 
          System.out.println("Your total loan payment after the term of the loan will be " + total);
      }
} 
            
            

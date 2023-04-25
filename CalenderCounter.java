package java_in_21days;
import java.util.Scanner;
 

class CalenderCounter{
    public static void main(String[] arguments){
        // initializing scanner to check user input for year
       Scanner sc = new Scanner(System.in);
       // creating year varable
       int year;
       System.out.println("Enter the Calender Year");
       int st = sc.nextInt();
       // Assigning user input to year variable 
       year = st;
       //  checking if the argument array has length greater than 0, if it does the first element wil be parsed as an interger using Interger.parseInt() method  
        if(arguments.length > 0 ) {
            year = Integer.parseInt(arguments[0]);
        }
        // initialized month variable setting it to 1, while checking if month variable is less than 13, if it is the statment will be below will be executed 
        //over and over again, each iteration increasing the month variable value by 1 
        for (int month = 1; month < 13; month++) {
            for (int day = 1; day <= countDays(month, year); day++) {
                System.out.println(month + "/" + day + "/" + year);
            }
        }
    }
// switch statement uses month as the conditional value allowing the number of days in the month to be assigned its proper value 
    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        // returns days in month 
        return count;
    }
} 
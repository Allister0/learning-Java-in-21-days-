// This application takes a month and a year as arguments and displays the number of days in that month. (switch ,if , and else statments are used)

package java_in_21days;

class DayCounter{
    public static void main(String[] arguments){
        // defines vvariables for creation of method 
        int yearIn = 2020;
        int monthIn = 2;
        
        /** note: This code is commonly used in programs that accept command-line arguments to set values for variables or parameters. By checking the number of arguments, 
        **  the program can determine which arguments were passed and assign the appropriate values to the corresponding variables. **/
        // checking if the arguments passed into the method/program is greater than 0 if so the first argument is set as an integer and assigned to monthIn variable
        if (arguments.length > 0) {
            monthIn = Integer.parseInt(arguments[0]);
        }
        
        //checking if the arguments passed into the method/program is greater than 1 if so the second argument is set as an integer and assigned to yearIn variable 
        if (arguments.length > 1) {
            yearIn = Integer.parseInt(arguments[1]);
        }
        // displays programs output 
        System.out.println(monthIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days.");   
    }
    
    // creating countDays method
    static int countDays(int month, int year) {
        // defining count variable 
        int count = -1;
        
        // using switch statement to count days in a month 
        switch (month) {
            // months 1,3,5,7,8,10,12 get assigned 31 days 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            // months 4,6,9,and 11 are assigned 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            // with the use of if statements month 2 (February is assigned its proper amount of days based off the year and if it is divisible by 4(leap year 29 days) if not hen it has 28 days   
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } 
                else { count = 28;
                } 
                if ((year % 100 == 0) & (year % 400 != 0)) {
                     count = 28;
                }   
        }
        return count; // method ends by returning value of count
    }
}

// birthdate practice exercise this one uses user input then splits into three strings detailing data
package java_in_21days;

import java.util.StringTokenizer;
import java.util.Scanner;

class BdayFormatter {
    public static void main(String[] arguments){
        // defines variables
        String bday;
        StringTokenizer b1;
        
        //creates object
        Scanner st  = new Scanner(System.in);
       
        //Prints message to user then retrieves user input and assignes to nl variable 
        System.out.println("Please eneter your Birth Date ");
         String nl = st.nextLine();
         b1 = new StringTokenizer(nl, "/");
        
         //prints three seperate strings with detailed data
        System.out.println("Month: " + b1.nextToken());
        System.out.println("Day: " + b1.nextToken());
        System.out.println("Year: " + b1.nextToken());
    }
}
// book exercise birthday program (this one doesnt use user input)
/** class Birthday {
    public static void main(String[] arguments) {
        String birthday = "04/29/2020";
        String month = birthday.substring(0, 2);
        String day = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Birthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);    }
**/
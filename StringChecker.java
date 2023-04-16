// Demonstrating use of methods in String class
package java_in_21days;

class StringChecker {
    public static void main(String[] arguments){
        // creating new instance of String 
        String str = "You know nothing, Jon Snow";
        
        //Prints value of String
        System.out.println("The string is: " + str);
        
        // Calls length() method in new string object to find out how many characters it contains
        System.out.println("Length of this string: " + str.length());
        
        // Calls charAt() method which returns character at the given position in the string
        System.out.println("The character at position 7: " + str.charAt(7));
        
        // Calls substring() method which takes two integers indicating a range and returns the substring with those starting and ending points
        System.out.println("the substring from 9 to 16: " + str.substring(9, 16));
        
        // Calls indexOf() method which returns the position of the first instance of the given character.
        System.out.println("The index of the first 'w': " + str.indexOf('w'));
        
        // displays the different use of indxOf() method, which takes string argument and returns the index of the beginning of that string.
        System.out.println("the index of the beginning of the " + "substring\"Jon\": " + str.indexOf("Jon"));
        
        // Calls the toUppercase() method to return copy of the string in all uppercase.
        System.out.println("The string in uppercase: " + str.toUpperCase());
        
        // calls the System.out.format()method which takes two arguments, the outpute template and the string to display.
        int accountBalance = 5005;
        System.out.format("Balance: $%,d%n", accountBalance);
        double pi = Math.PI;
        
        //.11f tells the format method to return value with 11 places after decimal point.
        System.out.format("%.11f%n", pi);
    } 
}

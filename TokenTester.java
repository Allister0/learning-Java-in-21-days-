//Practice Assignment to self from Javain21days Book 
// Demonstrates the use of class and instance variables, the creation of objects, and use of methods

package java_in_21days;

import java.util.StringTokenizer;

class TokenTester {
    
    public static void main(String[] argument) {
        //defining variables
        StringTokenizer st1, st2;
        
        //new object being made “uses the default delimiters, which are blank spaces, tabs, newlines, carriage returns, or formfeed characters.”
        String quote1 = "TWTR 37.14 7.28";
        st1 = new StringTokenizer(quote1);
        // displays value of each token
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        
        //second object created with argument passed to constructor the @ symbol is set as a dellimeter
        String quote2 = "RHT@185.98@80";
        st2 = new StringTokenizer(quote2, "@"); //new instance (object created from given class
        
        // dsiply value of each token
        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());
    } 
}


// testing use of equals() (checks value to see if its the same)method and == operator (checks to see if objects are the same)
package java_in_21days;

class EqualsTester {
    public static void main(String[] arguments){
        // variables declared
        String str1, str2;
        str1 = "Boy, that escalated quickly."; // the string in this statement is the Object
        str2 = str1; 
        
        //display comparison
        System.out.println("string1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same Object? " + (str1 == str2)); //true
        
        //new object created value of str1 is then passed into str2 Object
        str2 = new String(str1);  
        
        // display new comparison with equals() method to test value as well
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2)); //false, str2 has the value of str1 but they was not made equal using = operator after being made an object
        System.out.println("Same value? " + str1.equals(str2)); //true
    }
}

//Abstract this application takes command-line string argument and capitalizes all letters/(characters) in it.
package java_in_21days;

class Passer{
    // creating method that take an array of String called text as an argument
    void toUpperCase(String[] text) {
        // loop that iterates over each element in the text array.
        for (int i = 0; i < text.length; i++){
            // converts current element to text array
            text[i] = text[i].toUpperCase();
        }
    }
    // main method for program created
    public static void main (String[] arguments){
        // created new instance of Passer class assigning to passer variable 
       Passer passer = new Passer();
       // calls the toUpperCase Method from the passer object, passing in the "argument" array as an argument 
       passer.toUpperCase(arguments);
       // begins loop that will iterate over each element in the arguments array (loop starts with int variable 'i' set to 0 continuing until length matches arguments array.
       for (int i = 0; i < arguments.length; i++){
           //prints the current element of the argument array to the console
           System.out.print(arguments[i] + " ");
       }
       //prints a newline character to the comsole, to seperate the outputfrom any subsequent console output.
       System.out.println();
    }  
}

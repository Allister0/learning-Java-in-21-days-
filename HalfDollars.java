//This program, Creates, Initializes and Displays elements of three arrays

package java_in_21days;

class HalfDollars {
    public static void main(String[] arguments) {
        int[] detroit = { 2_100_000, 2_900_000, 6_100_000 } ;
        int[] lansing = new int[detroit.length];
        int[] total = new int[detroit.length];
        int average;
        
        lansing[0] = 2_100_000;
        lansing[1] = 1_800_000;
        lansing[2] = 4_800_000;
        
        total[0] = detroit[0] + lansing[0];
        total[1] = detroit[1] + lansing[1];
        total[2] = detroit[2] + lansing[2];
        average = (total[0] + total[1] + total[2]) / 3;
        
        System.out.print("2016 production: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("2017 production: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("2018 production: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("Average production: ");
        System.out.format("%,d%n", average);
    }  
}
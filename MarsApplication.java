package java_in_21days; 

class MarsApplication { 
    public static void main (String[] arguments) {
        //new robot objct created 
         MarsRobot spirit = new MarsRobot();
         spirit.status = "exploring";
         spirit.speed = 2;
         spirit.temperature = -60;
         
         //showAttribute method called 
         spirit.showAttributes();
         
         // displays text onscreen
         System.out.println("Increase speed to 3.");
         
         //speed instance variable assigned a value
         spirit.speed = 3;
         spirit.showAttributes();
         System.out.println("Changing temperature to -90");
         
         // Instance variable temperature value assigned
         spirit.temperature = -90;
         spirit.showAttributes();
         System.out.println("Check the temperature");
         
         // check temp method called to check if temperature instance variable is less than -80. if it is status and speed are assigned new values.
         spirit.checkTemperature();
         spirit.showAttributes();
    }
}

         



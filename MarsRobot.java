package java_in_21days;
//creation of MarsRobot class
class MarsRobot {
    // defines instance variables
    String status;
    int speed;
    float temperature;
    // create first instance method to check temperature
    void checkTemperature() {
        //if (conditional) statement to check if robot should return home if temp is lower than -80
        if (temperature < -80){
            String staus= "returning home";
            speed = 5;
        }
    }
    // second instance method to show attributes of robot (status, speed, anbd temperature)
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}





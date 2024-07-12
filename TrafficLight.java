//Define the TrafficLight class
public class TrafficLight {
    //Step 1: Define attributes for color and duration
    private String color;
    private int duration;
    //Step 2:  Adding Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    //Getter for color
    public String getColor() {
        return color;
    }
    //Getter for duration
    public int getDuration() {
        return duration;
    }
    //Step 3: Method to change the color
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    //Step 4: Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }
    //Step 5: Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }
    
    public static void main(String[] args) {
        //Step 6: Create an instance of TrafficLight and test its functionality
        TrafficLight trafficLight = new TrafficLight("Red", 30);
        //Display initial state
        System.out.println ("Inital Traffic Light State");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");
        //Check if the light is red
        System.out.println ("Is the light red? " + trafficLight.isRed());
        //Change the light color to green
        trafficLight.changeColor("Green");
        //Display new state
        System.out.println("\nUpdated Traffic Light State: ");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");
        //Check if the light is green
        System.out.println("Is the light green? " + trafficLight.isGreen()); 
    }
    
}

/*
ThingArray.java

Show the usage of an array to hold and print Thing objects.
*/

public class ThingArray {
    public static void main(String[] args) {
        // Let's create three new Thing objects, put them in an array, and print
        // out the array using a for each loop.
        Thing empireState = new Thing("Empire State Realty Trust", 
                                      "350 Fifth Avenue Manhattan, NY 10118",
                                      443.2, 208879);
        Thing myHouse = new Thing("My House", "Kampala, Uganda", 5, 400);
        Thing whiteHouse = new Thing("The White House", 
                                     "1600 Pennsylvania Ave NW, Washington, DC 20500",
                                     20, 20000);

        Thing[] thingArray = new Thing[3];
        thingArray[0] = empireState;
        thingArray[1] = myHouse;
        thingArray[2] = whiteHouse;

        System.out.println("From our array...");
        for (Thing thing : thingArray) {
            System.out.println(thing);
        }
    }
}
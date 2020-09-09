package x26LinkedLists;

import java.util.LinkedList;
public class LinkedLists {
    static LinkedList<String> houses = new LinkedList<String>();
    public static void main(String[] args) {
        houses.add("Hazelveare");
        houses.add("Summerfield");
        houses.add("School");
        System.out.println(houses.get(1));
        houses.set(0,"HMP Hazelveare");
        System.out.print(houses);
        extension();
    }
    /*
    Using the push command, add Sutton and the
    4 girls houses to the linked list. Then Demonstrate
    you know how pop works




     */









    private static void extension(){
        houses.push("Sutton");
        houses.push("Gosden");
        houses.push("Haygate");
        houses.push("Park");
        houses.pop();
        System.out.println(houses);

    }
}

import java.sql.SQLOutput;

public class Plane {
    int planeID;
    char planeName;
    boolean planeStatusFree;

    Plane(int planeID, char planeName, boolean planeStatusFree){
        this.planeID = planeID;
        this.planeName = planeName;
        this.planeStatusFree = planeStatusFree;
    }


    void display(){
        System.out.println("Plane ID: " + planeID);
        System.out.println("Plane name: " + planeName);
        System.out.println("Plane ststus: " + planeStatusFree);

    }
}

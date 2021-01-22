public class Flight {

        int flightID;
    int departureTime;
    int arrivalTime;
    Plane plane;

    Flight(int flightID, int departureTime, int arrivalTime, Plane plane){
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.plane = plane;
        this.flightID = flightID;
        }

        void display(){
            System.out.println("Flight number: " + flightID);
            System.out.println("Departure time: " + departureTime);
            System.out.println("Ariival time: " + arrivalTime);
           plane.display();
        }

    }


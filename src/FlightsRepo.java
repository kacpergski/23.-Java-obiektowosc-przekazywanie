public class FlightsRepo {

    Flight[] allFlights;
    int i = 0;
    FlightsRepo(int size){
       allFlights = new Flight[size];

    }

    void add (Flight flight){
        if (i < allFlights.length & flight.plane.planeStatusFree != false){

        allFlights[i]=flight;
        flight.plane.planeStatusFree = false;
         i++;  }
        else {
            System.out.println("****************");
            System.out.println("Brak wolnego samolotu dla lotu: " + flight.flightID);
            System.out.println("****************");
        }

    }
         void displayAll(){
             for (int j = 0; j < allFlights.length & allFlights[j] !=null; j++) {
                allFlights[j].display();
                 System.out.println("------------");
             }

    }
}
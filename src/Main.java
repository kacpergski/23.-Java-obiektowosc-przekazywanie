public class Main {
    public static void main(String[] args) {
            int n=4;
        CompanyRepo companyRepo = new CompanyRepo(n);

        char[]name = {'F','i','r','m','a'};
        char[]street = {'B','o','l','k','a'};
        Address address = new Address(street,22, 3);
        Company c1 = new Company(name,address,121345 );
        companyRepo.add(c1);
        char[]name2 = {'F','i','r','m','a','B'};
        char[]name3 = {'w','i','r','E','X'};

        Address address2 = new Address (street,23, 7);
        Company c2 = new Company(name2,address,122345 );
        companyRepo.add(c2);

        Address address3 = new Address (street,13, 1);
        Company c3 = new Company(name2,address,1223345 );
        companyRepo.add(c3);

//        companyRepo.displayAll();
//        companyRepo.company = companyRepo.findNIP(122345);
        // Zadanie 3 FLIGHTS DATABASE

        Plane p1 = new Plane (5555,'A',true);
        Plane p2 = new Plane (2222,'B',true);
        Plane p3 = new Plane (3333,'C',true);
        Flight f1 = new Flight(1212,15,23,p1);
        Flight f2 = new Flight(9999,16,22,p3);
        Flight f3 = new Flight(2399,1,12,p2);
        Flight f4 = new Flight(2323,11,9,p3);
        //    f1.display();

        FlightsRepo flightsRepo = new FlightsRepo(5);
        flightsRepo.add(f1);
        flightsRepo.add(f2);
        flightsRepo.add(f3);
        flightsRepo.add(f4);
        //f2.display();

        flightsRepo.displayAll();
    }
}

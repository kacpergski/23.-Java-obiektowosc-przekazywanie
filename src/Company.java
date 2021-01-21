import java.sql.SQLOutput;

public class Company {
    char[] name;
    Address address;
    long nip;


    Company(char [] name, Address address, long nip){
        this.name =  name;
        this.address = address;
        this.nip = nip;
    }

    void display(){
        System.out.print("Name :");
        for (char n: name ){
            System.out.print(n);
                    }
        System.out.println();
        System.out.println("NIP: "+nip);
        address.display();
    }
}

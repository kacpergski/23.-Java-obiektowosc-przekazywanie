public class Main {
    public static void main(String[] args) {
            int n=2;
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

        companyRepo.displayAll();
        companyRepo.company = companyRepo.findNIP(122345);
    }
}

public class CompanyRepo {
    Company[] companies;  // nadanie referenji o nazwie companies dla typu obiektów Company
int iterator =0;
  CompanyRepo(int size){
      companies = new Company[size];   // utworzenie nowego obiektu typu Company z referencją companies i rozomiarze size

  }

    void add (Company company){         //metoda o referncji add, zaincjowana za pomocą obiektu Company o referencji company
    if(iterator< companies.length){
        companies[iterator] = company;
        iterator++;}
    else {
        System.out.println("ZA mało miejsc na firmę: " );
company.display();
    }
        // ddodanie company do tablicy companies
  }

  void displayAll() {
      for (int i = 0; i < companies.length && companies[i] != null; i++) {
          System.out.println("---------------");
          companies[i].display();
      }

//Company findNIP (long NIP){    jghg

  }
}

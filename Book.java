package exercise2;


class Book{
    static int count;

    static{
        count=0;
    }


    int id;
    String name;
    String author;
    int shelf;
    boolean issued;

    Book(){

    }

    Book(String name, String author, int shelf){
        this.id = ++count;
        this.name = name;
        this.author = author;
        this.shelf = shelf;
        issued = false;
    }

    void showDetails(){
        System.out.println("----- BOOK -----");
        System.out.println("id - " + id);
        System.out.println("name - " + name);
        System.out.println("author - " + author);
        System.out.println("shelf - " + shelf);
        System.out.println("issued - " + issued);
    }

}

//package exercise2;
//
//
//class Library{
//    int numberOfBooks;
//    String librarian;
//    int numberOfMembers;
//
//    Book []bank;
//
//    Library(){
//        bank = new Book[1000];
//    }
//
//    private void setLibrarian(String name)
//    {
//        this.librarian = name;
//    }
//
//    public void setDetails(int books, String name, int members){
//        numberOfBooks = books;
//        numberOfMembers = members;
//        setLibrarian(name);
//    }
//
//    public void showDetails(){
//        System.out.println("this library is run by - " + librarian);
//        System.out.println("its has " + numberOfBooks + " books.");
//        System.out.println("its is used by " + numberOfMembers + " members.");
//    }
//
//    public void addBook(Book newBook){
//        // to add a new book to the library
//    }
//
//    public void issueBook(Member m){
//        // to issue a book by a person
//    }
//
//    public void returnBook(Member m, Book b){
//        // to return a book
//    }
//
//    public Book getBookById(int id){
//        // to search a book by its id.
//    }
//}
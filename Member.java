package exercise2;

class Member{
    static int count;
    int id;
    String name;

    static {
        count=0;
    }
//    we can add here that what all books are currently issued by this member.
//    Book []issuedBooks = new Book[10];


    Member(String name){
        id = ++count;
        this.name = name;

    }


}

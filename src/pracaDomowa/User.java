package pracaDomowa;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new Book[0];
    }

    public void addBook(Book book){
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

}

// Given a stack of books, remove a specific book without disturbing the order.
package streams_api.example_question.stack;
import java.util.Stack;

public class Example7 {
    public static void main(String[] args) {

        Stack<Book> stackOfBooks = new Stack<>();
        stackOfBooks.push(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "ISBN101"));
        stackOfBooks.push(new Book("Atomic Habits", "James Clear", "ISBN102"));
        stackOfBooks.push(new Book("The Alchemist", "Paulo Coelho", "ISBN103"));
        stackOfBooks.push(new Book("Think and Grow Rich", "Napoleon Hill", "ISBN104"));
        stackOfBooks.push(new Book("Deep Work", "Cal Newport", "ISBN105"));
        remove(stackOfBooks,"The Alchemist");
        System.out.println(stackOfBooks);
    }
    public static void remove(Stack<Book> stackOfBooks,String bookName){
        Stack<Book> st2 = new Stack<>();
        while(!stackOfBooks.isEmpty() && !stackOfBooks.peek().bookName.equals(bookName)){
            st2.push(stackOfBooks.pop());
        }
        if(!stackOfBooks.isEmpty()){
            Book deletedBook = stackOfBooks.pop();
            System.out.println("Book deleted Successfully with book name "+deletedBook.bookName);
        }
        else{
            System.out.println("Sorry no book found with book name "+bookName);
        }
        while(!st2.isEmpty()){
            stackOfBooks.push(st2.pop());
        }
    }
}

class Book{
    String bookName;
    String authorName;
    String ISBN;

    public Book(String bookName, String authorName, String ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }
    @Override
    public String toString(){
        return "["+this.bookName+" , "+this.authorName+" , "+this.ISBN+" ]";
    }
}

import java.util.ArrayList;

public class Checkout_system {

    public static final double NEWBOOK = 1.2;
    public static final double NORMALBOOK =1.0;
    public static final double UNSALABLEBOOK = 0.6;

    public ArrayList<Book> Books;

    public Checkout_system(){
        this.Books = new ArrayList<Book>();
    }

    public void addBooks(Book book){
        this.Books.add(book);
    }

    public double BooksCheckoutPrice(ArrayList<Book> Books){
        if(Books.isEmpty()){
            return 0;
        }
        else {
            double price = 0;
            for(Book book : Books){
                if(book.getBookType() == 1) {
                    price += book.getOldvalue()*NEWBOOK;
                }
                else if (book.getBookType() == 2){
                    price += book.getOldvalue()*NORMALBOOK;
                }
                else if (book.getBookType() == 2){
                    price += book.getOldvalue()*UNSALABLEBOOK;
                }
            }
            return price;
        }
    }
}

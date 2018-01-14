import org.junit.Before;
import org.junit.Test;

public class test {

    private Checkout_system checkout_system ;

    @Before
    public void setup() throws Exception{
        this. checkout_system = new Checkout_system();



    }

    @Test
    public void addBooks() throws Exception{
        Book book1 = new Book("A", 12.6, 2);
        checkout_system.addBooks(book1);
        Book book2 = new Book("B", 18.8, 1);
        checkout_system.addBooks(book2);
        Book book3 = new Book("C", 21.8, 3);
        checkout_system.addBooks(book3);

        System.out.println("添加书本成功！");
    }

    @Test
    public void BooksCheckoutPrice(){
        Book book1 = new Book("A", 12.6, 2);
        checkout_system.addBooks(book1);
        Book book2 = new Book("B", 18.8, 1);
        checkout_system.addBooks(book2);
        Book book3 = new Book("C", 21.8, 3);
        checkout_system.addBooks(book3);
        System.out.println("书的总价格是 " + checkout_system.BooksCheckoutPrice(checkout_system.Books));
    }
}

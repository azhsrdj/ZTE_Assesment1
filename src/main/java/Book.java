public class Book {
    private String BookName;
    private double oldvalue ;
    private int BookType ;

    public Book(String bookName, double oldvalue, int bookType){
        this.BookName = bookName;
        this.oldvalue = oldvalue;
        this.BookType = bookType;
    }

    public void setvalue(double value){
        this.oldvalue = value;
    }

    public double getOldvalue(){
        return this.oldvalue;
    }
/***********
 * @Author: Charles_Wu
 * @Data: 15:27 2018/1/14
 * @Description: if NewBook booktype = 1
 * **************if NormalBook booktype =2
 * **************if UnsalableBook booktype = 3
 ****************************************/
    public void setBookType(int bookType){
        this.BookType = bookType;
    }

    public int getBookType(){
        return this.BookType;
    }

    public String getBookName(){
        return this.BookName;
    }
}

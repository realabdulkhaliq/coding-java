

/**
 *
 * @author Abdul Khaliq
 */
public class Book {
    String name;
    String isbn;
    String author;
    String publisher;
    
    
    public Book(){
        name="Computer";
        isbn="second";
        author="M.HARIS";
        publisher="ABDUL KHALIQ";}
        
        
    public Book(String n, String i, String a, String p){
        name=n;
        isbn=i;
        author=a;
        publisher=p;}
    
    
    public String getName(){
        return name;}
    public void setName(String name){
        this.name=name;}
    
    public String getISBN(){
        return isbn;}
    public void setISBN(String isbn){
        this.isbn=isbn;}
    
    public String getAuthor(){
        return author;}
    public void setAuthor(String author){
        this.author=author;}
    
    public String getPublisher(){
        return publisher;}
    public void setPublisher(String publisher){
        this.publisher=publisher;}
    
    
    public void getBookInfo(){
        System.out.println("Book: "+name+"\n Edition: "+isbn+"\n Author: "+author+"\n Publisher: "+publisher);
    }
        
    }
    

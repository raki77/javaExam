interface Aggregate {
    public abstract Iterator iterator();
   }
   
   interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
   }
   
   class Book {
    private String name ="";
    public Book(String name) {
     this.name = name;
    }
   
   
    public String getName() {
     return name;
    }
   }
   
   class BookShelf implements Aggregate {
    private Book[] books;
    private int last =0;
    
    public BookShelf(int maxsize){
     this.books = new Book[maxsize];
    }
    
    public Book getBookAt(int index) {
     return books[index];
    }
    
    public void appendBook(Book book) {
     this.books[last] = book;
     last++;
    }
    
    public int getLength(){
     return last;
    }
    
    public Iterator iterator(){
     return new BookReal(this);
    }
   }
   
   class BookReal implements Iterator{
    private BookShelf bookShelf;
    private int index;
    
    public BookReal(BookShelf bookShelf){
     this.bookShelf = bookShelf;
     this.index = 0;
    }
    
    public boolean hasNext() {
     if(index<bookShelf.getLength()) {
      return true;
     }else {
      return false;
     }
    }
    
    public Object next() {
     Book book = bookShelf.getBookAt(index);
     index++;
     return book;
    }
   }
   
   
   public class main2 {
   
    
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     BookShelf bookShelf = new BookShelf(3);
     bookShelf.appendBook(new Book("C 언어 정복 "));
     bookShelf.appendBook(new Book("Java 잘하기"));
     bookShelf.appendBook(new Book("C++ 자료 구조"));
     
     Iterator it = bookShelf.iterator();
     while(it.hasNext()) {
      Book book = (Book)it.next();
      System.out.println(""+ book.getName());
     }
   
    }
   
   }
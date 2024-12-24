public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private String datePublished;
    private String publisher;
    
    public Book(String title, String author, String ISBN, String genre, String datePublished, String publisher) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.datePublished = datePublished;
        this .publisher = publisher;
    }
   
    /****************************
               Getters
    ****************************/
   public String getTitle() {
       return this.title;
   }
   
   public String getAuthor(){
       return this.author;
   }
   
   public String getISBN(){
       return this.ISBN;
   }
   
   public String getGenre() {
       return this.genre;
   }
   
   public String getPublisher(){
       return this.publisher;
   }
   
   public String datePublished(){
       return this.datePublished;
   }
   
   /****************************
            Setters
   ****************************/
   public void setTitle(String title) {
       this.title = title;
   }
   
   public void setAuthor(String author) {
       this.author = author;
   }
   
   public void setGenre(String genre) {
       this.genre = genre;
   }
   
   public void setDatePublished(String date) {
       this.datePublished = date;
   }
   
   public void setPublisher(String publisher) {
       this.publisher = publisher;
   }
}

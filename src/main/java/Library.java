public class Library {
   private String libraryName;
   private String address;
   private String[] bookGenres;
   private String[] librarians;
   private String openingHours;
   private String contactInfo;
   
   
   public Library(String libraryName, String address, String[] bookGenres, String librarians[], String openingHours, String contactInfo) {
       this.libraryName = libraryName;
       this.address = address;
       this.bookGenres = bookGenres;
       this.librarians = librarians;
       this.openingHours = openingHours;
       this.contactInfo = contactInfo;
   }
   
    /****************************
               Getters
    ****************************/
   public String getLibraryName() {
       return this.libraryName;
   }
   
   public String getAddress() {
       return this.address;
   }
   
   public String getBookGenres() {
       String genres = "";
       for(int i=0; i < bookGenres.length; i++) {
           if(i < bookGenres.length - 1){
               genres += bookGenres[i] + "," + " ";
           } else {
               genres += bookGenres[i];
           }
       }
       return genres;
   }
   
   public String getLibrarians() {
       String librarns = "";
       for(int i = 0; i < librarians.length; i++) {
           if(i < librarians.length - 1){
               librarns += librarians[i] + "," + " ";
           } else {
               librarns += librarians[i];           }
       }
       return librarns;
   }
   
   public String getOpeningHours() {
       return this.openingHours;
   }
   
   public String getContactInfo() {
       return this.contactInfo;
   }
    
   /****************************
              Setters
   ****************************/
   public void setLibraryName(String libraryName) {
       this.libraryName = libraryName;
   }
   
   public void setAddress(String address){
       this.address = address;
   }
   
   public void setBookGenres(String[] bookGenres) {
       this.bookGenres = bookGenres;
   }
   
   public void setLibrarians(String[] librarians) {
       this.librarians = librarians;
   }
   
   public void setOpeningHours(String openingHours) {
       this.openingHours = openingHours;
   }
   public void setContactInfo(String contactInfo){
       this.contactInfo = contactInfo;
   }
   
}

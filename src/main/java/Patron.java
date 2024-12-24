public class Patron {
    private String id;
    private String name;
    private String contactInfo;
    
    public Patron(String id, String name, String contactInfo){
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }
    
    /****************************
               Getters
     ****************************/
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getContactInfo() {
        return this.name;
    }
    
    /****************************
               Setters
    ****************************/
    public void setName(String name){
        this.name = name;
    }
    
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

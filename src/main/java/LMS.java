public class LMS {

    public static void main(String[] args) {
        
        // Hangpoint library
        Library hangpoint = new Library(
                "Hangpoint Library", 
                "Kumasi-Adum", 
                new String[]{"Science fiction", "self-improvement", "academic", "Horror"}, 
                new String[]{"George", "Akosua", "Kwame"}, 
                "6:00am-6:00pm", 
                "+233-234-08-3457"
        );
        
        // Mastermind library
        Library mastermind = new Library(
                "Mastermind library",
                "Accra-Madina",
                new String[]{"Science", "fiction", "Rom-Com", "crime", "Horror", "myth"},
                new String[]{"Jake", "Chris", "Christian"},
                "9:00am - 5:00pm",
                "+233-454-67-9574"
        );
        
        //  New book object
        Book bookOne = new Book(
                "How to Win Friends and Influence People",
                "Dale Carnegie",
                "9834838437",
                "Self-Improvement",
                "19th July 2002",
                "Simon & Schuster"
        );
        
        // New patron
        Patron activePatron = new Patron("001", "Joe", "+233-234-87-9825");
        
        
    }
}

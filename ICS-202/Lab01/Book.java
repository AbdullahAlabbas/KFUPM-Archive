package Lab01;

public class Book 
{
    private String title;
    private int pages;
    

    public Book(String title, int pages)
    {
        this.title = title;
        this.pages = pages;
    }
    // geters because the var are private 
    public String getTitle() { return title;}
    public int getPages() { return pages;}

    // override it so it can print the title and the number of pages
    @Override
    public String toString() { return "Book: " + getTitle() + ", # Pages = " + getPages(); }

} // end of Book class

class Textbook extends Book
{
    private String course;

        public Textbook(String title, int pages, String course)
    {
        super(title , pages); // super because it is from the book class not the textbook
        this.course = course;
    }

    public String getCourse() { return course; }

    // override it again to add the course 
    @Override
    public String toString() { return "Text Book: " + getTitle() + ", " + getCourse() + ", # Pages = " + getPages() + ", Course = " + getCourse();}  
} // end of Textbook class

class Q1
{
    public static void main(String[] args) 
    {
        // 10 object of type book and textbook
        Book[] library = new Book[10]; 
        
        library[0] = new Book("ABC", 100);
        library[1] = new Book("Arabic", 100);
        library[2] = new Textbook("Data Structure", 200, "ICS202");
        library[3] = new Textbook("Writing Practice", 300, "ENGL-101");
        library[4] = new Textbook("Algebra", 500, "MATH-101");
        library[5] = new Book("Water Conservation", 200);
        library[6] = new Book("Enviroment", 150);
        library[7] = new Book("Teach yourself Visual C++", 300);
        library[8] = new Book("Notebook", 300);
        library[9] = new Textbook("Introduction to Technology", 500, "TECH-102");

        // counters
        int numOfBooks = 0;
        int numOfTextBooks = 0;

        for(Book book : library)
        {
            System.out.println(book);

            if (book instanceof Textbook) // if the object is textbook add 1 to the textbook otherwise add to book
                numOfTextBooks++;
            else
                numOfBooks++;
        }
    System.out.println("Number of Books = " + numOfBooks);

    System.out.println("Number of TextBooks = " + numOfTextBooks);

    }
} // end of MAIN class



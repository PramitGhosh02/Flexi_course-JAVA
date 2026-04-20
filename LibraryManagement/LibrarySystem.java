import java.util.ArrayList;
import java.util.Iterator;

public class LibrarySystem {
    // 1. Using ArrayList to handle a dynamic collection of Books
    private ArrayList<Book> library = new ArrayList<>();

    // Add a new book (Highlighting dynamic resizing)
    public void addBook(Book book) {
        library.add(book);
        System.out.println("\u2705 Added: " + book.getTitle());
        System.out.println("   [ArrayList automatically resized. Total books now: " + library.size() + "]");
    }

    // Remove issued book by title (Easy data handling)
    public void issueBook(String title) {
        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getTitle().equalsIgnoreCase(title)) {
                iterator.remove(); // Safely removes from ArrayList
                System.out.println("\uD83D\uDCDD Issued (and removed): " + b.getTitle());
                System.out.println("   [Total books left: " + library.size() + "]");
                return;
            }
        }
        System.out.println("\u274C Book not found: " + title);
    }

    // Search for a book by title
    public void searchBook(String title) {
        for (Book b : library) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("\uD83D\uDD0D Found: " + b);
                return;
            }
        }
        System.out.println("\u274C Search yielded no results for: " + title);
    }

    // Display all available books
    public void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("\n--- \uD83D\uDCDA Available Library Books ---");
        for (Book b : library) {
            System.out.println(" - " + b);
        }
        System.out.println("--------------------------------\n");
    }

    // Main execution block to demonstrate the system
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        
        System.out.println("=== Library Book Management System Initialized ===\n");
        
        // 1. Adding books dynamically
        system.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        system.addBook(new Book("1984", "George Orwell", "978-0451524935"));
        system.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0060935467"));
        system.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769488"));
        
        // 2. Display all books
        system.displayBooks();
        
        // 3. Search for a specific book
        System.out.println("Searching for a book with '1984' in the title...");
        system.searchBook("1984");
        
        // 4. Remove a book (simulating issuing it to a student)
        System.out.println("\nIssuing '1984' to a student...");
        system.issueBook("1984");
        
        // 5. Display again to verify the ArrayList shifted correctly
        system.displayBooks();
    }
}

package Exercice5;

public class Main {
	public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("978-2123456803", "Java Avancé", "Auteur A");
        lib.addBookIndexed(b1);
        
        lib.borrowBook(b1, "Alice");
        System.out.println("Livre trouvé par ISBN : " + lib.findByIsbn("978-2123456803"));
    }
}

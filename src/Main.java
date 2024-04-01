public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 250, 800, "John Doe");
        Magazine magazine = new Magazine("Tech Today", 599, 6500, 200);

        book.orderCopies(50);
        magazine.receiveIssue();

        System.out.println("Book Copies Ordered: " + book.copies);
        System.out.println("Book Copies sale: " + (book.copies*book.price));
        System.out.println("Magazine Total Ordered:  " + magazine.copies );
        System.out.println("Magazine Total Sale:  " + (magazine.copies * magazine.price));
    }
}
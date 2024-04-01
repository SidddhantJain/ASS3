class Book extends Publication {
    String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int orderedCopies) {
        copies += orderedCopies;
    }

}
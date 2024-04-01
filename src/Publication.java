class Publication {
    String title;
    double price;
    int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void setcopies(int copies){
        this.copies=copies;
    }

    public void sellcopy(int qty){
        System.out.println("Total Publication sell: $" + (qty*price));
    }
    public void saleCopy(int soldCopies) {
        copies -= soldCopies;
    }
}

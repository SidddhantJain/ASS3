class Magazine extends Publication {
    int orderQty;

    public Magazine(String title, double price, int copies, int orderQty) {
        super(title, price, copies);
        this.orderQty = orderQty;
    }

    public void receiveIssue() {
        copies += orderQty;
    }

    public void currentIssue() {
        System.out.println("Current issue of " + title);
    }
}
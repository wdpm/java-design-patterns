package io.github.wdpm.pattern.structural.decorator;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class Client {
    public static void main(String[] args) {
        Ticket myTicket = getMyTicket();
        myTicket.print();
    }

    public static Ticket getMyTicket() {
        return new Footer(new Header(new SalesTicket()));
    }

    /*
    Add header...
    SalesTicket print code logic
    Add footer...
     */
}

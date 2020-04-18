package io.github.wdpm.pattern.structural.decorator;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class Header extends TicketDecorator {
    public Header(Ticket ticket) {
        super(ticket);
    }

    @Override
    void print() {
        // add header print logic here
        System.out.println("Add header...");

        super.print();
    }
}

package io.github.wdpm.pattern.structural.decorator;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class Footer extends TicketDecorator {
    public Footer(Ticket ticket) {
        super(ticket);
    }

    @Override
    void print() {
        super.print();

        // add footer print logic here
        System.out.println("Add footer...");
    }
}

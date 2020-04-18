package io.github.wdpm.pattern.structural.decorator;

import java.util.Objects;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class TicketDecorator extends Ticket {

    /**
     * the ticket being decorated
     */
    private Ticket ticket;

    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    void print() {
        Objects.requireNonNull(ticket);
        ticket.print();
    }
}

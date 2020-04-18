package io.github.wdpm.pattern.structural.decorator;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SalesTicket extends Ticket {
    @Override
    void print() {
        System.out.println("SalesTicket print code logic");
    }
}

package com.sci.week_ten_Concurrency;

import java.util.ArrayList;
import java.util.Collections;
import static com.sci.week_ten_Concurrency.TicketType.*;

public class FestivalGate {

    ArrayList<TicketType> tickets = new ArrayList<>();

    boolean isClosed = true;

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public void addTicket(TicketType ticketType){
        tickets.add(ticketType);
    }

    void countTickets(){

        System.out.println();
        System.out.println("----------------- LIVE STATS ---------------");
        System.out.println("Total tickets sold: " + tickets.size());
        System.out.println("FULLVIP " + Collections.frequency(tickets, FULLVIP));
        System.out.println("FULL " + Collections.frequency(tickets, FULL));
        System.out.println("FREEPASS " + Collections.frequency(tickets, FREEPASS));
        System.out.println("ONEDAY " + Collections.frequency(tickets, ONEDAY));
        System.out.println("ONEDAYVIP " + Collections.frequency(tickets, ONEDAYVIP));
        System.out.println();
    }
}
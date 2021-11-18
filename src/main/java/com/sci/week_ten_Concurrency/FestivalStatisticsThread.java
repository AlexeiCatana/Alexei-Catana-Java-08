package com.sci.week_ten_Concurrency;

public class FestivalStatisticsThread extends Thread {

    FestivalGate gate;

    FestivalStatisticsThread(FestivalGate gate){
        this.gate = gate;
    }

    @Override
    public void run(){

        boolean shouldRunOneMoreTime = true;
       do {
            gate.countTickets();
            if (gate.isClosed()){
                shouldRunOneMoreTime = false;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (!gate.isClosed() || shouldRunOneMoreTime);

    }
}

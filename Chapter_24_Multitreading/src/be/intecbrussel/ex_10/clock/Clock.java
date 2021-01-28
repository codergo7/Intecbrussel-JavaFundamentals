package be.intecbrussel.ex_10.clock;

import java.util.TimerTask;

public class Clock extends TimerTask {

    int hour;
    int minute;
    int second;

    @Override
    public void run() {

        while (true){

            if(second>59){
                minute++;
                second=0;

                if (minute>59){
                    hour++;
                    if (hour>23){
                        hour=0;
                    }
                    minute=0;
                }
            }

           try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((hour>9?hour:"0"+hour) + ":" + (minute>9?minute:"0"+minute) + ":" + (second>9?second:"0"+second));
            second++;
        }

    }
}

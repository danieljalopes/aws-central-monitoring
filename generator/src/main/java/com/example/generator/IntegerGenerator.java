package com.example.generator;




import java.util.concurrent.TimeUnit;
import org.jboss.logging.Logger;

import javax.inject.Inject;

public class IntegerGenerator implements Runnable{

    private Integer counter = 0;

    @Inject
    private Logger log;

    @Override
    public void run() {

        while (counter <= 1000){
            counter = counter++;
            try {
                TimeUnit.SECONDS.sleep(1);
                log.info("Thread name: " + Thread.currentThread().getName() + " - counter value: " + this.counter);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
            }

        }
    }


}

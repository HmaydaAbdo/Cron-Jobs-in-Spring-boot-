package spring.learn.scheduled.motivation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class Message {

    private static final Logger log = LoggerFactory.getLogger(Message.class);

    // task which  runs every 5 secondes
    @Scheduled(fixedDelay = 5000)
    public void morningMotivation(){
      log.trace("getting an other message ");
      System.out.println("Every great achievement was once considered impossible. Keep working, and you’ll make it possible!");
    }

    //task which runs every
}

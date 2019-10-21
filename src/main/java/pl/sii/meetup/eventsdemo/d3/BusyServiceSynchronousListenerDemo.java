package pl.sii.meetup.eventsdemo.d3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BusyServiceSynchronousListenerDemo {

    @EventListener
    public void onApplicationEvent( JobDoneCustomEvent event ) throws InterruptedException {
        log.info( "Job Done event received: {}", event );
        Thread.sleep( 1000 );
    }
}

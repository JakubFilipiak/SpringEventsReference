package pl.sii.meetup.eventsdemo.d5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class YetAnotherEventListenerDemo {

    @Async
    @EventListener
    public void onApplicationEvent( YetAnotherEventEvent event ) {
        log.info( "YA event received for requestId={} and eventId={}", event.getRequestId(), event.getEventId() );
    }
}

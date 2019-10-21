package pl.sii.meetup.eventsdemo.d4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class YetAnotherEventListenerDemo {

    @EventListener
    public void onApplicationEvent( YetAnotherEventEvent event ) {
        log.info( "YA event received for requestId={} and eventId={}", event.getRequestId(), event.getEventId() );
    }
}

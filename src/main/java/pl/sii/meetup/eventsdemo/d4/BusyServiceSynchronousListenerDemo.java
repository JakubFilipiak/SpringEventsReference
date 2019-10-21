package pl.sii.meetup.eventsdemo.d4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.sii.meetup.eventsdemo.d3.JobDoneCustomEvent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@Service
public class BusyServiceSynchronousListenerDemo {

    @EventListener
    public List<YetAnotherEventEvent> onApplicationEvent( JobDoneCustomEvent event ) {
        log.info( "Job Done event received: {}", event );
        return IntStream.range( 0, 10 ).mapToObj( it -> new YetAnotherEventEvent( this, event.getRequestId(), it ) ).collect( Collectors.toList() );
    }
}

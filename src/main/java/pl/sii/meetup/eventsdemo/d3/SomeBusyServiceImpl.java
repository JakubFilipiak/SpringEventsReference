package pl.sii.meetup.eventsdemo.d3;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SomeBusyServiceImpl implements SomeBusyService, ApplicationEventPublisherAware {

    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void doWork( int requestId ) {
        log.info( "Doing work for requestId: {}", requestId );
        applicationEventPublisher.publishEvent( new JobDoneCustomEvent( this, requestId ) );
    }

}

package pl.sii.meetup.eventsdemo.d1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.ServletRequestHandledEvent;

@Slf4j
@Service
public class RequestListenerDemo implements ApplicationListener<ServletRequestHandledEvent> {
    @Override
    public void onApplicationEvent( ServletRequestHandledEvent event ) {
        log.info( "Servlet Request Handled Event received: {}", event );
    }
}

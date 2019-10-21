package pl.sii.meetup.eventsdemo.d6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookEventListenerDemo {

//    @Async
    @EventListener
    public void onApplicationEvent( BooksEvent event ) {
        log.info( "Book event received for author={} and books.size={}",
                event.getAuthor(),
                event.getAuthor().getBooks().size() );
    }
}

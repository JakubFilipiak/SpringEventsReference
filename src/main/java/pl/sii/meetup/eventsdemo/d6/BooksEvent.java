package pl.sii.meetup.eventsdemo.d6;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class BooksEvent extends ApplicationEvent {

    private final Author author;

    public BooksEvent( Object source, Author author ) {
        super( source );
        this.author = author;
    }
}

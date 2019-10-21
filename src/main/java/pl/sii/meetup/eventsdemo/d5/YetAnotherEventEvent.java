package pl.sii.meetup.eventsdemo.d5;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@ToString
public class YetAnotherEventEvent extends ApplicationEvent {

    private int requestId;
    private int eventId;

    /**
     * Create a new ApplicationEvent.
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public YetAnotherEventEvent( Object source, int requestId, int eventId ) {
        super( source );
        this.requestId = requestId;
        this.eventId = eventId;
    }
}

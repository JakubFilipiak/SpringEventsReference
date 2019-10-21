package pl.sii.meetup.eventsdemo.d3;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@ToString
public class JobDoneCustomEvent extends ApplicationEvent {

    private int requestId;

    /**
     * Create a new ApplicationEvent.
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public JobDoneCustomEvent( Object source, int requestId ) {
        super( source );
        this.requestId = requestId;
    }
}

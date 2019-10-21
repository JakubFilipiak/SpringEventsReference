package pl.sii.meetup.eventsdemo.d3.support;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class DefaultUniqueRequestIdProvider implements UniqueRequestIdProvider {

    private static final AtomicInteger requestId = new AtomicInteger( 0 );

    @Override
    public int next() {
        return requestId.incrementAndGet();
    }
}

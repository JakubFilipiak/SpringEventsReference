package pl.sii.meetup.eventsdemo.d3;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sii.meetup.eventsdemo.d3.support.UniqueRequestIdProvider;

@RestController
@RequestMapping("/working")
@Slf4j
@RequiredArgsConstructor
public class WorkingController {

    private final SomeBusyService someBusyService;
    private final UniqueRequestIdProvider uniqueRequestIdProvider;

    @GetMapping
    public String doWork() {
        var requestId = uniqueRequestIdProvider.next();
        log.info( "Do Work started for requestId {}", requestId );
        someBusyService.doWork( requestId );
        log.info( "Job done" );
        return "Hello World!\n";
    }

    @GetMapping("/long")
    public String longHelloWorld() throws InterruptedException {
        log.info( "Long Hello World started" );
        Thread.sleep( 1000 );
        return "Hello World after long time!\n";
    }
}

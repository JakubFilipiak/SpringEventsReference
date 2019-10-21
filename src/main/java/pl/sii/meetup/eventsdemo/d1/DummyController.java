package pl.sii.meetup.eventsdemo.d1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
@Slf4j
public class DummyController {

    @GetMapping
    public String helloWorld() {
        log.info( "Hello World started" );
        return "Hello World!\n";
    }

    @GetMapping("/long")
    public String longHelloWorld() throws InterruptedException {
        log.info( "Long Hello World started" );
        Thread.sleep( 1000 );
        return "Hello World after long time!\n";
    }
}

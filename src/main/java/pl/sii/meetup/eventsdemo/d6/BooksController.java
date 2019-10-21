package pl.sii.meetup.eventsdemo.d6;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Slf4j
@RequiredArgsConstructor
public class BooksController implements ApplicationEventPublisherAware {

    private final AuthorRepository authorRepository;
    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/{authorId}")
    public String helloWorld( @PathVariable int authorId ) {
        var author = authorRepository.findById( authorId ).orElseThrow();
        log.info( "Fetched author: {} {}", author.getFirstName(), author.getLastName() );
        applicationEventPublisher.publishEvent( new BooksEvent( this, author ) );
        return "Hello Books!\n";
    }

}

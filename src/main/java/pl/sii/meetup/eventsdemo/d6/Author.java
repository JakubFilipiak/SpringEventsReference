package pl.sii.meetup.eventsdemo.d6;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books = new ArrayList<>();

    public void addBook( Book book ) {
        this.books.add( book );
        book.setAuthor( this );
    }

    public void removeBook( Book book ) {
        this.books.remove( book );
        book.setAuthor( null );
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

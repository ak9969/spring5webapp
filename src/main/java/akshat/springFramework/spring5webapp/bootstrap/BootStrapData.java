package akshat.springFramework.spring5webapp.bootstrap;

import akshat.springFramework.spring5webapp.domain.Author;
import akshat.springFramework.spring5webapp.domain.Book;
import akshat.springFramework.spring5webapp.repositories.AuthorRepository;
import akshat.springFramework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Desigin", "123312");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        Author rod = new Author("Ericads","Evanasds");
        Book god = new Book("Domain Driasdven Desigin", "123q2e312");
        rod.getBooks().add(god);
        god.getAuthor().add(rod);
        authorRepository.save(rod);
        bookRepository.save(god);
        System.out.println("Number of Books: "+bookRepository.count());
    }
}

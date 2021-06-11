package akshat.springFramework.spring5webapp.repositories;

import akshat.springFramework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
public interface BookRepository extends CrudRepository<Book,Long>{
}

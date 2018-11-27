package mohit.springframework.springwebapp5.repositories;

import org.springframework.data.repository.CrudRepository;

import mohit.springframework.springwebapp5.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

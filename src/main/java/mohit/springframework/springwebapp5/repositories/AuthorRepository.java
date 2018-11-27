package mohit.springframework.springwebapp5.repositories;

import org.springframework.data.repository.CrudRepository;

import mohit.springframework.springwebapp5.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

package mohit.springframework.springwebapp5.repositories;

import org.springframework.data.repository.CrudRepository;

import mohit.springframework.springwebapp5.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

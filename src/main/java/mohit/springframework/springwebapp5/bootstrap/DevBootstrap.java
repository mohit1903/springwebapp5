package mohit.springframework.springwebapp5.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import mohit.springframework.springwebapp5.model.Author;
import mohit.springframework.springwebapp5.model.Book;
import mohit.springframework.springwebapp5.model.Publisher;
import mohit.springframework.springwebapp5.repositories.AuthorRepository;
import mohit.springframework.springwebapp5.repositories.BookRepository;
import mohit.springframework.springwebapp5.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	


	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	private void initData() {
		// Adding Book Details
		
		Publisher obj=new Publisher();
		obj.setName("Self Published");
		obj.setAddress("Gachibowli Hyderabad");
		publisherRepository.save(obj);
		
		Author mohit =new Author("Mohit", "Garg");
		Book book=new Book("Spring Project Book","1234",obj);
		mohit.getBooks().add(book);
		authorRepository.save(mohit);
		bookRepository.save(book);
		
		
		Publisher obj1=new Publisher();
		obj1.setName("Algo1");
		obj1.setAddress("Hi-Tech Hyderabad");
		publisherRepository.save(obj1);
		
		Author garg=new Author("Mr" , "Garg");
		Book ds=new Book("Data Structure and Algorithms","2345",obj);
		garg.getBooks().add(ds);
		
		authorRepository.save(garg);
		bookRepository.save(ds);
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		initData();
		
	}

}

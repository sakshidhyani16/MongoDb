package com.example.mongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.mongo.Repository.BookRepository;
import com.example.mongo.Repository.UserRepository;
import com.example.mongo.dto.Response;
import com.example.mongo.entity.Book;
import com.example.mongo.entity.User;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired SequenceGeneratorService sequenceGeneratorService;
	
	Response response = new Response();
	public ResponseEntity<Response> addBook(Book book) {

		book.setAuthor(book.getAuthor());
		book.setTitle(book.getTitle());
        book.setId(sequenceGeneratorService.generateSequence(book.SEQUENCE_NAME));
		
		bookRepository.save(book);
		 
		response.setCode(200);
		response.setError(null);
		response.setMessage("success");
		response.setResult(book);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	public ResponseEntity<Response> getBooks() {

		List<Book> books =bookRepository.findAll();
		
		response.setCode(200);
		response.setError(null);
		response.setMessage("success");
		response.setResult(books);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	public ResponseEntity<Response> deleteBook(long bookId) {

		Book book = bookRepository.findById(bookId);
		
		bookRepository.delete(book);
		
		response.setCode(200);
		response.setError(null);
		response.setMessage("success");
		response.setResult(null);
		return new ResponseEntity<Response>(response,HttpStatus.OK);

	}
	public ResponseEntity<Response> addUser(User user) {
		
		user.setAge(user.getAge());
		user.setEmail(user.getEmail());
		user.setName(user.getName());
		user.setId(sequenceGeneratorService.generateSequence(user.SEQUENCE_NAME));
		
		userRepository.save(user);
		 
		response.setCode(200);
		response.setError(null);
		response.setMessage("success");
		response.setResult(user);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

}

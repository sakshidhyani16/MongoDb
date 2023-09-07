package com.example.mongo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.mongo.Service.BookService;
import com.example.mongo.Service.SequenceGeneratorService;
import com.example.mongo.dto.Response;
import com.example.mongo.entity.Book;
import com.example.mongo.entity.User;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	
	@PostMapping(value ="/addBook", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>addBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	
	@GetMapping("/getBooks")
	public ResponseEntity<Response>getBooks(){
		
		return bookService.getBooks();

	}
	

	@DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity<Response>deleteBook(@PathVariable long bookId){
	
	return bookService.deleteBook(bookId);
	
	}

	
	@PostMapping(value ="/addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>addUser(@RequestBody User user){
		return bookService.addUser(user);
	}
	
}

package in.ashokit.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bind.Book;

@RestController
public class BookController 
{
	@PostMapping(value="/addBook",consumes= {"application/json"},produces= {"text/plane"})
	public String addBook(@RequestBody Book book) 
	{
		System.out.println(book);
		return "added sucess";
		
	}

}

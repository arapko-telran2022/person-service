package telran.java2022.person.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 8647573866454320680L;
	
	public PersonNotFoundException() {
		super("Person not found");

	}
	
	public PersonNotFoundException(String id) {
		super("Person with id = " + id + " not found");

	}
	

}

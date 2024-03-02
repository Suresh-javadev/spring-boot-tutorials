package code.with.sk.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import code.with.sk.dto.user.CreateUser;
import jakarta.validation.Valid;

public interface UserAPI {
	
	@GetMapping("/test")
	public ResponseEntity<String> test();
	
	@PostMapping("/create")
	public ResponseEntity<CreateUser> create(@RequestBody @Valid CreateUser user);

}

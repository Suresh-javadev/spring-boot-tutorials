package code.with.sk.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.with.sk.dto.user.CreateUser;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/user")
public class UserController implements UserAPI{

	@Override
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("Thanks for watching");
	}

	@Override
	public ResponseEntity<CreateUser> create(@Valid CreateUser user) {
		
		return ResponseEntity.ok().body(user);
	}
}

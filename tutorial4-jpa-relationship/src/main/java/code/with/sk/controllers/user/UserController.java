package code.with.sk.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.with.sk.dto.user.CreateUser;
import code.with.sk.service.user.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/user")
public class UserController implements UserAPI{

	@Autowired
	private UserService userSerivce;
	
	@Override
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("Thanks for watching");
	}

	@Override
	public ResponseEntity<CreateUser> create(@Valid CreateUser user) {
		
		return ResponseEntity.ok().body(userSerivce.create(user));
	}
}

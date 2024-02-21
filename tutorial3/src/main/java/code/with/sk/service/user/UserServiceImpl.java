package code.with.sk.service.user;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.with.sk.dto.user.CreateUser;
import code.with.sk.modal.user.User;
import code.with.sk.repo.user.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public CreateUser create(CreateUser user) {
		
		Optional<User> found = userRepo.findByUsername(user.getUsername());
		
		if(found.isPresent())
			throw new IllegalArgumentException("User already exists with username: "+user.getUsername());
		
		User userToCreate =new User();
		BeanUtils.copyProperties(user, userToCreate);
		
		userToCreate = userRepo.save(userToCreate);
		
		user.setId(userToCreate.getId());
		return user;
	}

}

package code.with.sk.repo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import code.with.sk.modal.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public Optional<User> findByUsername(String username);

}

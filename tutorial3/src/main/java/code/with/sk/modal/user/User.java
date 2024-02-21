package code.with.sk.modal.user;

import code.with.sk.dto.user.Roles;
import code.with.sk.modal.core.ModalTimeStamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_user")
@Setter
@Getter
public class User extends ModalTimeStamp{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="name", nullable = false, length = 150)
	private String name;
	
	@Column(name="email", nullable = false, length = 320)
	private String email;
	
	@Column(name="username", nullable = false,unique = true, length = 150)
	private String username;
	
	@Column(name="password", nullable = false, length = 150)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable = false,length = 20)
	private Roles role;
	
}

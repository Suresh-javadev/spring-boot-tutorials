package code.with.sk.modal.address;

import code.with.sk.modal.core.ModalTimeStamp;
import code.with.sk.modal.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="tbl_address")
@Data
@EqualsAndHashCode(callSuper=false)
public class Address extends ModalTimeStamp{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private User user;
	
}

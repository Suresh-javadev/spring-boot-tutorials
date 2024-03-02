package code.with.sk.modal.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import code.with.sk.modal.core.ModalTimeStamp;
import code.with.sk.modal.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="tbl_order")
@Data
@EqualsAndHashCode(callSuper=false)
public class Order extends ModalTimeStamp{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id",nullable = false)
	private User user;
	
	@Column(name="amount",nullable = false,precision = 10,scale = 2)
	private BigDecimal amount;
	
	@Column(name="email",nullable = false,length = 150)
	private String email;
	
	@OneToMany( mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
	private Collection<OrderDetails> orderDetails=new ArrayList<>();

}

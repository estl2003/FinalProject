package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class LostItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@NotNull
	@Column
	private String itemName;
	
	@NotNull
	@Column
	private String dateLost;
	
	@NotNull
	@Column
	private String locationLost;
	
	@Column
	private double latitude;
	
	@Column
	private double longitude;
	
	
	
	
	
}

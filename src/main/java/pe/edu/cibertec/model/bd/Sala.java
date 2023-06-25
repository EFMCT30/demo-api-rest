package pe.edu.cibertec.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name ="sala")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idsala;
	@Column(name = "descsala")
	private String descsala;
	@Column(name = "asientos")
	private Integer asientos;
	@Column(name = "idestado")
	private Integer idestado;
	

}

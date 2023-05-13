
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Paso extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Paso() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String	descripcion;
	private String	video;
	private int		numero;


	@NotBlank
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	@URL
	public String getVideo() {
		return this.video;
	}

	public void setVideo(final String video) {
		this.video = video;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(final int numero) {
		this.numero = numero;
	}


	// Relationships ----------------------------------------------------------
	private Entrenamiento entrenamiento;


	@ManyToOne(optional = false)
	public Entrenamiento getEntrenamiento() {
		return this.entrenamiento;
	}

	public void setEntrenamiento(final Entrenamiento entrenamiento) {
		this.entrenamiento = entrenamiento;
	}

}

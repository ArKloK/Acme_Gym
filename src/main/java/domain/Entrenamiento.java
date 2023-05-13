
package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Entrenamiento extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Entrenamiento() {
		super();
		this.gimnasio = new Gimnasio();
		this.pasos = new HashSet<Paso>();
	}


	// Attributes -------------------------------------------------------------

	private String	titulo;
	private String	descripcion;


	@NotBlank
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	@NotBlank
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}


	// Relationships ----------------------------------------------------------

	private Gimnasio			gimnasio;
	private Collection<Paso>	pasos;


	@ManyToOne(optional = false)
	public Gimnasio getGimnasio() {
		return this.gimnasio;
	}

	public void setGimnasio(final Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Paso> getPasos() {
		return this.pasos;
	}

	public void setPasos(final Collection<Paso> pasos) {
		this.pasos = pasos;
	}

}

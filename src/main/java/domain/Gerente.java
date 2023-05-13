
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Gerente extends Actor {
	// Constructors -----------------------------------------------------------

	public Gerente() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private Boolean baneado;


	public Boolean getBaneado() {
		return this.baneado;
	}

	public void setBaneado(final Boolean baneado) {
		this.baneado = baneado;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Gimnasio> gimnasios;


	@OneToMany
	public Collection<Gimnasio> getGimnasios() {
		return this.gimnasios;
	}

	public void setGimnasios(final Collection<Gimnasio> gimnasios) {
		this.gimnasios = gimnasios;
	}
}

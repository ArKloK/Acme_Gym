
package domain;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Anotacion extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Anotacion() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private Calendar	momentoEscritura;
	private String		texto;
	private int			calificacion;


	public Calendar getMomentoEscritura() {
		return this.momentoEscritura;
	}

	public void setMomentoEscritura(final Calendar momentoEscritura) {
		this.momentoEscritura = momentoEscritura;
	}

	@NotBlank
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(final String texto) {
		this.texto = texto;
	}

	@Range(min = 0, max = 3)
	public int getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(final int calificacion) {
		this.calificacion = calificacion;
	}

	// Relationships ----------------------------------------------------------

}

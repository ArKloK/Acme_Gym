
package domain;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class RegistroActividad extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public RegistroActividad() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private Calendar	fechaAlta;
	private Calendar	fechaBaja;


	@NotBlank
	public Calendar getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(final Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Calendar getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(final Calendar fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	// Relationships ----------------------------------------------------------

	private Actividad	actividad;
	private Cliente		cliente;


	@ManyToOne(optional = false)
	public Actividad getActividad() {
		return this.actividad;
	}
	public void setActividad(final Actividad actividad) {
		this.actividad = actividad;
	}

	@ManyToOne(optional = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(final Cliente cliente) {
		this.cliente = cliente;
	}

}

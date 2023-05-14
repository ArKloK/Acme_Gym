
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class RegistroActividad extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public RegistroActividad() {
		super();
	}


	// Attributes -------------------------------------------------------------

	@Valid
	private Fecha	fechaAlta;
	private Fecha	fechaBaja;


	@AttributeOverrides({
		@AttributeOverride(name = "anio", column = @Column(name = "anioAlta")), @AttributeOverride(name = "mes", column = @Column(name = "mesAlta")), @AttributeOverride(name = "dia", column = @Column(name = "diaAlta"))
	})
	public Fecha getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(final Fecha fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@AttributeOverrides({
		@AttributeOverride(name = "anio", column = @Column(name = "anioBaja")), @AttributeOverride(name = "mes", column = @Column(name = "mesBaja")), @AttributeOverride(name = "dia", column = @Column(name = "diaBaja"))
	})
	public Fecha getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(final Fecha fechaBaja) {
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

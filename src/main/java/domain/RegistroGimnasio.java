
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Access(AccessType.PROPERTY)
public class RegistroGimnasio extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public RegistroGimnasio() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private Fecha	fechaAlta;
	private Fecha	fechaBaja;


	@AttributeOverrides({
		@AttributeOverride(name = "anio", column = @Column(name = "anioAlta")), @AttributeOverride(name = "mes", column = @Column(name = "mesAlta")), @AttributeOverride(name = "dia", column = @Column(name = "diaAlta"))
	})
	//@NotBlank
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

	private Gimnasio	gimnasio;
	private Cliente		cliente;


	@ManyToOne(optional = false)
	public Gimnasio getGimnasio() {
		return this.gimnasio;
	}
	public void setGimnasio(final Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	@ManyToOne(optional = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(final Cliente cliente) {
		this.cliente = cliente;
	}

}

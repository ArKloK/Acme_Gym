
package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Gimnasio extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Gimnasio() {
		super();
		this.entrenamientos = new HashSet<Entrenamiento>();
		this.actividades = new HashSet<Actividad>();
		this.registrosGimnasio = new HashSet<RegistroGimnasio>();
	}


	// Attributes -------------------------------------------------------------

	private String	logotipo;
	private String	nombre;
	private String	direccion;
	private double	tarifa;


	@URL
	public String getLogotipo() {
		return this.logotipo;
	}

	public void setLogotipo(final String logotipo) {
		this.logotipo = logotipo;
	}

	@NotBlank
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(final String direccion) {
		this.direccion = direccion;
	}

	@Digits(fraction = 2, integer = 4)
	public double getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(final double tarifa) {
		this.tarifa = tarifa;
	}


	// Relationships ----------------------------------------------------------

	private Gerente							gerente;
	private Collection<Entrenamiento>		entrenamientos;
	private Collection<Actividad>			actividades;
	private Collection<RegistroGimnasio>	registrosGimnasio;


	@OneToMany
	public Collection<RegistroGimnasio> getRegistrosGimnasio() {
		return this.registrosGimnasio;
	}

	public void setRegistrosGimnasio(final Collection<RegistroGimnasio> registrosGimnasio) {
		this.registrosGimnasio = registrosGimnasio;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Entrenamiento> getEntrenamientos() {
		return this.entrenamientos;
	}

	public void setEntrenamientos(final Collection<Entrenamiento> entrenamientos) {
		this.entrenamientos = entrenamientos;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Actividad> getActividades() {
		return this.actividades;
	}

	public void setActividades(final Collection<Actividad> actividades) {
		this.actividades = actividades;
	}

	@ManyToOne(optional = false)
	public Gerente getGerente() {
		return this.gerente;
	}

	public void setGerente(final Gerente gerente) {
		this.gerente = gerente;
	}

	public void addEntrenamiento(final Entrenamiento e) {
		this.entrenamientos.add(e);
	}

}

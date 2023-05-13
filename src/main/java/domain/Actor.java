
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Actor() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String	nombre;
	private String	apellido;
	private String	email;
	private int		telefono;
	private int		codigoPostal;
	private String	ciudad;
	private String	pais;


	@NotBlank
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	@NotBlank
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(final String apellido) {
		this.apellido = apellido;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Digits(fraction = 0, integer = 9)
	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(final int telefono) {
		this.telefono = telefono;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	@Digits(fraction = 0, integer = 5)
	public void setCodigoPostal(final int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(final String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(final String pais) {
		this.pais = pais;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Anotacion> anotaciones;


	@OneToMany
	public Collection<Anotacion> getAnotaciones() {
		return this.anotaciones;
	}

	public void setAnotaciones(final Collection<Anotacion> anotaciones) {
		this.anotaciones = anotaciones;
	}
}


package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.util.Assert;

@Entity
@Access(AccessType.PROPERTY)
public class CV extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public CV() {
		super();
		this.identidadesSociales = new HashSet<IdentidadSocial>();
	}


	// Attributes -------------------------------------------------------------

	private String	nombre;
	private String	apellido;
	private String	especialidad;
	private String	formacion;
	private int		experienciaLaboral;


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

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(final String especialidad) {
		this.especialidad = especialidad;
	}

	@NotBlank
	public String getFormacion() {
		return this.formacion;
	}

	public void setFormacion(final String formacion) {
		this.formacion = formacion;
	}

	public int getExperienciaLaboral() {
		return this.experienciaLaboral;
	}

	public void setExperienciaLaboral(final int experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}


	// Relationships ----------------------------------------------------------

	private Collection<IdentidadSocial> identidadesSociales;


	@ElementCollection
	public Collection<IdentidadSocial> getIdentidadesSociales() {
		return this.identidadesSociales;
	}

	public void setIdentidadesSociales(final Collection<IdentidadSocial> identidadesSociales) {
		this.identidadesSociales = identidadesSociales;
	}

	public void addIdentidadSocial(final IdentidadSocial is) {
		Assert.notNull(is);
		Assert.isTrue(this.identidadesSociales.contains(is));

		this.identidadesSociales.add(is);
	}
}

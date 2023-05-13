
package domain;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.core.convert.converter.Converter;

enum DiaSemana {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

class StringToDiaSemanaConverter implements Converter<String, DiaSemana> {

	@Override
	public DiaSemana convert(final String source) {
		return DiaSemana.valueOf(source.toUpperCase());
	}
}

@Entity
@Access(AccessType.PROPERTY)
public class Actividad extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Actividad() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String		titulo;
	private String		fotos;
	private String		descripcion;
	private DiaSemana	diaSemana;
	private Calendar	horaInicio;
	private Calendar	horaFin;
	private int			numeroPlazas;


	@NotBlank
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	@URL
	public String getFotos() {
		return this.fotos;
	}

	public void setFotos(final String fotos) {
		this.fotos = fotos;
	}

	@NotBlank
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	public DiaSemana getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(final DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Calendar getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(final Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Calendar getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(final Calendar horaFin) {
		this.horaFin = horaFin;
	}

	public int getNumeroPlazas() {
		return this.numeroPlazas;
	}

	public void setNumeroPlazas(final int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Entrenador>			entrenadores;
	private Gimnasio						gimnasio;
	private Collection<RegistroActividad>	registrosActividad;


	@ManyToMany
	public Collection<Entrenador> getEntrenadores() {
		return this.entrenadores;
	}
	public void setEntrenadores(final Collection<Entrenador> entrenadores) {
		this.entrenadores = entrenadores;
	}

	@ManyToOne
	public Gimnasio getGimnasio() {
		return this.gimnasio;
	}
	public void setGimnasio(final Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	@OneToMany
	public Collection<RegistroActividad> getRegistrosActividad() {
		return this.registrosActividad;
	}
	public void setRegistrosActividad(final Collection<RegistroActividad> registrosActividad) {
		this.registrosActividad = registrosActividad;
	}

}


package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Cliente extends Actor {
	// Constructors -----------------------------------------------------------

	public Cliente() {
		super();
	}


	// Attributes -------------------------------------------------------------
	private String	marca;
	private String	numeroTarjeta;
	private int		mesCaducidad;
	private int		anioCaducidad;
	private int		cvv;
	private String	nombreTitular;


	@NotBlank
	public String getNombreTitular() {
		return this.nombreTitular;
	}

	public void setNombreTitular(final String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	@NotBlank
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(final String marca) {
		this.marca = marca;
	}

	@CreditCardNumber
	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(final String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Range(min = 1, max = 12)
	public int getMesCaducidad() {
		return this.mesCaducidad;
	}

	public void setMesCaducidad(final int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	@Min(2023)
	public int getAnioCaducidad() {
		return this.anioCaducidad;
	}

	public void setAnioCaducidad(final int anioCaducidad) {
		this.anioCaducidad = anioCaducidad;
	}

	@Range(min = 100, max = 999)
	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(final int cvv) {
		this.cvv = cvv;
	}


	// Relationships ----------------------------------------------------------

	private Collection<RegistroGimnasio>	registrosGimnasio;
	private Collection<RegistroActividad>	registrosActividad;


	@OneToMany
	public Collection<RegistroGimnasio> getRegistrosGimnasio() {
		return this.registrosGimnasio;
	}

	public void setRegistrosGimnasio(final Collection<RegistroGimnasio> registrosGimnasio) {
		this.registrosGimnasio = registrosGimnasio;
	}

	@OneToMany
	public Collection<RegistroActividad> getRegistrosActividad() {
		return this.registrosActividad;
	}

	public void setRegistrosActividad(final Collection<RegistroActividad> registrosActividad) {
		this.registrosActividad = registrosActividad;
	}

}

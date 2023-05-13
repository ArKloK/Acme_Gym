
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.URL;

@Embeddable
@Access(AccessType.PROPERTY)
public class IdentidadSocial {

	private String	nick;
	private String	enlace;
	private String	redSocial;


	public String getNick() {
		return this.nick;
	}

	public void setNick(final String nick) {
		this.nick = nick;
	}

	@URL
	public String getEnlace() {
		return this.enlace;
	}

	public void setEnlace(final String enlace) {
		this.enlace = enlace;
	}

	public String getRedSocial() {
		return this.redSocial;
	}

	public void setRedSocial(final String redSocial) {
		this.redSocial = redSocial;
	}

}

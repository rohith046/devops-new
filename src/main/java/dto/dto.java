package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dto {
	@Id
	private String email;
	private String name;
	private String password;

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "bob [email=" + email + ", name=" + name + ", password=" + password + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

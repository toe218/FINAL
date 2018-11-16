package command;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Loginsession implements Serializable{
	private String id;
	private String name;
	private String dvice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDvice() {
		return dvice;
	}
	public void setDvice(String dvice) {
		this.dvice = dvice;
	}
}

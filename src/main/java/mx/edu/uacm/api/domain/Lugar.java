package mx.edu.uacm.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lugar {

	@Id
	private int id;
	@Column
	private String tipo;
	@Column
	private int capacidad;
	@Column
	private String localizacion;
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return id;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int id) {
		this.id = id;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}
	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
}

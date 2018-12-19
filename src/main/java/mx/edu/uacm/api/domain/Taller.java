/**
 * 
 */
package mx.edu.uacm.api.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author christian
 *
 */
// JPA Implementacion de java Persistence API (JPA) con Hibernate
@Entity // javax.persistence.Entity
public class Taller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String fechaInicio;
	@Column
	private String fechaFin;
	@Column
	private String horario;
	@Column
	private String descripcion;
	@Column
	private int numeroAsistentes;
	@Column
	private String area;

	@OneToMany
	private List<Estudiante> estudiantes = new ArrayList<Estudiante>();

	@OneToMany
	private List<Ponente> ponentes = new ArrayList<Ponente>();

	@OneToMany
	private List<Plantel> planteles = new ArrayList<Plantel>();

	@OneToOne
	@JoinColumn(name = "id")
	private Lugar lugar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumeroAsistentes() {
		return numeroAsistentes;
	}

	public void setNumeroAsistentes(int numeroAsistentes) {
		this.numeroAsistentes = numeroAsistentes;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public List<Ponente> getPonente() {
		return ponentes;
	}

	public void setPonente(List<Ponente> ponentes) {
		this.ponentes = ponentes;
	}

	public List<Plantel> getPlantel() {
		return planteles;
	}

	public void setPlantel(List<Plantel> planteles) {
		this.planteles = planteles;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

}

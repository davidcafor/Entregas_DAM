package com.david.hibernate.proyectohibernate;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the proyectos database table.
 * 
 */
@Entity
@Table(name="proyectos")
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proy", unique=true, nullable=false)
	private int idProy;

	@Temporal(TemporalType.DATE)
	@Column(name="f_fin")
	private Date fFin;

	@Temporal(TemporalType.DATE)
	@Column(name="f_inicio", nullable=false)
	private Date fInicio;

	@Column(nullable=false, length=32)
	private String nombre;

	//bi-directional many-to-one association to AsigProyecto
	@OneToMany(mappedBy="proyecto")
	private List<AsigProyecto> asigProyectos;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="dni_nif_jefe_proy", nullable=false)
	private Empleado empleado;

	public Proyecto() {
	}

	public int getIdProy() {
		return this.idProy;
	}

	public void setIdProy(int idProy) {
		this.idProy = idProy;
	}

	public Date getFFin() {
		return this.fFin;
	}

	public void setFFin(Date fFin) {
		this.fFin = fFin;
	}

	public Date getFInicio() {
		return this.fInicio;
	}

	public void setFInicio(Date fInicio) {
		this.fInicio = fInicio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AsigProyecto> getAsigProyectos() {
		return this.asigProyectos;
	}

	public void setAsigProyectos(List<AsigProyecto> asigProyectos) {
		this.asigProyectos = asigProyectos;
	}

	public AsigProyecto addAsigProyecto(AsigProyecto asigProyecto) {
		getAsigProyectos().add(asigProyecto);
		asigProyecto.setProyecto(this);

		return asigProyecto;
	}

	public AsigProyecto removeAsigProyecto(AsigProyecto asigProyecto) {
		getAsigProyectos().remove(asigProyecto);
		asigProyecto.setProyecto(null);

		return asigProyecto;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public String toStringPersonalizado() {
		return "Proyecto [idProy=" + idProy + ", fFin=" + fFin + ", fInicio=" + fInicio + ", nombre=" + nombre
				+ ", asigProyectos=" + asigProyectos + ", empleado=" + empleado + "]";
	}

}
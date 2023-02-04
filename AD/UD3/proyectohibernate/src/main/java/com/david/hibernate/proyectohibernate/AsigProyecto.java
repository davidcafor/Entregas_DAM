package com.david.hibernate.proyectohibernate;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asig_proyectos database table.
 * 
 */
@Entity
@Table(name="asig_proyectos")
@NamedQuery(name="AsigProyecto.findAll", query="SELECT a FROM AsigProyecto a")
public class AsigProyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AsigProyectoPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="f_fin")
	private Date fFin;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="dni_nif_empleado", nullable=false, insertable=false, updatable=false)
	private Empleado empleado;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="id_proy", nullable=false, insertable=false, updatable=false)
	private Proyecto proyecto;

	public AsigProyecto() {
	}

	public AsigProyectoPK getId() {
		return this.id;
	}

	public void setId(AsigProyectoPK id) {
		this.id = id;
	}

	public Date getFFin() {
		return this.fFin;
	}

	public void setFFin(Date fFin) {
		this.fFin = fFin;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}
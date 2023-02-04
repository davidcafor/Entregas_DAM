package com.david.hibernate.proyectohibernate;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the empleados database table.
 * 
 */
@Entity
@Table(name="empleados")
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//Constructor personalizado
	
	public Empleado(String dniNif, String nombre, Proyecto proyecto) {
		super();
		this.dniNif = dniNif;
		this.nombre = nombre;
		this.proyectos = new ArrayList<>();
		proyectos.add(proyecto);
	}
	
	

	@Id
	@Column(name="dni_nif", unique=true, nullable=false, length=9)
	private String dniNif;

	@Column(nullable=false, length=32)
	private String nombre;

	@Column(name="sueldo_bruto_anual", precision=10, scale=2)
	private BigDecimal sueldoBrutoAnual;

	//bi-directional many-to-one association to AsigProyecto
	@OneToMany(mappedBy="empleado")
	private List<AsigProyecto> asigProyectos;

	//bi-directional many-to-one association to Proyecto
	@OneToMany(mappedBy="empleado")
	private List<Proyecto> proyectos;

	public Empleado() {
	}

	public String getDniNif() {
		return this.dniNif;
	}

	public void setDniNif(String dniNif) {
		this.dniNif = dniNif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSueldoBrutoAnual() {
		return this.sueldoBrutoAnual;
	}

	public void setSueldoBrutoAnual(BigDecimal sueldoBrutoAnual) {
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}

	public List<AsigProyecto> getAsigProyectos() {
		return this.asigProyectos;
	}

	public void setAsigProyectos(List<AsigProyecto> asigProyectos) {
		this.asigProyectos = asigProyectos;
	}

	public AsigProyecto addAsigProyecto(AsigProyecto asigProyecto) {
		getAsigProyectos().add(asigProyecto);
		asigProyecto.setEmpleado(this);

		return asigProyecto;
	}

	public AsigProyecto removeAsigProyecto(AsigProyecto asigProyecto) {
		getAsigProyectos().remove(asigProyecto);
		asigProyecto.setEmpleado(null);

		return asigProyecto;
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Proyecto addProyecto(Proyecto proyecto) {
		getProyectos().add(proyecto);
		proyecto.setEmpleado(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setEmpleado(null);

		return proyecto;
	}
	
	public String toStringProyecto() {

		String mensaje = "Empleado [dniNif=" + dniNif + ", nombre=" + nombre + ", sueldoBrutoAnual=" + sueldoBrutoAnual + "]";

		for (Proyecto proyecto : proyectos) {

		mensaje += "\n" + proyecto.toStringPersonalizado();

		}

		return mensaje;

	}


	public String toStringPersonalizado() {

		return "Empleado [dniNif=" + dniNif + ", nombre=" + nombre + ", sueldoBrutoAnual=" + sueldoBrutoAnual + "]";

	}

		

}
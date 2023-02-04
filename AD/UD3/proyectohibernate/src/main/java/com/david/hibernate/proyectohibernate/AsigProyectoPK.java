package com.david.hibernate.proyectohibernate;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the asig_proyectos database table.
 * 
 */
@Embeddable
public class AsigProyectoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dni_nif_empleado", insertable=false, updatable=false, unique=true, nullable=false, length=9)
	private String dniNifEmpleado;

	@Column(name="id_proy", insertable=false, updatable=false, unique=true, nullable=false)
	private int idProy;

	@Temporal(TemporalType.DATE)
	@Column(name="f_inicio", unique=true, nullable=false)
	private java.util.Date fInicio;

	public AsigProyectoPK() {
	}
	public String getDniNifEmpleado() {
		return this.dniNifEmpleado;
	}
	public void setDniNifEmpleado(String dniNifEmpleado) {
		this.dniNifEmpleado = dniNifEmpleado;
	}
	public int getIdProy() {
		return this.idProy;
	}
	public void setIdProy(int idProy) {
		this.idProy = idProy;
	}
	public java.util.Date getFInicio() {
		return this.fInicio;
	}
	public void setFInicio(java.util.Date fInicio) {
		this.fInicio = fInicio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AsigProyectoPK)) {
			return false;
		}
		AsigProyectoPK castOther = (AsigProyectoPK)other;
		return 
			this.dniNifEmpleado.equals(castOther.dniNifEmpleado)
			&& (this.idProy == castOther.idProy)
			&& this.fInicio.equals(castOther.fInicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dniNifEmpleado.hashCode();
		hash = hash * prime + this.idProy;
		hash = hash * prime + this.fInicio.hashCode();
		
		return hash;
	}
}
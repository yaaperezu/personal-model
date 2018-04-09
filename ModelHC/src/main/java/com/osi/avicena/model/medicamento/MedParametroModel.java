package com.osi.avicena.model.medicamento;

import java.io.Serializable;

public class MedParametroModel implements Serializable {

	private static final long serialVersionUID = -427495473433063121L;

	private Long parametro;

	private String codigo;

	private String descripcion;

	private String estado;

	private String observacion;

	private Integer orden;

	private MedTipoParametroModel medTipoParametro;

	public MedParametroModel() {
	}

	public Long getParametro() {
		return this.parametro;
	}

	public void setParametro(Long parametro) {
		this.parametro = parametro;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public MedTipoParametroModel getMedTipoParametro() {
		return this.medTipoParametro;
	}

	public void setMedTipoParametro(MedTipoParametroModel medTipoParametro) {
		this.medTipoParametro = medTipoParametro;
	}

}
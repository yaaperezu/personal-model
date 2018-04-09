package com.osi.avicena.model.global;

import java.io.Serializable;
import java.util.List;

import com.osi.avicena.model.medicamento.MedTipoParametroModel;

public class ModuloModel implements Serializable {

	private static final long serialVersionUID = 6489487130858226267L;

	private Long modulo;

	private String codigo;

	private String descripcion;

	private String estado;

	private String observacion;

	private List<MedTipoParametroModel> medTipoParametros;

	public ModuloModel() {
	}

	public Long getModulo() {
		return this.modulo;
	}

	public void setModulo(Long modulo) {
		this.modulo = modulo;
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

	public List<MedTipoParametroModel> getMedTipoParametros() {
		return this.medTipoParametros;
	}

	public void setMedTipoParametros(List<MedTipoParametroModel> medTipoParametros) {
		this.medTipoParametros = medTipoParametros;
	}

	public MedTipoParametroModel addMedTipoParametro(MedTipoParametroModel medTipoParametro) {
		getMedTipoParametros().add(medTipoParametro);
		medTipoParametro.setModulo(this);

		return medTipoParametro;
	}

	public MedTipoParametroModel removeMedTipoParametro(MedTipoParametroModel medTipoParametro) {
		getMedTipoParametros().remove(medTipoParametro);
		medTipoParametro.setModulo(null);

		return medTipoParametro;
	}

}
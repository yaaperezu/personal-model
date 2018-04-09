package com.osi.avicena.model.medicamento;

import java.io.Serializable;
import java.util.List;

import com.osi.avicena.model.global.ModuloModel;

public class MedTipoParametroModel implements Serializable {

	private static final long serialVersionUID = -6647523124961054988L;

	private Long tipoParametro;

	private String codigo;

	private String descripcion;

	private String estado;

	private String observacion;

	private List<MedParametroModel> medParametros;

	private ModuloModel modulo;

	public MedTipoParametroModel() {
	}

	public Long getTipoParametro() {
		return this.tipoParametro;
	}

	public void setTipoParametro(Long tipoParametro) {
		this.tipoParametro = tipoParametro;
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

	public List<MedParametroModel> getMedParametros() {
		return this.medParametros;
	}

	public void setMedParametros(List<MedParametroModel> medParametros) {
		this.medParametros = medParametros;
	}

	public MedParametroModel addMedParametro(MedParametroModel medParametro) {
		getMedParametros().add(medParametro);
		medParametro.setMedTipoParametro(this);

		return medParametro;
	}

	public MedParametroModel removeMedParametro(MedParametroModel medParametro) {
		getMedParametros().remove(medParametro);
		medParametro.setMedTipoParametro(null);

		return medParametro;
	}

	public ModuloModel getModulo() {
		return this.modulo;
	}

	public void setModulo(ModuloModel modulo) {
		this.modulo = modulo;
	}

}
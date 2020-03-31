package com.richardson.consignado.core.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@JsonPropertyOrder({ "cpfCliente", "valorContratado", "quantidadeParcelas", "dataVencimentoParcela", "dataInicioContrato",
		"dataEnceramentoContrato", "numeroBeneficio" })
public class CreditoContratadoDTO {
	private String cpfCliente;
	private BigDecimal valorContratado;
	private Integer quantidadeParcelas;	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String dataVencimentoParcela;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String dataInicioContrato;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String dataEnceramentoContrato;
	private Integer numeroBeneficio;
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}

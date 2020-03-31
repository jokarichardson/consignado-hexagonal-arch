package com.richardson.consignado.core.service;

import java.util.List;

import com.richardson.consignado.core.dto.BeneficiarioDTO;
import com.richardson.consignado.core.dto.CreditoContratadoDTO;

public interface ConsignadoService {
	List<BeneficiarioDTO> recuperarOfertas();
	List<BeneficiarioDTO> recuperarOfertasAutorizadas();
	void contratarCreditoConsigado(CreditoContratadoDTO creditoContratadoDTO);
	
}

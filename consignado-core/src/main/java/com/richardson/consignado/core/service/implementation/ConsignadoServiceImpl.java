package com.richardson.consignado.core.service.implementation;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.richardson.consignado.core.dto.BeneficiarioDTO;
import com.richardson.consignado.core.dto.CreditoContratadoDTO;
import com.richardson.consignado.core.service.ConsignadoService;

@Service
public class ConsignadoServiceImpl implements ConsignadoService {

	@Override
	public List<BeneficiarioDTO> recuperarOfertas() {

		return Collections.singletonList(BeneficiarioDTO.builder().build());
	}
	
	@Override
	public List<BeneficiarioDTO> recuperarOfertasAutorizadas() {

		return Collections.singletonList(BeneficiarioDTO.builder().build());
	}

	@Override
	public void contratarCreditoConsigado(CreditoContratadoDTO creditoContratadoDTO) {
		
	}
}

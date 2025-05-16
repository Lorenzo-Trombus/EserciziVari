package com.spring.report.utillity;

import com.spring.report.dto.ProdottoDTO;
import com.spring.report.dto.ReportDTO;
import com.spring.report.entity.ReportProdotto;

public class Conversioni {
	public static ReportProdotto daProdottoDTOAReportProdotto(ProdottoDTO dto) {
		return new ReportProdotto(dto.getId(), dto.getQuantità(), dto.getMarca(), dto.getModello(),dto.getDescrizione(),dto.getCategoria(),dto.getPrezzoConsigliato(),dto.getPrezzoMax());
	}
	
	public static ProdottoDTO daReportProdottoAProdottoDTO(ReportProdotto entity) {
		return new ProdottoDTO(entity.getId(),entity.getQuantità(),entity.getMarca(),entity.getModello(),entity.getDescrizione(),entity.getCategoria(),entity.getPrezzoConsigliato(),entity.getPrezzoMax());
	}
}

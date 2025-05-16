package com.spring.report.service;

import com.spring.report.dao.DAOReportMappa;
import com.spring.report.dto.ProdottoDTO;
import com.spring.report.entity.ReportProdotto;
import com.spring.report.utillity.Conversioni;


public class ReportService {
	
	private DAOReportMappa dao = new DAOReportMappa();
	
	public boolean caricamentoProdotto(ProdottoDTO dto) {
		ReportProdotto entity = Conversioni.daProdottoDTOAReportProdotto(dto);
		return dao.insert(entity);
	}
	
	public ProdottoDTO cercaPerId(int id) {
		ReportProdotto report = dao.selectById(id);
		if(report != null) {
			ProdottoDTO dto = Conversioni.daReportProdottoAProdottoDTO(report);
			return dto;
		}
		return null;
	}
	
	
}

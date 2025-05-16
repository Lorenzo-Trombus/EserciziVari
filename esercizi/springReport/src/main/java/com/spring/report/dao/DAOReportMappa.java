package com.spring.report.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.report.entity.ReportProdotto;

public class DAOReportMappa {


	private Map<Integer, ReportProdotto> mappa = new HashMap<>();

	public boolean insert(ReportProdotto prodotto) {
		if(mappa.containsKey(prodotto.getId()))
			return false;
		
		mappa.put(prodotto.getId(), prodotto);
		return true;

	}
	public List<ReportProdotto> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public ReportProdotto selectById(Integer idProdotto) {
		return mappa.get(idProdotto);
	}
	
	public boolean delete(Integer idProdotto) {
		ReportProdotto prodotto= mappa.remove(idProdotto);
		return prodotto!=null;
	}
	
	

}
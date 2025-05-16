package com.spring.report.dto;

import java.util.List;

public class ReportDTO {
	private List<String> descrizioni;
	private int pezziTotali;
	private int numNonDisponibili;
	private double mediaPrezzi;
	private List<String> nomiNonDisponibili;
	
	public ReportDTO() {
		
	}

	public ReportDTO(List<String> descrizioni, int pezziTotali, int numNonDisponibili, double mediaPrezzi,
			List<String> nomiNonDisponibili) {
		super();
		this.descrizioni = descrizioni;
		this.pezziTotali = pezziTotali;
		this.numNonDisponibili = numNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
		this.nomiNonDisponibili = nomiNonDisponibili;
	}

	public List<String> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<String> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public int getPezziTotali() {
		return pezziTotali;
	}

	public void setPezziTotali(int pezziTotali) {
		this.pezziTotali = pezziTotali;
	}

	public int getNumNonDisponibili() {
		return numNonDisponibili;
	}

	public void setNumNonDisponibili(int numNonDisponibili) {
		this.numNonDisponibili = numNonDisponibili;
	}

	public double getMediaPrezzi() {
		return mediaPrezzi;
	}

	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}

	public List<String> getNomiNonDisponibili() {
		return nomiNonDisponibili;
	}

	public void setNomiNonDisponibili(List<String> nomiNonDisponibili) {
		this.nomiNonDisponibili = nomiNonDisponibili;
	}

	@Override
	public String toString() {
		return "ReportDTO [descrizioni=" + descrizioni + ", pezziTotali=" + pezziTotali + ", numNonDisponibili="
				+ numNonDisponibili + ", mediaPrezzi=" + mediaPrezzi + ", nomiNonDisponibili=" + nomiNonDisponibili
				+ "]";
	}
	
	
	
}


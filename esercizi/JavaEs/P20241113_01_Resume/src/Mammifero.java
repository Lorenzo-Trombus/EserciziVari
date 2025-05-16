
public abstract class Mammifero{
	private Integer freqResp;
	private Integer freqCardio;
	public abstract String Verso();

	public Integer getFreqResp() {
		return freqResp;
	}
	@Override
	public String toString() {
		return "Mammifero [freqResp=" + freqResp + ", freqCardio=" + freqCardio + ", Verso()=" + Verso()
				+ ", getFreqResp()=" + getFreqResp() + ", getFreqCardio()=" + getFreqCardio() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setFreqResp(Integer freqResp) {
		this.freqResp = freqResp;
	}
	public Integer getFreqCardio() {
		return freqCardio;
	}
	public void setFreqCardio(Integer freqCardio) {
		this.freqCardio = freqCardio;
	}
	public Mammifero(Integer freqResp, Integer freqCardio) {
		super();
		this.freqResp = freqResp;
		this.freqCardio = freqCardio;
	}
	public Mammifero() {
		super();
	}
	
	
}

package ejemplo05beans.beans3;

public class Motor {
	private String tipoDeMotor;
	private int caballosVapor;
	
	public String getTipoDeMotor() {
		return tipoDeMotor;
	}
	public void setTipoDeMotor(String tipoDeMotor) {
		this.tipoDeMotor = tipoDeMotor;
	}
	public int getCaballosVapor() {
		return caballosVapor;
	}
	public void setCaballosVapor(int caballosVapor) {
		this.caballosVapor = caballosVapor;
	}
	@Override
	public String toString() {
		return "Motor [tipoDeMotor=" + tipoDeMotor + ", caballosVapor=" + caballosVapor + "]";
	}
	
}

package ejemplo05beans.beans4;

public class MotorConConstructor {
	private String tipoDeMotor;
	private int caballosVapor;
	
	
	public MotorConConstructor(String tipoDeMotor, int caballosVapor) {
		super();
		this.tipoDeMotor = tipoDeMotor;
		this.caballosVapor = caballosVapor;
	}
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

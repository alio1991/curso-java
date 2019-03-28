package ejemplo05beans.beans4;

public class CocheConConstructor {
	
	
	private String marca;
	private String modelo;
	private String plazas;
	private MotorConConstructor motor;
	
	
	
	
	public CocheConConstructor(String marca, String modelo, String plazas, MotorConConstructor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.plazas = plazas;
		this.motor = motor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlazas() {
		return plazas;
	}
	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}
	public MotorConConstructor getMotor() {
		return motor;
	}
	public void setMotor(MotorConConstructor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", plazas=" + plazas + ", motor=" + motor + "]";
	}

}

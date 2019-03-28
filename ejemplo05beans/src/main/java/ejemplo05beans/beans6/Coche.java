package ejemplo05beans.beans6;

public class Coche {
	private String marca;
	private String modelo;
	private String plazas;
	private Motor motor;
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
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", plazas=" + plazas + ", motor=" + motor + "]";
	}

}

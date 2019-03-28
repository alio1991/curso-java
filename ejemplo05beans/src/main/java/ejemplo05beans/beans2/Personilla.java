package ejemplo05beans.beans2;

public class Personilla {
	
	private String nombrecillo;
	private int edad;
	private double peso;
	
	
	public String getNombrecillo() {
		return nombrecillo;
	}
	public void setNombrecillo(String nombrecillo) {
		this.nombrecillo = nombrecillo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Personilla [nombrecillo=" + nombrecillo + ", edad=" + edad + ", peso=" + peso + "]";
	}
}

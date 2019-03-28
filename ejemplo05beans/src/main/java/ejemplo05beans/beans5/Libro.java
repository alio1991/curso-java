package ejemplo05beans.beans5;

public class Libro {
	private String titulo;
	private String autor;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}

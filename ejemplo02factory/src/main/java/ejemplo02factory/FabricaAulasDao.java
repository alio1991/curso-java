package ejemplo02factory;

import com.curso.java.ejercicio01dao.IAulaDao;
import com.curso.java.ejercicio01dao.ListDAO;
import com.curso.java.ejercicio01dao.MapDAO;


public class FabricaAulasDao {
	
	public static IAulaDao getAulaDaoInstance(String nombre) {
		if(nombre== "ListDAO") {
			return new ListDAO();
		}else {
			return new MapDAO(); 
		}
	}
}

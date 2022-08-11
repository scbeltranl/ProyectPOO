/**
 * SOFTWARE: POO
 * @version 1.0
 * @authors SEBASTIÁN BELTRÁN, LINA LEÓN, MAURICIO SÁNCHEZ
 * 
 * */

package Logica;

public class Caida {
	
	private int objetos;
	private int velocidad;
	
	//MÉTODOS CONSTRUCTORES
	public Caida(int objetos, int velocidad) {
		super();
		this.objetos = objetos;
		this.velocidad = velocidad;
	}
	
	//GETTERS UND SETTERS
	public int getObjetos() {
		return objetos;
	}
	public void setObjetos(int objetos) {
		this.objetos = objetos;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	//MÉTODOS
	public int CambioXNivel() {
		
		/**
		*ACÁ SE PODRÁN REALIZAR LOS CAMBIOS QUE SE GENERAN POR CADA NIVEL POR MEDIO DE UN SWITCH O SOMETHING LIKE THAT
		*ESE 1 ES PROVICIONAL, PORQUE TOCA LLAMAR EL ATRIBUTO NIVEL DE JUGABILIDAD.JAVA 
		*/
		return 1;
		
	}
	
	public int Objetos() {
		
		/**
		*ACÁ SE PODRÍA DETERMINAR QUÉ OBJETOS(ALIMENTOS Y OBJETOS CAEN) Y A QUÉ VELOCIDAD, TENIENDO EN CUENTA QUE PS NO SÉ
		*RECOMENDARIA AGRUPAR LAS IMAGENES EN UN ARRAY Y QUE VAYA CON RANDOM, TENIENDO EN CUENTA QUE DEBEN SER MÁS ALIMENTOS QUE OBJETOS 
		*PARA QUE NO SALGAN A CADA RATO, PUEDEN CUADRAR DISTINTOS ARRAYS SEGÚN EL NIVEL, PARA QUE SALGAN MÁS O MENOS OBJETOS.
		*NO SÉ EL TIPO DE MÉTODO AJAJA, SOLO LO PUSE ASÍ POR ASÍ ALGO :V
		*/
		
		return objetos;
		
	}
	

}

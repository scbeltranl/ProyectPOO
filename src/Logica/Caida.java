/**
 * SOFTWARE: POO
 * @version 1.0
 * @authors SEBASTI�N BELTR�N, LINA LE�N, MAURICIO S�NCHEZ
 * 
 * */

package Logica;

public class Caida {
	
	private int objetos;
	private int velocidad;
	
	//M�TODOS CONSTRUCTORES
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
	
	//M�TODOS
	public int CambioXNivel() {
		
		/**
		*AC� SE PODR�N REALIZAR LOS CAMBIOS QUE SE GENERAN POR CADA NIVEL POR MEDIO DE UN SWITCH O SOMETHING LIKE THAT
		*ESE 1 ES PROVICIONAL, PORQUE TOCA LLAMAR EL ATRIBUTO NIVEL DE JUGABILIDAD.JAVA 
		*/
		return 1;
		
	}
	
	public int Objetos() {
		
		/**
		*AC� SE PODR�A DETERMINAR QU� OBJETOS(ALIMENTOS Y OBJETOS CAEN) Y A QU� VELOCIDAD, TENIENDO EN CUENTA QUE PS NO S�
		*RECOMENDARIA AGRUPAR LAS IMAGENES EN UN ARRAY Y QUE VAYA CON RANDOM, TENIENDO EN CUENTA QUE DEBEN SER M�S ALIMENTOS QUE OBJETOS 
		*PARA QUE NO SALGAN A CADA RATO, PUEDEN CUADRAR DISTINTOS ARRAYS SEG�N EL NIVEL, PARA QUE SALGAN M�S O MENOS OBJETOS.
		*NO S� EL TIPO DE M�TODO AJAJA, SOLO LO PUSE AS� POR AS� ALGO :V
		*/
		
		return objetos;
		
	}
	

}

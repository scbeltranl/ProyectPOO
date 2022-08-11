/**
 * SOFTWARE: POO
 * @version 1.0
 * @authors SEBASTI�N BELTR�N, LINA LE�N, MAURICIO S�NCHEZ
 * 
 * */

package Logica;

public class Jugabilidad {
	
	private int vidas;
	private int errores;
	private int monedas;
	private int nivel;
	private String nickname;
	
	//CONSTRUCTORES
	public Jugabilidad(int vidas, int errores, int monedas, String nickname) {
		super();
		this.vidas = vidas;
		this.errores = errores;
		this.monedas = monedas;
		this.nickname = nickname;
	}
	
	//GETTERS UND SETTERS
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getErrores() {
		return errores;
	}
	public void setErrores(int errores) {
		this.errores = errores;
	}
	public int getMonedas() {
		return monedas;
	}
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	//M�TODOS
	public int cantmonedas() {
		
		/**
		*GENERAR M�TODO QUE PERMITA CONTAR CUANTAS MONEDAS SE VAN RECOGIENDO EN LA PARTIDA
		*PARA IMPRIMIR UN ENTERO QUE PERMITA EN EL IGU GERARAR UN CONDICIONAL EN EL LABEL PARA QUE IMPRIMA UNA IMAGEN(DEL #) SEG�N EL ENTERO
		*NO S� SI DEJARLO COMO M�TODO PORQUE CREO QUE SOLO CON LA VARIABLE SE PODR�A CUADRAR PERO AJ�
		*MAYBE PUEDE IR EL M�TODO PARA QUE EL PROGRAMA RECONOZCA QUE ESTA TRAGANDO UNA MONEDA
		*/
		
		return this.monedas;
		
	}
	
	public int cantErrores() {
		
		/**
		*M�TODO PARA QUE LA IGU RECONOZCA QUE DEJ� PASAR UN ALIMENTO
		*/
		return this.errores;
		
	}
	
	public int cantVidas() {
		
		/**
		*M�TODO PARA QUE LA IGU RECONOZCA QUE UN OBJETO GOLPE� AL BICHO 
		*/
		return this.vidas;
		
	}
	
	public int nivel() {
		
		/**
		*LA IDEA ES QUE ESTE SE PUEDA:
		*LLAMAR EN EL IGU PARA CAMBIAR EL LABEL DONDE DICE "MODO"
		*LLAMAR EN CAIDA PARA CAMBIAR LA VELOCIDAD DE CAIDA
		*/
		return this.nivel;
		
	}
	
	/**
	*FALTA PROGRAMAR:
	*LO DEL CRONOMETRO, AC� IR�A PARA QUE DEVOLVIERA EL TIEMPO TOTAL AL FINALIZAR EL PLAY
	*Y EL TIEMPO, Y LA CANTIDAD DE MONEDAS TOCA GUARDARLOS EN UN ARCHIVO PARA LA PERMANENCIA Y PODERLOS IMPRIMIR EN EL SCORE
	*
	*/
	
	
	

}

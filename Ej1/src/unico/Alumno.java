package unico;
/**
 * Contiene la información relativa a un alumno.
 * 
 * @author Sebas
 * @version 1.2
 * @since 26/04/2024
 */

public class Alumno {

	/**
	 * El atributo contiene el nombre de un alumno
	 */
	public final String nombre;
	/**
	 * El atributo contiene el apellidos de un alumno
	 */
	public final String apellidos;
	/**
	 * El atributo contiene el curso al que pertenece un alumno
	 */
	public int curso;
	
	
	/**
	 * Constructor parmetrizado, se crea una instancia de alumno por nombre y apellido.
	 * @param nombre
	 * 		Es el nombre del alumno
	 * @param apellidos
	 * 		Don los apellidos del alumno
	 */
	public Alumno(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	/**
	 * Devuelve el curso del alumno
	 * @return
	 * 			Devuelve el numero ques es el curso del alumno.
	 */


	public int getCurso() {
		return curso;
	}
	
	
	/**
	 * Se introduce el curso del alumno
	 * @param curso
	 * 			Numero correspondiente al curso del alumno.
	 */

	public void setCurso(int curso) {
		this.curso = curso;
	}
	

	/**
	 * Devuelve el nombre del alumno
	 * @return
	 * 			Devuelve un string con el nombre del alumno.
	 */

	
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el apellido del alumno
	 * @return
	 * 			Devuelve un string con el apellido del alumno.
	 */
	
	
	public String getApellidos() {
		return apellidos;
	}
	

	
	
	
	
}

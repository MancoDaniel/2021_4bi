
import java.util.*;

/**
 * 
 */
public class Docente extends Dipendenti {

    public Docente(String matricola, String indirizzo, String cognome, String nome, float stipendio, String materia) {
		super(matricola, indirizzo, cognome, nome, stipendio);
		this.materia=materia;
		// TODO Auto-generated constructor stub
	}
    
    

    public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}



	/**
     * 
     */
    private String materia;

    /**
     * @param m 
     * @param i 
     * @param c 
     * @param n 
     * @param s 
     * @param ma
     */
    public void Docente(String m, String i, String c, String n, float s, String ma) {
        // TODO implement here
    }

	
    @Override
	public String toString() {
		return "Docente [materia=" + materia + ", matricola=" + matricola + ", indirizzo=" + indirizzo + ", cognome="
				+ cognome + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}



	/**
     * @return
     */
    public static void main(String[] args) {
		Docente d=new Docente("abc123", "via giosu' carducci 15", "manco", "daniel", 1000, "italiano");
		System.out.println(d);
	}

}
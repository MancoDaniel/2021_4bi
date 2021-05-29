
import java.util.*;

/**
 * 
 */
public class Collaboratore extends Dipendenti {

    /**
     * Default constructor
     */
    

    public Collaboratore(String matricola, String indirizzo, String cognome, String nome, float stipendio, int pianoLavoro) {
		super(matricola, indirizzo, cognome, nome, stipendio);
		this.pianoLavoro=pianoLavoro;
		// TODO Auto-generated constructor stub
	}

	/**
     * 
     */
    private int pianoLavoro;
    
    

    public int getPianoLavoro() {
		return pianoLavoro;
	}

	public void setPianoLavoro(int pianoLavoro) {
		this.pianoLavoro = pianoLavoro;
	}

	/**
     * @param m 
     * @param i 
     * @param c 
     * @param n 
     * @param s 
     * @param pL
     */
    public void Collaboratore(String m, String i, String c, String n, float s) {
    	
        
    }

	

    @Override
	public String toString() {
		return "Collaboratore [pianoLavoro=" + pianoLavoro + ", matricola=" + matricola + ", indirizzo=" + indirizzo
				+ ", cognome=" + cognome + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}

	/**
     * @return
     */
	public static void main(String[] args) {
		Collaboratore c=new Collaboratore("abc123", "via giosu' carducci 15", "manco", "daniel", 1000, 1);
		System.out.println(c);
	}
    

}
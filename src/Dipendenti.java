
import java.util.*;

/**
 * 
 */
public class Dipendenti {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
    protected String matricola;

    /**
     * 
     */
    protected String indirizzo;

    /**
     * 
     */
    protected String cognome;

    /**
     * 
     */
    protected String nome;

    /**
     * 
     */
    protected float stipendio;

    /**
     * @param m 
     * @param i 
     * @param c 
     * @param n 
     * @param s
     */
    
    
    
    
    public Dipendenti(String matricola, String indirizzo, String cognome, String nome, float stipendio) {
        this.matricola=matricola;
        this.indirizzo=indirizzo;
        this.cognome=cognome;
        this.nome=nome;
        this.stipendio=stipendio;
    }

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getStipendio() {
		return stipendio;
	}

	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Dipendenti [matricola=" + matricola + ", indirizzo=" + indirizzo + ", cognome=" + cognome + ", nome="
				+ nome + ", stipendio=" + stipendio + "]";
	}

    /**
     * @return
     */
   public static void main(String[] args) {
	Dipendenti d=new Dipendenti("abc123", "via giosue' carducci 15", "manco", "daniel", 1000);
	System.out.println(d);

   }

}
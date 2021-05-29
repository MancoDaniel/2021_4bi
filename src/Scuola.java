
import java.util.*;

/**
 * 
 * @author versione 2
 *
 */
public class Scuola {

    /**
     * Default constructor
     */

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String sede;

    /**
     * 
     */
    
    
    private int numDipendenti;


    private Dipendenti vettDipendenti[];
    /**
     * @param n 
     * @param s
     */
    public Scuola(String nome, String sede, int maxDip) {
        this.nome=nome;
        this.sede=sede;
        this.numDipendenti=0;
        vettDipendenti=new Dipendenti[maxDip];
    }
    
    

    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSede() {
		return sede;
	}
	
	public void setSede(String sede) {
		this.sede=sede;
	}



	/**
     * @param d 
     * @return
     */
    public boolean aggDipendente(Dipendenti d) {
       if(numDipendenti<vettDipendenti.length) {
    	   vettDipendenti[numDipendenti]=d;
    	   numDipendenti++;
    	   return true;
       }
        return false;
    }

    /**
     * @param m 
     * @param i 
     * @param c 
     * @param n 
     * @param s 
     * @param pL 
     * @return
     */
    public boolean aggDipendente(String matricola, String indirizzo, String cognome, String nome, float stipendio, int pianoLavoro) {
        if(numDipendenti<vettDipendenti.length) {
        	Collaboratore c=new Collaboratore( matricola,  indirizzo,  cognome,  nome,  stipendio,  pianoLavoro);
        	vettDipendenti[numDipendenti]=c;
        	numDipendenti++;
        	return true;
        }
        return false;
    }

    /**
     * @param m 
     * @param i 
     * @param c 
     * @param n 
     * @param s 
     * @param ma 
     * @return
     */
    public boolean aggDipendente(String matricola, String indirizzo, String cognome, String nome, float stipendio, String materia) {
    	 if(numDipendenti<vettDipendenti.length) {
         	Docente doc=new Docente( matricola,  indirizzo,  cognome,  nome,  stipendio,  materia);
         	vettDipendenti[numDipendenti]=doc;
         	numDipendenti++;
         	return true;
         }
        return false;
    }

    /**
     * @param matricola 
     * @return
     */
    public boolean eliminaDipendente(String matricola) {
    	for(int i=0;i<numDipendenti;i++) {
    		if(vettDipendenti[i].getMatricola().compareToIgnoreCase(matricola)==0) {
    			for(int j=i;j<numDipendenti;j++) {
    				vettDipendenti[j]=vettDipendenti[j+1];
    			}
    			numDipendenti--;
    			return true;
    		}
    	}
        return false;
    }

    /**
     * @param matricola 
     * @return
     */
    public Dipendenti cercaDipendente(String matricola) {
    	for(int i=0;i<numDipendenti;i++) {
    		if(vettDipendenti[i].getMatricola().compareToIgnoreCase(matricola)==0) {
    			return vettDipendenti[i];
    		}
    		
    	}
        return null;
    }

    /**
     * @param cognome 
     * @return
     */
    public Dipendenti[] cercaDipendenti(String cognome) {
    	for(int i=0;i<numDipendenti;i++) {
    		if(vettDipendenti[i].getCognome().compareToIgnoreCase(cognome)==0) {
    			return vettDipendenti;
    		}
    		
    	}
        return null;
    }
    
    public Docente[] stampaDocenti() {
    	int cont=0;
    	Docente[] d=new Docente[numDipendenti];
    	for(int i=0;i<numDipendenti;i++) {
    		if(vettDipendenti[i] instanceof Docente) {
    			d[cont]=(Docente) vettDipendenti[i];
    			cont++;
    		}
    	}
    	return null;
    }

	@Override
	public String toString() {
		return "Scuola [nome=" + nome + ", sede=" + sede + "]";
	}

    /**
     * @return
     */
	public static void main(String[] args) {
		Scuola s=new Scuola("I.I.S Meucci","Casarano",10);
		
		System.out.println(s.aggDipendente("bac123", "via Melissano 15", "manco", "daniel", 1200, 1));
		System.out.println(s.aggDipendente("def345", "caravan 1", "lupo", "alex", 1350, "biologia"));
		System.out.println(s);
		System.out.println(s.cercaDipendente("bac123"));
		System.out.println(s.cercaDipendente("def345"));
		System.out.println(s);
		
		Dipendenti[] d;
		d=s.cercaDipendenti("lupo");
		for(int i=0;i<s.numDipendenti;i++) {
			System.out.println(d[i]);
		}
		
		Dipendenti[] d1;
		d1=s.stampaDocenti();
		for(int i=0;i<s.numDipendenti;i++) {
			System.out.println(d[i]);
		}

	}

}
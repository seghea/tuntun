/**
 * <h1> Calcolatrice </h1>
 * Calcolatore somma, differenza, moltiplicazione e dvisione
 * @author Mosticchio Simone  *
 */
public class Calcolatrice {
	 private double a;
	 private double b;
	 
	 /**
	  * 
	  * @param a come prima variabile
	  * @param b come seconda variabile
	  */
	 
	 public Calcolatrice(double x, double y) {
	 a=x;
	 b=y; 
	} 
	 
	 /**
	  * Il metodo ritorna la prima variabile
	  * @return 
	  */
	 
	public double getA() {
	 return a; 
	} 
	
	/**
	 * Il seguente metodo assegna un valore alla prima variabile
	 * @param 
	 */
	
	public void setA(double a){
	 this.a = a;
	 } 
	

	 /**
	  * Il seguente metodo ritorna la seconda variabile
	  * @return 
	  */
	 
	public double getB()
	 { 
	return b; 
	} 
	
	/**
	 * Il seguente metodo assegna un valore alla seconda variabile
	 * @param 
	 */
	
	public void setB(double b){
	 this.b = b; 
	} 
	
	/**
	 * Il seguente metodo calcola la somma
	 * @param 
	 */
	
	public double Somma() 
	{ double somma=0;
	 somma = a + b; 
	return somma;
	 } 
	
	/**
	 * Il seguente metodo calcola la differenza
	 * @param 
	 */
	
	public double Differenza() {
	 double differenza=0;
	 differenza = a - b; 
	return differenza;
	 } 
	
	/**
	 * Il seguente metodo calcola la moltiplicazione
	 * @param 
	 */
	
	public double Prodotto() {
	 double prodotto=0;
	 prodotto = a * b;
	 return prodotto;
	 } 
	
	/**
	 * Il seguente metodo calcola la divisione
	 * @param 
	 */
	
	public double Divisione() {
	 double divisione=0; 
	divisione = a/b;
	 return divisione;
	 }
}
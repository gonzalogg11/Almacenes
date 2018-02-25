/**
 * Implementar un almacen de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre. 
 * @author Gonzalo Granizo 1DAW
 */

public class Almacen1 {

    static private final int LIBRE = 0;
    /**
     *Array con los valores almacenados
     */
    private int tvalores[];
    private int valoresAlmacenados = 0; 
    /**
     * Constructores sin parametros creo una tabla de 10 elementos
     */
    public Almacen1(){
    	/**
    	 * Llamo al constructor con parametros
    	 */
        this(10);  
    }
    
    /**
     * @param tamaño Constructor donde se fija tamaño maximo del Almacen
     */
    public Almacen1( int tamaño){
        tvalores = new int [tamaño];
        init();
    }
    
    /**
     * Pone todas las posiciones a LIBRES
     */
    public void init (){
        for (int i = 0; i < tvalores.length; i++) {
            tvalores[i] = Almacen1.LIBRE;
        }
        valoresAlmacenados = 0;
    }
    
    /**
     * Muestra una cadena con los valores de la tabla
     */
    public String toString (){
        StringBuilder tabla = new StringBuilder();
        for (int i = 0; i < tvalores.length; i++) {
            if(tvalores[i] != 0){
                tabla.append(tvalores[i]);
                tabla.append(", ");
            }
        }
        return tabla.toString();
    }
    
    /**
     * @return Devuelve el numero de posiciones libres
     */
    public int numPosicionesLibres(){
       int cont = 0;
        for (int i=0; i<tvalores.length; i++ ) {
            if (tvalores[i] == 0) {
                cont++;
                }
        }
        return cont;
    }
    
    /**
     * @return Devuelve el numero de posiones ocupadas
     */
    public int numPosicionesOcupadas(){
        int cont = 0;
        for (int i=0; i<tvalores.length; i++ ) {
            if (tvalores[i] != 0) {
                cont++;
                }
        }
        return cont;
    }
    
    /**
     * @param num Numero que queremos comprobar
     * @return Devuelve verdadero o falso si esta almacenado el valor en la tabla
     */
    public boolean estaValor (int num){
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == num) {
                return true;
            } else {
                break;
            }
        }
        return false;
    }
    
    /**
     * @param num Numero que queremos meter
     * @return Almacena el valor en la tabla y devuelve true, devuelve false si no puede almacenarlo
     */
    public boolean ponValor(int num){
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == 0) {
                tvalores[i] = num;
                return true;
            }
        }
        return false;
    }
    
    /**
     * @param num Numero que queremos quitar
     * @return Elimina el elemento de la tabla, si no esta devuelve false
     */
    public boolean sacarValor (int num){    
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == num) {
                tvalores[i] = 0;
                return true;
            } else {
                break;
            }
        }
        return false;
    }
    
    /**
     * @return Indica si el almacen esta lleno
     */
    public boolean estaLleno (){    
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
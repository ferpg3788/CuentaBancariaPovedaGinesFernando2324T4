package cuenta;


/** 
 * Clase CuentaPovedaGinesFernando2324T4, para realizar las operaciones asignadas a la cuenta
 */


public class CuentaPovedaGinesFernando2324T4 {


        private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    /**Constructor sin argumentos*/
    
    public CuentaPovedaGinesFernando2324T4 ()
    {
    }
   
   
    /**
     * Constructor con argumentos
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    
    public CuentaPovedaGinesFernando2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    
    /**
     * Método asignarNombre para asignar un nombre a la cuenta
     * @param nom nombre del titular de la cuenta
     */
    
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
   
    
    /**
     * Método obtenerNombre que devuelve el nombre asociado a la cuenta
     * @return devuelve nombre asociado a la cuenta
     */
   
    public String obtenerNombre()
    {
        return getNombre();
    }

    
    /**
     * Método estado que devuelve el saldo de la cuenta
     * @return devuelve saldo de la cuenta
     */
    
     public double estado ()
    {
        return getSaldo();
    }

     
     /**
      * Método para ingresar dinero en la cuenta, si la cantidad es correcta suma la cantidad ingresada al saldo inicial
      *@param cantidad cantidad a ingresar
      *@param concepto concepto de ingreso
      *@throws Exception si la cantidad es menor que 0.
      */
   
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /**
     * Método para retirar dinero de la cuenta, si la cantidad es correcta resta la cantidad retirada al saldo inicial
     * @param cantidad  cantidad a retirar 
     * @throws Exception si la cantidad es igual o menor que cero
     * @throws Exception si la cantidad igual o mayor que el saldo de la cuenta
     */    
    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el número de cuenta asociado
     * @return obtener número de cuenta
     */
    
    public String obtenerCuenta ()
    {
        return getCuenta();
    }

    /**
     * Método para obetner el nombre del titular de la cuenta
     * @return obtener el nombre del titular
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar/cambiar el nombre del titular de la cuenta
     * @param nombre nombre del titular de la cuenta
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para asignar/cambiar el número de cuenta
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta
     * @return saldo de cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para asignar/cambiar el valor del saldo de la cuenta
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés asociado la cuenta
     * @return tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método para asignar/cambiar el valor del tipo de interés
     * @param tipoInteres tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}

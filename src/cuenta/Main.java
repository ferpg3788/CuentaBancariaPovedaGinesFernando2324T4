package cuenta;

/** 
 * Clase main del programa, que define un objeto cuenta con unos parámetros y realiza acciones de ingresar y retirar dinero de la cuenta
 * 
 * @author ferpg
 */


public class Main {
    
    /**
     * Método Main
     * 
     * Este método es el princinpal de ejecución del programa
     */

    
    public static void main(String[] args) {
        CuentaPovedaGinesFernando2324T4 miCuentaPovedaGinesFernando2324T4;
        double saldoActual;
        int x;
        
        miCuentaPovedaGinesFernando2324T4 = new CuentaPovedaGinesFernando2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaPovedaGinesFernando2324T4.estado()+"€");
        
        retiraDineroPovedaGinesFernando(miCuentaPovedaGinesFernando2324T4);
        
        ingresaDineroPovedaGinesFernando(miCuentaPovedaGinesFernando2324T4);
        saldoActual = miCuentaPovedaGinesFernando2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    
    
    /** Método ingresaDineroPovedaGinesFernando.
     * 
     * En este método se va a realizar la acción de ingresar 100 € a la cuenta
     * 
     * Al ingresar los 100 € no saltará la excepción y se aumentará el saldo de la cuenta en 100 €
     * 
     * @param miCuentaPovedaGinesFernando2324T4 objeto cuenta a ingresar dinero
     * @throws Excepción si la cantidad a ingresar es negativao 0.
     */
    
    
    private static void ingresaDineroPovedaGinesFernando(CuentaPovedaGinesFernando2324T4 miCuentaPovedaGinesFernando2324T4) {
        int x;
        
        /*Vamos a intentar ingresar 100 € para lo cual no debe saltar la excepción y devolvernos el importe del saldo inicial más la cantidad ingresada*/
        
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaPovedaGinesFernando2324T4.ingresar(x, Ingreso);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    
    
    /**Método retiraDInroPovedaGinesFernando
     * 
     * En este método se va a realizar la acción de retirar 1.500€ de la cuenta
     * 
     * Al retirar los 1.500 € no saltará la excepción y se disminuirá el saldo de la cuenta en 1.500 €
     * 
     * @param miCuentaPovedaGinesFernando2324T4 objeto cuenta de la que retirar dinero
     * @throws Excepción si la cantidad a retirar es igual o menor que 0, o si el saldo de la cuenta es menor o igual que la cantidad a retirar
     */
    
    
    
    private static void retiraDineroPovedaGinesFernando(CuentaPovedaGinesFernando2324T4 miCuentaPovedaGinesFernando2324T4) {
        int x;
       
        /*Vamos a intentar retirar 1.500 € para lo cual no debe saltar la excepción ya que tenemos un saldo incial de 2.500, nos debe devolver el importe del saldo inicial menos
         * la cantidad retirada
         */
        
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaPovedaGinesFernando2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}

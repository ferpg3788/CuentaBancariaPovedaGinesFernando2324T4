package cuenta;


public class Main {

    
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

    private static void ingresaDineroPovedaGinesFernando(CuentaPovedaGinesFernando2324T4 miCuentaPovedaGinesFernando2324T4) {
        int x;
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

    private static void retiraDineroPovedaGinesFernando(CuentaPovedaGinesFernando2324T4 miCuentaPovedaGinesFernando2324T4) {
        int x;
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

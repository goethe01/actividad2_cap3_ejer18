package com.mycompany.cap3_ejer18;
import java.util.Scanner;
public class Cap3_ejer18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner nuevo = new Scanner(System.in);
        
        System.out.println("dame el código del empleado");
        int cod_empleado = entrada.nextInt(); 
        
        System.out.println("dame los nombres del empleado");
        String nombre = nuevo.nextLine();
        
        System.out.println("dame el numero de horas trabajadas al mes");
        int num_horas = entrada.nextInt();
        
        System.out.println("dame el valor del trabajo por hora");
        int val_hora = entrada.nextInt();
        
        System.out.println("dame el porcentage de retención en la fuente");
        float porcen_reten = entrada.nextFloat();
        
        
        float sal_bruto = num_horas * val_hora;
        float sal_neto = sal_bruto - (sal_bruto * porcen_reten);
        
        System.out.print("codigo: " + cod_empleado +"\n"+"nombres: "+nombre+"\n"+"su salario bruto es de: "+sal_bruto+"\n"+"su salario neto es de: "+sal_neto);
    }
}

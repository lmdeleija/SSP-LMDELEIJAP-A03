/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmdeleijap.a03;
import java.util.Scanner; 
/**
 *
 * @author Luis Mario
 */
public class SPPLMDELEIJAPA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROGRAMA PARA CALCULAR HIPOTENUSA 
        double catetoAdyacente, catetoOpuesto, hipotenusa;
        catetoAdyacente = pedirCatetoAdyacente ();
        catetoOpuesto = pedirCatetoOpuesto ();
        hipotenusa = calcularHipotenusa(catetoAdyacente, catetoOpuesto);
        mostrarHipotenusa(hipotenusa);
        
    }
    public static double pedirCatetoAdyacente(){
        double catetoAdyacente;
        System.out.println("Valor del cateto Adyacente");
        Scanner entradaCatetoAdyacente = new Scanner(System.in);
        catetoAdyacente = entradaCatetoAdyacente.nextDouble();
        return catetoAdyacente;
    }
    
    public static double pedirCatetoOpuesto(){
    double catetoOpuesto;
    System.out.println("Ingrese el valor del cateto opuesto");
    Scanner entradaCatetoOpuesto = new Scanner(System.in);
    catetoOpuesto = entradaCatetoOpuesto.nextDouble();
    return catetoOpuesto;
    
}
    public static double calcularHipotenusa(double catetoAdyacente, double catetoOpuesto){
double hipotenusa;
hipotenusa = Math.sqrt(Math.pow(catetoAdyacente, 2)+ Math.pow(catetoOpuesto, 2));
return hipotenusa;
}
public static void mostrarHipotenusa(double hipotenusa){
System.out.println("El valor de la hipotenusa es igual a: " + hipotenusa);
System.out.println("Metodos de Math Utilizados:");
System.out.println("1.- Elevación al cuadrado");
System.out.println("2.- Calculo de raíz cuadrada");
}

}
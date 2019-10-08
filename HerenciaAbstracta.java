/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaabstracta;

import java.text.DecimalFormat;

/**
 *
 * @author pumit
 */
public class HerenciaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	DecimalFormat dosDigitos = new DecimalFormat ("0.00");

	// Crear o bj e t o s Punto , Ci r c ul o y C il i n d r o
	Punto punto = new Punto (7, 11);
	Circulo circulo = new Circulo (22, 8, 3.5);
	Cilindro cilindro = new Cilindro (20, 30, 3.3, 10.75);
		
	//Obtener nombre y r e p r e s e n t a c i o n de cadena de cada o bj e t o
	System.out.println ("Nombre y representacion de cadena: ");
	System.out.println (punto.obtenerNombre() + " : " + punto + "\n" + circulo.obtenerNombre() + " : " + circulo + "\n" + cilindro.obtenerNombre() + " : " + cilindro + "\n");
		
	// Crear un a r r e g l o de Fig u ra s
	Figura arregloDeFiguras [] = new Figura [3] ;

	// Apuntar a r r e gloD eFig u ra s [ 0 ] a l o bj e t o de l a s u b cl a s e Punto
	arregloDeFiguras[0] = punto;

	// Apuntar a r r e gloD eFig u ra s [ 1 ] a l o bj e t o de l a s u b cl a s e Punto
	arregloDeFiguras[1] = circulo;
		
	// Apuntar a r r e gloD eFig u ra s [ 0 ] a l o bj e t o de l a s u b cl a s e Punto
	arregloDeFiguras[2] = cilindro;
	// i t e r a r a t r a v e s d el a r r e g l o para o b t e n e r nombre ,
        	// r e p r e s e n t a c i o n de cadena , a r ea y volumen de cada
        	// Figu ra en e l a r r e g l o .
	System.out.println ("\nNombre e invocaciones: ");
	for (int i = 0; i < arregloDeFiguras.length; i++){
            		System.out.println (arregloDeFiguras[i].obtenerNombre ());
            		System.out.println (arregloDeFiguras[i].toString ());
            		System.out.println (arregloDeFiguras[i].obtenerArea());
            		System.out.println (arregloDeFiguras[i].obtenerVolumen());
            		System.out.println ("\n");
	}
   }
    
}

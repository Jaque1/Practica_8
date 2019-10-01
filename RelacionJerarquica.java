public class RelacionJerarquica{
	public static void main (String [] args){
		Punto punto = new Punto (30, 50) ;
		Circulo circulo = new Circulo (120, 89, 2.7) ;
		circulo=(Circulo)punto;
		System.out.println (" Llamado a toString de Punto con referencia " + "a la super clase apuntando al objeto de la super clase: \n" + punto.toString());
		System.out.println (" Llamado a toString de Circulo con referencia " + " a la subclase apuntando al objeto de la subclase : \n" + circulo.toString());
		Punto refPunto = circulo;
		System.out.println (" Llamado a to String de Circulo con referencia " + " a la super clase apuntando al objeto de la subclase : \n" + refPunto.toString ());
	}
}

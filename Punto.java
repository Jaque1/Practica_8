public class Punto extends Figura{
 private int x;
 private int y;

public String obtenerNombre(){
	return "Punto";
}

 public Punto(){}

 public Punto(int valorX, int valorY){
  x = valorX;
  y = valorY;
 }

 public void setX(int valorX){
  x = valorX;
 }

 public int getX(){
  return x;
 }

 public void setY(int valorY){
  y = valorY;
 }

 public int getY(){
  return y;
 }

 public String toString(){
  return "[" + getX() + ", " + getY() + "]";
 }
}
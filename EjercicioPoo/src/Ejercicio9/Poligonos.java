/*
HAcer un programa para calcular el area de poligonos (triangulos y rectangulos) el programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos
y al final mostrar el area y los datos de cada uno. Para ello se tendra lo siguiente:
- una super clase llamada poligono
- una sub clase llamda rectangulo
- una sub lcase llamada triangulo
*/


package Ejercicio9;


public abstract class Poligonos {
    protected int numeroLados;

    public Poligonos(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "numeroLados= " + numeroLados ;
    }
    
    
    //declaramos el metodo area como abstracto.. es ilogico calcular aqui porquie no sabemos a que figura calcularemos el area
    //al colocarlo abstracto las clases hijas si o si deberan implementar el metodo
    public abstract double area();
    
}

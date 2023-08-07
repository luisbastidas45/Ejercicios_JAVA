
package Poli;

public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    
    
    @Override
    public String mostrarDatos(){
        return  "Matricula: "+matricula+'\n'+"marca: "+marca+"\n"+"Modelo: "+modelo+"\n"+"Numero de puertas:  "+numeroPuertas;
    }
}

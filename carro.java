
/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro
{
    // instance variables - replace the example below with your own
    private String color; //cadena de texto
    private double galones; //porque es tipo decimal
    private boolean encendido; //

    /**
     * Constructor for objects of class carro
     */
    public carro()
    {
        // vamos a darle valor a los atributos en esta seccion(el constructor)
        this.color = "negro"; // usaremos la palabra reservada this que hace referencia a la propia clase
        this.galones = 30.5;
        this.encendido = false; // por defecto lo dejaremos que no esta arrncado
    }

    public carro(String newColor, double newGalones, boolean newArrancado)
    //que tendriamos que hacer con estos atributos que nos pasen aqui? pues tendriamos que asignarlos a los atributos de la clase
    {
        //vamos a darle valor a los atributos en esta seccion (el contrutor)

        this.color = newColor; //usaremos la palabra reservaa que hace referencia a la propia clase
        this.galones = newGalones;
        this.encendido = newArrancado; //por defecto lo dejaremos que no esta arrancado

    }

    public void setColor(String newColor){

        this.color = newColor;
    }

    public void setGalones(double newGalones){

        this.galones = newGalones;

    }

    public void setArrancado(boolean newArrancado){

        this.encendido = newArrancado;
    }
}


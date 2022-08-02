import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Persona user1 = new Persona();
        user1.setNombre("Alfredo");
        user1.setEdad(30);
        user1.setCell(444555);

        System.out.println("Nombre: " + user1.getNombre());
        System.out.println("Edad: " + user1.getEdad());
        System.out.println("Telefono: " + user1.getCell());



    }
}
class Persona {
    private String nombre;
    private int edad;
    private int cell;

    /*Get y Set variables encapsuladas*/

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setCell(int cell){
        this.cell = cell;
    }
    public int getCell(){
        return this.cell;
    }

}
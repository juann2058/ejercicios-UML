public class mascota {
    private String nombre;
    private int edad;


    public mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarinf (){
        System.out.println("nombre " + nombre);
        System.out.println("edad " + edad);
    }


/// herencia

    private String raza;

    public mascota(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void mostPrro (){
        mostrarinf();
        System.out.println("raza: " +raza);
    }





}

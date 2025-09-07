package Ejercicio4;

public abstract class Persona {
    private String nombre;
    private String contacto;

    public Persona(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }
}


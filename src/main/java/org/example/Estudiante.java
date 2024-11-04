package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//definir a "estudiante" como el elemento raiz del XML
@XmlRootElement(name = "estudiante", namespace = "http://example.org/estudiantes")
public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    //@XmlElement : define nombre como un elemento
    @XmlElement(namespace = "http://example.org/estudiantes")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement(namespace = "http://example.org/estudiantes")
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlElement(namespace = "http://example.org/estudiantes")
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", matricula='" + matricula + '\'' +
                "--------- \n";
    }
}

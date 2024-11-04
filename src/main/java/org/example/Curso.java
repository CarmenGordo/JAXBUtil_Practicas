package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Curso {

    private String nombreCurso;
    private List<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public Curso(String nombreCurso, List<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = estudiantes;
    }

    @XmlElement
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    //@XmlElementWrapper : contenedor
    @XmlElementWrapper(name = "listaEstudiantes")
    @XmlElement(name = "estudiante")
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", estudiantes=" + estudiantes +
                "--------- \n";
    }
}
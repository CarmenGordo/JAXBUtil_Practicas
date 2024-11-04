package org.example;

import javax.xml.bind.JAXBException;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Estudiante estudiante = new Estudiante("Juana", 19, "A123");
            File file = new File("estudiante.xml");

            JAXBUtil.marshal(estudiante, file);
            System.out.println("El estudiante está serializado a XML");
            Estudiante estudianteDesdeXML = JAXBUtil.unmarshal(file);

            System.out.println("Estudiante desde XML: " + estudianteDesdeXML);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
package org.example;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class JAXBUtil {

    public static void marshal(Estudiante estudiante, File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Estudiante.class);

        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(estudiante, file);
    }

    public static Estudiante unmarshal(File file) throws JAXBException, SAXException {
        JAXBContext context = JAXBContext.newInstance(Estudiante.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("estudiante.xsd"));
        unmarshaller.setSchema(schema);

        return (Estudiante) unmarshaller.unmarshal(file);
    }

}

Para la realizacion de este proyecto:
    1º Se creó la clase "Estudinate.java", donde si se abren se verán pequeñas anotaciones que explican el código; como por ejemplo elementos de anotacion como:
        - @XmlRootElement: que ayuda a definir el elemento raiz del XML
        - @XmlElement: que define el nombre como un elemento, esto se suele usar al llamar a los metodos Getter y Setter de las variables de la clase
        - @Override: indica que la clase hija, edita a su padre o a la interfaz

    2º Se creó la clase "JAXBUtil.java", que implementará los metodos para serializar y deserializar de la clase Estudiante. Para ello, se usó:
        - JAXBException: arroja un error al usar el JAXB, por ejempplo si la clase Estudiante, no tien ebien configurados sus @XmlRootElement o sus metodos Getter y Setter no son accesibles
        - JAXBContext: hace de conector para que el JAXB pueda funcionar, esto hace que los dos siguientes metodos puedan usarse
        - Marshaller: o serializador, convierte el objeto en un XML
        - Unmarshaller: o deserializador, convierte el XMl en el mismo objeto java

    3º Creación de "Curso.java", que llamara a la clase Estudiante. Aqui podremos ver nuevos elementos como: 
        - @XmlElementWrapper: que hará de contenedor para una lista de Estudiante, dentro de la clase Curso. Debe de ir seguido de su @XmlElement para indicarle que elementos irán dentro

    4º Para la depuración:
        4.1 Se prueban los métodos marshal y unmarshal, para ello el Main.java, se modifica, añadiendo un nuevo estudiante.
        4.2 Depuración del código (img1)
        4.3 Se han puesto los puntos de interrupción (img2, img3)
            En mi caso, tenia errores con las dependecias, para ello se cambiaron, ahora si no daria error a la hora de la depuracion (img4, img5)
        4.4 
        
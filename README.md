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
        4.4 Quitar una anotacion (img6). Al ejecutar el programa, habiendo quitado la anotación @XmlRootElement, el mismo detecta que hay un problema, indicando que es lo que necesita; esto hace que JAXB no puede identificarla como un elemento raíz. La solucion para este es poner la anotacion correspondiente. 
        4.5 Datos incompatibles (img7). Indica que hay un error, ya que nombre lo definimos principalmente como un String y luego en su metodo getNombre(), lo llamamos como un Intenger. Esto hace un error de lectura de los datos; para corregirlo hay que poner el tipo de dato de la varible, justo como se ha definido a su inicio.
        
        
    5º Consideraciones importantes:
        5.1 Uso de serialVersionUID, para ello se añade en la clase Estudiante
        5.2 Para el manejo de colecciones, se ha usado el @XmlElementWrapper en la clase Curso, para controlas la lista de Estudiante
        5.3 Para el uso de NamespacesXML, en JAXB, se usa para que no haya conflictos con los nombres de los elementos y los atributos
        5.4 La validación del unmarshalling, comprueba que si se puede deserializar el estudiante o no, pasando de un archivo XML a un objeto java. Para ello, se usa SchemaFactory, que es una clase para la validacion del XML, este permite usar Schema, para configurar varias propiedades que controlan cómo se realiza la validación
        5.5 Para que los errores se detecten con los metodos de marshal (serialización) o de un unmarshal (deserialización)gº
/**
 * Esta clase 'UserController' pertenece al paquete 'controllers'.
 * En principio, solo debería atender a los requests HTTP,
 * y según sea GET, POST, u otro método, analizar el contenido
 * del request, y decidir a qué método llamar. 
 * En principio, esta clase no debería hacer el trabajo. No.
 * Lo que debería hacer es llamar al método encargado de hacer
 * el trabajo y pasarle los parámetros necesarios. 
 * Ese otro método llamado debería pertenecer a una clase del paquete 'services'. 
 * Pero nosotros no tenemos ese paquete, porque este es un ejemplo muy simple.
 * Veremos que esta clase 'UserController' hace todo el trabajo, lo que no debería ser así.
 * Entonces, tenemos que recordar que estamos dejando de lado un principio
 * muy importante, para no complicar este ejemplo.
 */

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.productos;
import com.example.demo.repositories.UserRepository;

/**
 * La anotación @RestController es la combinación de @Controller
 * y @ResponseBody.
 * Está anotando la clase, o sea que todos los métodos la heredan y
 * no es necesario anotar cada uno de ellos. Todos tendrán la semántica
 * de @ResponseBody. Esto significa que la String retornada es la response, no
 * el nombre de una vista.
 */
@RestController
// La URL que va entre paréntesis en esta anotación habrá que agregarla detrás
// del puerto 8080 en todas las llamadas a esta aplicación.
// Por ejemplo @RequestMapping("/user") resultaría en lo siguiente:
// localhost:8080/user.... y detrás de esto habría que agregar el
// resto de la URL.
// En este caso, no necesitamos nada, y queda simplemente localhost:8080
@RequestMapping("")
public class UserController {
    /**
     * Qué es un bean en Java
     * https://stackoverflow.com/a/3295517/2740402
     * Un JavaBean es solo un estándar. Es una clase regular de Java, excepto que
     * sigue ciertas convenciones:
     * - Todas las propiedades son privadas (usan getters y setters).
     * - Tiene un constructor público sin argumentos.
     * - Implementa la interfaz Serializable.
     * Eso es todo. Es solo una convención.
     * 
     * La anotación '@Autowired' significa que Spring va a inyectar en esta clase un
     * bean llamado 'userRepository' de tipo 'UserRepository'.
     * No hay en este proyecto una clase 'UserRepository'. Solo hay una
     * interfaz 'UserRepository'. Y esta interfaz lo único que hace es extender
     * 'CrudRepository'. No declara ni campos ni métodos. Nosotros no hacemos nada,
     * todo lo hace Spring por nosotros.
     * Esta es la inyección de dependencia. Nosotros lo único que hacemos es
     * declarar la variable 'userRepository' de tipo 'UserRepository', y ponerle
     * la anotación '@Autowired'. Y listo. Ya tenemos en esta clase 'UserController'
     * la variable 'userRepository' correctamente configurada e inicializada, de
     * manera que la podemos usar sin más.
     * Notar que tampoco hemos programado los métodos que estamos llamando,
     * y que están declarados en la interfaz 'CrudRepository'.
     * Los nombres de los métodos que nosotros creamos en esta clase
     * son arbitrarios. Pero los nombres de los métodos que invocamos
     * sobre el objeto 'userRepository' tienen que ser los de la interfaz.
     */
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add") // Map ONLY POST Requests
    // @RequestParam means it is a parameter from the GET or POST request
    public String añadirProducto(@RequestParam int id, @RequestParam String componente, @RequestParam Double precio, @RequestParam int stock) {

        /*Se crea un objeto user de tipo productos para asignarle los set y que con postman podamos ingresar nuevos datos a la tabla */
        productos user = new productos();
        user.setId(id);
        user.setComponente(componente);
        user.setPrecio(precio);
        user.setStock(stock);
        userRepository.save(user);
        return "Se grabó el nuevo producto.";
    }

   

    @GetMapping("/GamerShop")
    public String mostrarProducto() {
        // This returns a JSON or XML with the users
        Iterable<productos> iterable = userRepository.findAll();
        /*a la variable resp se le asigna primeraParte, que es el método donde tenemos el html y css para mostrar la tabla*/
        String resp = primeraParte();
        /**
         * Ya terminé con la fila de los encabezados, y ahora tengo que
         * generar el cuerpo de la tabla, una fila por cada registro.
         * No puedo usar forEach() con una función lambda
         * porque el scope de las variables no lo permite.
         * Por eso uso el for mejorado, para recorrer el objeto iterable.
         */
        for (productos user : iterable) {
            /*Acá le decimos a resp que concatene la siguiente tabla a lo que está en el método primeraParte, y así agregamos también los datos de la base de datos con los get, para luego mostrarlos en el buscador */
            resp += "<tr>"
                    + "<td>" + user.getId() + "</td>"
                    + "<td>" + user.getComponente() + "</td>"
                    + "<td>" + user.getPrecio() + "</td>"
                    + "<td>" + user.getStock() + "</td>"
                    + "</tr>";
        }
        return resp + "</table>";
    }

    private String primeraParte() {
        /**
         * Lo que viene a continuación se llama text block,
         * y es tipo String. El Manual de Java los describe en
         * la sección 3.10.6 Text Blocks.
         * 
         * Ese bloque de texto es todo que lo que está contenido entre los dos
         * delimitadores: el de apertura y el de cierre.
         * El delimitador de apertura es la triple comilla ' """ ' que está a la
         * derecha de la sentencia return.
         * El delimitador de cierre es la triple comilla ' """ ' que está al final.
         * Todo es seguido por el punto y coma, porque es el final de una sentencia.
         * 
         * No es buen estilo incluir cadenas largas en un archivo de código fuente.
         * Esto lo hago solo para no introducir una complicación que no agregaría
         * nada a los conceptos que estoy discutiendo ahora.
         * 
         * Comenzamos por poner unos estilos CSS, para que la tabla quede más linda.
         * 
         * Cuando terminamos con los estilos, arrancamos con el HTML de la
         * tabla misma. Lo primero que hacemos es generar una fila y en las
         * celdas de esa fila poner los encabezados, que son los nombres de
         * las columnas o campos de la tabla que está en la base de datos.
         * 
         * Dentro del estilo, el selector #users indica que el estilo
         * que estamos definiendo es para ser usado solamente en el
         * elemento del DOM que tiene id='users', o sea la tabla.
         */
        return """
          <html>
            <head>
              <link rel="preconnect" href="https://fonts.googleapis.com" >
              <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
              <link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@700&display=swap" rel="stylesheet">
              <title> GamerShop.com </title>
            </head>
            <body>
              <center>
                <div>
                  <h1>Gamer Shop</h1>
                </div>
                <table id='users'>
                  <tr>
                    <th>Id</th>
                    <th>Componente</th>
                    <th>Precio</th>
                    <th>Stock</th>
                  </tr>
              </center>
            </body>
          </html>
          <style>
            body{
              background: #c31432;
              background: -webkit-linear-gradient(to right, #240b36, #c31432);
              background: linear-gradient(to right, #240b36, #c31432);
            }
            #users {
              background: #c31432;
              background: -webkit-linear-gradient(to right, #240b36, #c31432);
              background: linear-gradient(to right, #240b36, #c31432);
              font-family: Sans-Serif;
              border-collapse: separated;
              width: 90%;
            }
            #users td, #users th {
              border: 4px solid #ddd;
              padding: 20px;
              text-align: center;
              border-radius: 20px;
            }
            div{
              height: 80px;
              width: 1155px;
              background: #0f0c29;  
              background: -webkit-linear-gradient(to right, #24243e, #302b63, #0f0c29);  
              background: linear-gradient(to right, #24243e, #302b63, #0f0c29); 


              padding-top: 2px;
              padding-bottom: 2px;
              border-radius: 20px;
            }
            h1{
                color: #c31432;
                color: -webkit-linear-gradient(to right, #240b36, #c31432);
                color: linear-gradient(to right, #240b36, #c31432);
                
                font-family: 'Libre Baskerville', serif;
            }
            #users tr:nth-child(odd){background-color: #FDEBD0;}
            #users tr:nth-child(even){background-color: #CFC7E9;}
            #users tr:hover {
              background : #c31432;
              background: -webkit-linear-gradient(to right, #240b36, #c31432);
              background: linear-gradient(to right, #240b36, #c31432);
              color: #fff;
            }
            #users th {
              padding-top: 20px;
              padding-bottom: 20px;
              background-color: #000;
              color: #fff;
            }
          </style>
              """;
    }
}
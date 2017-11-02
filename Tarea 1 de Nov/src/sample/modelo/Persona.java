package sample.modelo;


import java.util.ArrayList;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

/**
 * Created by T. Garcia on 01/11/2017.
 */
public class Persona {
    private String nombre;

    private String apellido;

    private int edad;


    public Persona(String nombre, String apellido, int edad) {

        this.nombre = nombre;

        this.apellido = apellido;

        this.edad = edad;

    }

    private static Persona personas[] = {

            new Persona("Tulio", "Garcia", 20),
            new Persona("David", "Martinez", 20),
            new Persona("David", "Delcid", 20),
            new Persona("Josue", "Cordova", 20),
            new Persona("Felix", "Peralta", 21),
            new Persona("Yarince", "Padila", 22)
    };

    public static Persona buscarPorPosicion(int posicion) {
        try {
            return personas[posicion];
        } catch (IndexOutOfBoundsException e) {

            return null;

        }

    }

    public static Persona busquedaNombre(String buscar) {
        for (int i = 0; i < personas.length; i++) {
            if (buscar.equals(personas[i].nombre)) {

                System.out.println(personas[i]);

            }
        }
        return null;
    }

    public static Persona buscarParcial(String buscar) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].nombre.startsWith(buscar)) {

                System.out.println(personas[i].nombre + " " + personas[i].apellido + " " + personas[i].edad + "años");

            }

        }
        return null;
    }

    public static String buscarRegex(String regex) {
        for (int i = 0; i < personas.length; i++) {

            Pattern patron = Pattern.compile("(?i)" + regex);
            Matcher m = patron.matcher(personas[i].nombre + " " + personas[i].apellido + " " + personas[i].edad);

            if (m.find()) {
                System.out.println(personas[i].nombre + " " + personas[i].apellido + " " + personas[i].edad + "\n");
            }

        }
        return null;
    }
}
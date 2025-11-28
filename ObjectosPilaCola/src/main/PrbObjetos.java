package main;

import datos.Leer;
import pilaDinámica.PilaDin;
import colaDinámica.ColaDin;
import objetosAPF.*;

public class PrbObjetos {
    public static void main(String[] args) {
        Object aux;
        String op, op1;
        PilaDin pila = new PilaDin();
        Animal anim = new Animal();
        Persona pers = new Persona(), auxP;        
        Figura fig = new Figura();
        ColaDin cdin = new ColaDin();
        try {
            do {
                op1 = Leer.leerString("- Menú -\n"
                        + "1) Insertar Persona\n"
                        + "2) Insertar Animal\n"
                        + "3) Insertar figura\n"
                        + "4) Imprimir\n"
                        + "5) Salir\n"
                        + "Ingrese opción: ");
                switch (op1) {
                    case "1":
                        pers.setNomCompleto(Leer.leerString("Ingrese nombre de la persona: "));
                        pers.setSexo(Leer.leerString("Ingrese sexo: "));
                        pers.setEdad(Leer.leerInt("Ingrese edad: "));
                        //pila.push(pers);
                        op = Leer.leerString("Elija donde desea insertar\n"
                                + "1) Insertar objeto en Pila\n"
                                + "2) Insertar objeto en Cola\n"
                                + "Ingrese opción: ");                        
                        switch (op) {
                            case "1":
                                pila.push(pers);
                                break;
                            case "2": 
                                cdin.push(pers);
                                break;
                            default:
                                System.out.println("Estructura incorrecta, ingrese datos otra vez");
                                break;
                        }
                        break;
                    case "2":
                        anim.setNombre(Leer.leerString("Ingrese nombre del animal: "));
                        anim.setTipo(Leer.leerString("Ingrese tipo de animal: "));                        
                        anim.setNumPatas(Leer.leerInt("Ingrese número de patas: "));                        
                        //pila.push(anim);
                        op = Leer.leerString("Elija donde desea insertar\n"
                                + "1) Insertar objeto en Pila\n"
                                + "2) Insertar objeto en Cola\n"
                                + "Ingrese opción: ");
                        switch (op) {
                            case "1":
                                pila.push(anim);
                                break;
                            case "2":
                                cdin.push(anim);
                                break;
                            default:
                                System.out.println("Estructura incorrecta");
                                break;
                        }
                        break;
                    case "3":
                        fig.setNombre(Leer.leerString("Ingrese nombre de la figura: "));
                        fig.setDimension(Leer.leerString("Ingrese dimensión: "));
                        fig.setNumLados(Leer.leerInt("Ingrese número de lados: "));
                        op = Leer.leerString("Elija donde desea insertar\n"
                                + "1) Insertar objeto en Pila\n"
                                + "2) Insertar objeto en Cola\n"
                                + "Ingrese opción: ");
                        switch (op) {
                            case "1":
                                pila.push(fig);
                                break;
                            case "2":
                                cdin.push(fig);
                                break;
                            default:
                                System.out.println("Estructura incorrecta, inserte otra vez el dato");
                                break;
                        }
                        break;
                    case "4":
                        op = Leer.leerString("Elija que desea imprimir\n"
                                + "1) Objetos Persona\n"
                                + "2) Objetos Animales\n"
                                + "3) Objetos Figura\n"
                                + "Ingrese opción: ");
                        switch (op) {
                            case "1":                                
                                while (!pila.empty()) {
                                    auxP = (Persona)pila.pop();
                                    System.out.println(auxP.toString());
                                }
                                
                                break;
                            case "2":
                                anim.toString();
                                break;
                            case "3":
                                fig.toString();
                                break;
                            default:
                                System.out.println("Estructura incorrecta");
                                break;
                        }

                        System.out.println("Datos de la pila");
                        break;
                    default:
                        break;
                }
            } while (!op1.equals("5"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

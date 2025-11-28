package objetosAPF;
import datos.Leer;
import pilaDinámica.PilaDin;
import colaDinámica.ColaDin;
public class prbObjetos {
    public static void main(String[] args) {
        Object dato = null;
        String op, op1;
        PilaDin pila = new PilaDin();
        Animal anim = new Animal();
        Persona pers = new Persona();
        Figura fig = new Figura();
        ColaDin cdin = new ColaDin();
        try {
            do {
                op = Leer.leerString("- Menú -\n"
                        + "1) Insertar objeto en Pila\n"
                        + "2) Insertar objeto en Cola\n"
                        + "s) Salir\n"
                        + "Ingrese opción: ");
                switch (op) {
                    case "1":
                        do {
                            op1 = Leer.leerString("<---- Menú ---->\n"
                                    + "1) Insertar Persona\n"
                                    + "2) Insertar Animal\n"
                                    + "3) Insertar Figura\n"
                                    + "4) Imprimir\n"
                                    + "5) Salir\n"
                                    + "Ingrese opción: ");
                            switch (op1) {
                                case "1":
                                    pers.setNomCompleto(Leer.leerString("Ingrese nombre de la persona: "));
                                    pers.setSexo(Leer.leerString("Ingrese sexo: "));
                                    pers.setEdad(Leer.leerInt("Ingrese edad: "));
                                    pila.push(pers);
                                    break;
                                case "2":
                                    anim.setNombre(Leer.leerString("Ingrese nombre del animal: "));
                                    anim.setTipo(Leer.leerString("Ingrese tipo de animal: "));
                                    anim.setNumPatas(Leer.leerInt("Ingrese número de patas: "));
                                    pila.push(anim);
                                    break;
                                case "3":
                                    fig.setNombre(Leer.leerString("Ingrese nombre de la figura: "));
                                    fig.setDimension(Leer.leerString("Ingrese dimensión: "));
                                    fig.setNumLados(Leer.leerInt("Ingrese número de lados: "));
                                    pila.push(fig);
                                    break;
                                case "4":
                                    System.out.println("Datos de la pila");
                                    while (!pila.empty()) {
                                        System.out.println(pila.pop().toString());
                                    }
                                    break;
                                default:
                                    System.out.println("Opción incorrecta");
                                    break;
                            }
                        } while (!op1.equals("5"));
                        break;
                    case "2":
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
                                    pers.setSexo("Ingrese sexo: ");
                                    pers.setEdad(Leer.leerInt("Ingrese edad: "));
                                    pers.setNomCompleto(Leer.leerString("Ingrese nombre de la persona: "));
                                    cdin.push(pers);
                                    break;
                                case "2":
                                    anim.setNombre(Leer.leerString("Ingrese nombre del animal: "));
                                    anim.setTipo(Leer.leerString("Ingrese tipo de animal: "));
                                    anim.setNumPatas(Leer.leerInt("Ingrese número de patas: "));
                                    cdin.push(anim);
                                    break;
                                case "3":
                                    fig.setNombre(Leer.leerString("Ingrese nombre de la figura: "));
                                    fig.setDimension(Leer.leerString("Ingrese dimensión: "));
                                    fig.setNumLados(Leer.leerInt("Ingrese número de lados: "));
                                    cdin.push(fig);
                                    break;
                                case "4":
                                    System.out.println("Datos de la Cola");
                                    while (!cdin.empty()) {
                                        System.out.println(cdin.pop().toString());
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } while (!op1.equals("5"));
                        break;
                    default:
                        break;
                }

            } while (!op.equals("s"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

package Main;

import SubClase.Dim2D.*;
import SubClase.Dim3D.*;
import Datos.Leer;

public class PrbFigura {

    public static void main(String[] args) {
        String op;
        System.out.println("BIENVENIDO A PROGRAMA DE FIGURAS");
        do {
            System.out.println("Elija la dimensión de la figura");
            System.out.println("a) 2D");
            System.out.println("b) 3D");
            System.out.println("c) Piramides");
            System.out.println("s) Salir");
            op = Leer.leerString("Ingese opción:\t").toLowerCase();
            switch (op) {
                case "a":
                case "2d":
                    do {
                        System.out.println("Elija una figura a calcular");
                        System.out.println("a) Cuadrado");
                        System.out.println("b) Rectangulo");
                        System.out.println("c) Circulo");
                        System.out.println("d) Rombo");
                        System.out.println("e) Trapecio");
                        System.out.println("r) Regresar");
                        op = Leer.leerString("Ingrese opción:\t").toLowerCase();
                        switch (op) {
                            case "a":
                            case "cuadrado":
                                Cuadrado cuad = new Cuadrado();
                                cuad.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                while (cuad.getBase() <= 0) {
                                    cuad.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                }
                                cuad.impDatos();
                                break;
                            case "b":
                            case "rectangulo":
                            case "rectángulo":
                                Rectangulo rec = new Rectangulo();
                                rec.setBase(Leer.leerFloat("Ingresa medida de la base:\t"));
                                while (rec.getBase() <= 0) {
                                    rec.setBase(Leer.leerFloat("Ingresa medida de la base:\t"));
                                }
                                rec.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                while (rec.getAltura() <= 0) {
                                    rec.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                }
                                rec.impDatos();
                                break;
                            case "c":
                            case "circulo":
                            case "círculo":
                                Circulo cir = new Circulo();
                                cir.setBase(Leer.leerFloat("Ingerse medida del radio:\t"));
                                while (cir.getBase() <= 0) {
                                    cir.setBase(Leer.leerFloat("Ingerse medida del radio:\t"));
                                }
                                cir.impDatos();
                                break;
                            case "d":
                            case "rombo":
                                Rombo rom = new Rombo();
                                rom.setDiagMa(Leer.leerFloat("Ingrese medida de la diagonal mayor:\t"));
                                while (rom.getDiagMa() <= 0 || rom.getDiagMa() <= rom.getDiagMe()) {
                                    rom.setDiagMa(Leer.leerFloat("Ingrese medida de la diagonal mayor:\t"));
                                }
                                rom.setDiagMe(Leer.leerFloat("Ingrese medida de la diagonal menor:\t"));
                                while (rom.getDiagMe() <= 0 || rom.getDiagMe() >= rom.getDiagMa()) {
                                    rom.setDiagMe(Leer.leerFloat("Ingrese medida de la diagonal menor:\t"));
                                }
                                rom.setBase(Leer.leerFloat("Ingrese medida de lados:\t"));
                                while (rom.getBase() <= 0) {
                                    rom.setBase(Leer.leerFloat("Ingrese medida de lados:\t"));
                                }
                                rom.impDatos();
                                break;
                            case "e":
                            case "trapecio":
                                Trapecio trap = new Trapecio();
                                trap.setBMay(Leer.leerFloat("Ingrese mmedida de la base mayor:\t"));
                                while (trap.getBMay() <= 0 || trap.getBMay() <= trap.getBMen()) {
                                    trap.setBMay(Leer.leerFloat("Ingrese mmedida de la base mayor:\t"));
                                }
                                trap.setBMen(Leer.leerFloat("Ingrese medida de la base menor:\t"));
                                while (trap.getBMen() <= 0 || trap.getBMen() >= trap.getBMay()) {
                                    trap.setBMen(Leer.leerFloat("Ingrese medida de la base menor:\t"));
                                }
                                trap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                while (trap.getAltura() <= 0) {
                                    trap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                }
                                trap.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                while (trap.getBase() <= 0) {
                                    trap.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                }
                                trap.impDatos();
                                break;
                            case "r":
                            case "regresar":
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no encontrada");
                                break;
                        }
                    } while (!(op.equals("r") || op.equals("regresar")));
                    break;
                case "b":
                case "3d":
                    do {
                        System.out.println("Elija una figura a calcular");
                        System.out.println("a) Cubo");
                        System.out.println("b) Esfera");
                        System.out.println("c) Prisma cuadrangular");
                        System.out.println("d) Prisma rectangular");
                        System.out.println("e) Cilindro");
                        System.out.println("f) Prisma trapezoidal");
                        System.out.println("g) Prisma romboidal");
                        System.out.println("r) Regresar");
                        op = Leer.leerString("Ingrese opción:\t").toLowerCase();
                        switch (op) {
                            case "a":
                            case "cubo":
                                Cubo cub = new Cubo();
                                cub.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                while (cub.getBase() <= 0) {
                                    cub.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                }
                                cub.impDatos();
                                break;
                            case "b":
                            case "esfera":
                                Esfera esf = new Esfera();
                                esf.setBase(Leer.leerFloat("Ingrese medida del radio:\t"));
                                while (esf.getBase() <= 0) {
                                    esf.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                }
                                esf.impDatos();
                                break;
                            case "c":
                            case "prisma cuadrangular":
                            case "cuadrangular":
                                PrismaCuadrangular prismCuad = new PrismaCuadrangular();
                                prismCuad.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                while (prismCuad.getBase() <= 0) {
                                    prismCuad.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                }
                                prismCuad.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del prisma:\t"));
                                while (prismCuad.getAlturaPrisma() <= 0) {
                                    prismCuad.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del prisma:\t"));
                                }
                                prismCuad.impDatos();
                                break;
                            case "d":
                            case "prisma rectangular":
                                PrismaRectangular prismRec = new PrismaRectangular();
                                prismRec.setBase(Leer.leerFloat("Ingrese medida de la base:\t"));
                                while (prismRec.getBase() <= 0) {
                                    prismRec.setBase(Leer.leerFloat("Ingrese medida de la base:\t"));
                                }
                                prismRec.setAltura(Leer.leerFloat("Ingrese medida de la altura:\t"));
                                while (prismRec.getAltura() <= 0) {
                                    prismRec.setAltura(Leer.leerFloat("Ingrese medida de la altura:\t"));
                                }
                                prismRec.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del prisma:\t"));
                                while (prismRec.getAlturaPrisma() <= 0) {
                                    prismRec.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del prisma:\t"));
                                }
                                prismRec.impDatos();
                                break;
                            case "e":
                            case "cilindro":
                                Cilindro cil = new Cilindro();
                                cil.setBase(Leer.leerFloat("Ingrese medida del radio:\t"));
                                while (cil.getBase() <= 0) {
                                    cil.setBase(Leer.leerFloat("Ingrese medida del radio:\t"));
                                }
                                cil.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del cilindro:\t"));
                                while (cil.getAlturaPrisma() <= 0) {
                                    cil.setAlturaPrisma(Leer.leerFloat("Ingrese medida de la altura del cilindro:\t"));
                                }
                                cil.impDatos();
                                break;
                            case "f":
                            case "prisma trapezoidal":
                                PrismaTrapezoidal prismaTrap = new PrismaTrapezoidal();
                                prismaTrap.setBMay(Leer.leerFloat("Ingrese mmedida de la base mayor:\t"));
                                while (prismaTrap.getBMay() <= 0 || prismaTrap.getBMay() <= prismaTrap.getBMen()) {
                                    prismaTrap.setBMay(Leer.leerFloat("Ingrese mmedida de la base mayor:\t"));
                                }
                                prismaTrap.setBMen(Leer.leerFloat("Ingrese medida de la base menor:\t"));
                                while (prismaTrap.getBMen() <= 0 || prismaTrap.getBMen() >= prismaTrap.getBMay()) {
                                    prismaTrap.setBMen(Leer.leerFloat("Ingrese medida de la base menor:\t"));
                                }
                                prismaTrap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                while (prismaTrap.getAltura() <= 0) {
                                    prismaTrap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                }
                                prismaTrap.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                while (prismaTrap.getBase() <= 0) {
                                    prismaTrap.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                }
                                prismaTrap.setAlturaPrisma(Leer.leerFloat("Ingresa medida de la altura del prisma:\t"));
                                while (prismaTrap.getAlturaPrisma() <= 0) {
                                    prismaTrap.setAlturaPrisma(Leer.leerFloat("Ingresa medida de la altura del prisma:\t"));
                                }
                                prismaTrap.impDatos();
                                break;
                            case "g":
                            case "prisma romboidal":
                                PrismaRomboidal prismaRom = new PrismaRomboidal();
                                prismaRom.setDiagMa(Leer.leerFloat("Ingrese medida de la diagonal mayor:\t"));
                                while (prismaRom.getDiagMa() <= 0 || prismaRom.getDiagMa() <= prismaRom.getDiagMe()) {
                                    prismaRom.setDiagMa(Leer.leerFloat("Ingrese medida de la diagonal mayor:\t"));
                                }
                                prismaRom.setDiagMe(Leer.leerFloat("Ingrese medida de la diagonal menor:\t"));
                                while (prismaRom.getDiagMe() <= 0 || prismaRom.getDiagMe() >= prismaRom.getDiagMa()) {
                                    prismaRom.setDiagMe(Leer.leerFloat("Ingrese medida de la diagonal menor:\t"));
                                }
                                prismaRom.setBase(Leer.leerFloat("Ingrese medida de lados:\t"));
                                while (prismaRom.getBase() <= 0) {
                                    prismaRom.setBase(Leer.leerFloat("Ingrese medida de lados:\t"));
                                }
                                prismaRom.setAlturaPrisma(Leer.leerFloat("Ingrese altura del prisma:\t"));
                                while (prismaRom.getAlturaPrisma() <= 0) {
                                    prismaRom.setAlturaPrisma(Leer.leerFloat("Ingrese altura del prisma:\t"));
                                }
                                prismaRom.impDatos();
                                break;
                            case "r":
                            case "regresar":
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no encontrada");
                                break;
                        }
                    } while (!(op.equals("r") || op.equals("regresar")));
                    break;
                case "c":
                    do {
                        System.out.println("a) Cono");
                        System.out.println("b) Piramide cuadrangular");
                        System.out.println("c) Piramide rectangular");
                        System.out.println("d) Piramide romboidal");
                        System.out.println("e) Piramide trapezoidal");
                        System.out.println("r) Regresar");
                        op = Leer.leerString("Ingresa opción:\t").toLowerCase();
                        switch (op) {
                            case "a":
                            case "cono":
                                Cono con = new Cono();
                                con.setBase(Leer.leerFloat("Ingresa medida del radio:\t"));
                                while (con.getBase() <= 0) {
                                    con.setBase(Leer.leerFloat("Ingresa medida del radio:\t"));
                                }
                                con.setAlturaPiramide(Leer.leerFloat("Ingresa altura de la piramide:\t"));
                                while (con.getAlturaPiramide() <= 0) {
                                    con.setAlturaPiramide(Leer.leerFloat("Ingresa altura de la piramide:\t"));
                                }
                                con.impDatos();
                                break;
                            case "b":
                            case "piramide cuadrangular":
                                PiramideCuadrangular piraCuad = new PiramideCuadrangular();
                                piraCuad.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                while (piraCuad.getBase() <= 0) {
                                    piraCuad.setBase(Leer.leerFloat("Ingresa medida de lado:\t"));
                                }
                                piraCuad.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                while (piraCuad.getAlturaPiramide() <= 0) {
                                    piraCuad.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                }
                                piraCuad.impDatos();
                                break;
                            case "c":
                            case "piramide rectangular":
                                PiramideRectangular piraRec = new PiramideRectangular();
                                piraRec.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                while (piraRec.getBase() <= 0) {
                                    piraRec.setBase(Leer.leerFloat("Ingresa medida del lado:\t"));
                                }
                                piraRec.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                while (piraRec.getAltura() <= 0) {
                                    piraRec.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                }
                                piraRec.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la piramide:\t"));
                                while (piraRec.getAlturaPiramide() <= 0) {
                                    piraRec.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la piramide:\t"));
                                }
                                piraRec.impDatos();
                                break;
                            case "d":
                            case "piramide romboidal":
                                PiramideRomboidal piraRob = new PiramideRomboidal();
                                piraRob.setDiagMa(Leer.leerFloat("Ingresa medida de la diagonal mayor:\t"));
                                while (piraRob.getDiagMa() <= 0 || piraRob.getDiagMa() <= piraRob.getDiagMe()) {
                                    piraRob.setDiagMa(Leer.leerFloat("Ingresa medida de la diagonal mayor:\t"));
                                }
                                piraRob.setDiagMe(Leer.leerFloat("Ingresa medida de la diagonal menor:\t"));
                                while (piraRob.getDiagMe() <= 0 || piraRob.getDiagMe() >= piraRob.getDiagMa()) {
                                    piraRob.setDiagMe(Leer.leerFloat("Ingresa medida de la diagonal menor:\t"));
                                }
                                piraRob.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                while (piraRob.getBase() <= 0) {
                                    piraRob.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                }
                                piraRob.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                while (piraRob.getAlturaPiramide() <= 0) {
                                    piraRob.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                }
                                piraRob.impDatos();
                                break;
                            case "e":
                            case "piramide trapezoidal":
                                PiramideTrapezoidal piraTrap = new PiramideTrapezoidal();
                                piraTrap.setBMay(Leer.leerFloat("Ingresa medida de la base mayor:\t"));
                                while (piraTrap.getBMay() <= 0 || piraTrap.getBMay() <= piraTrap.getBMen()) {
                                    piraTrap.setBMay(Leer.leerFloat("Ingresa medida de la base mayor:\t"));
                                }
                                piraTrap.setBMen(Leer.leerFloat("Ingresa madida de la base menor:\t"));
                                while (piraTrap.getBMen() <= 0 || piraTrap.getBMen() >= piraTrap.getBMay()) {
                                    piraTrap.setBMen(Leer.leerFloat("Ingresa madida de la base menor:\t"));
                                }
                                piraTrap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                while (piraTrap.getAltura() <= 0) {
                                    piraTrap.setAltura(Leer.leerFloat("Ingresa medida de la altura:\t"));
                                }
                                piraTrap.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                while (piraTrap.getBase() <= 0) {
                                    piraTrap.setBase(Leer.leerFloat("Ingrese medida del lado:\t"));
                                }
                                piraTrap.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                while (piraTrap.getAlturaPiramide() <= 0) {
                                    piraTrap.setAlturaPiramide(Leer.leerFloat("Ingresa medida de la altura de la piramide:\t"));
                                }
                                piraTrap.impDatos();
                                break;
                            case "r":
                            case "regresar":
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no encontrada");
                                break;
                        }
                    } while (!(op.equals("r") || op.equals("regresar")));
                    break;
                case "s":
                case "salir":
                    System.out.println("GRACIAS POR EJECUTAR");
                    break;
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }
        } while (!(op.equals("s") || op.equals("salir")));
    }
}

package Clase;

import Datos.Leer;

public class Alumno {

    private String nombreCompleto;
    private String noCtrl;
    private String carrera;
    private int semestre;
    float[] calif;

    public Alumno(int n) {
        calif = new float[n];
    }

    public float getMedia() {
        float prom = 0;
        for (int i = 0; i < calif.length; i++) {
            prom += calif[i];
        }
        return prom / calif.length;
    }

    public void llenarCalif() {
        for (int i = 0; i < calif.length; i++) {
            calif[i] = Leer.leerFloat("Ingrese calificación " + (i + 1) + ":\t");
        }
    }

    public String impCalif() {
        String aux = "[";
        for (int i = 0; i < calif.length; i++) {
            if (i != 0) {
                aux += "|";
            }
            aux += calif[i];
        }
        return aux +"]";
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the noCtrl
     */
    public String getNoCtrl() {
        return noCtrl;
    }

    /**
     * @param noCtrl the noCtrl to set
     */
    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}

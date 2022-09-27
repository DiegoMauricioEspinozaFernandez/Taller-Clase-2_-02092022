/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase2;

/**
 *
 * @author usuario
 */
public class Estudiante extends Persona{
    
    Carrera carrera;
    int semestreActual;
    int numeroDeCreditos;

    public Estudiante() {
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(int numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }
    
    public void proyectoGrado(int numeroDeCreditos){
        double creditosNecesarios=(carrera.getNumeroDeCreditos()*90)/100;
        
        if(numeroDeCreditos>=creditosNecesarios){
            System.out.print("Estudiante ya puedes matricular proyecto de grado");
        
        }
    
    
    }
    
}

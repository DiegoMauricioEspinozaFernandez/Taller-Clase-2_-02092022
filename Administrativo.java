/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Administrativo extends Persona{
    private int añoIngreso;

    public Administrativo() {
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    public void antiguedad(){
        int añosAntiguedad;
        int añoActual=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año actual "));
        añosAntiguedad=añoActual-añoIngreso;
        System.out.print("Años de antiguedad:"+añosAntiguedad);
        
    
    }
    
}

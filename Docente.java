/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase2;

/**
 *
 * @author usuario
 */
public class Docente extends Persona{
    
    private String profesion;
    private double salario;
    private double estatura;
    private double peso;

    public Docente() {
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void composicionCorporal(double peso, double estatura){
        
        double imc=0;
        imc=peso/(estatura*estatura);
        if(imc<18.5){System.out.print("Peso inferior al normal");}
        if(imc>=18.5&&imc<=24.9){System.out.print("Peso normal");}
        if(imc>=25.0&&imc<=29.9){System.out.print("Peso superior al normal");}
        if(imc>=30){System.out.print("obesidad");}
        
        }
    
    public void actualizarSalario(double salario){
    Docente d=new Docente();
    
    d.setSalario(salario);
    
    
    
    
    
    }
    
}

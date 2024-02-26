package edu.eci.cvds.servlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import java.util.;

@ManagedBean(name="JuegoBean")
@ApplicationScoped
public class Game{
    private int valor;
    private int intentos;
    private int premio;
    private String estado;
    private ArrayList<Integer> historial;

    public Adivinanza(){
        reiniciar();
    }
    public int getValor(){
        return valor;
    }
    public int getIntentos(){
        return intentos;
    }
    public int getPremio(){
        return premio;
    }
    public String getEstado(){
        return estado;
    }
    public ArrayList<Integer> getHistorial(){
        return historial;
    }
    public void setValor(int i){
        valor = i;
    }
    public void setIntentos(int i){
        intentos = i;
    }
    public void setPremio(int i){
        premio = i;
    }
    public void setEstado(String i){
        estado = i;
    }
    public void setHistorial(ArrayList<Integer> i){
        historial = i;
    }

    public void adivinar(int i){
        if(i == valor) {
            estado = "¡ACERTASTE!";
        }
        else{
            intentos++;
            premio-=10000;
            estado = " INTENTA CON OTRO NÚMERO";
        }
        historial.add(i);
    }

    public void reiniciar(){
        intentos = 0;
        premio = 100000;
        estado = "INGRESA UN NÚMERO";
        valor = (int)(Math.random() 100) + 1;
        historial = new ArrayList<Integer>();
    }
}

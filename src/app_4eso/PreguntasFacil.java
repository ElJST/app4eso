/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_4eso;

import java.util.Random;


/**
 *
 * @author dam126
 */
public class PreguntasFacil {
    private Random n1 = new Random();
    private Random n2 = new Random();
    private int num1 = n1.nextInt(101)+1;
    private int num2 = n1.nextInt(101)+1;
    private int sumaN1 = n1.nextInt(1000)+1;
    private int sumaN2 = n1.nextInt(1000)+1;
    private int restaN1 ;
    private int restaN2 ;
    private int divi1, divi2;
    private boolean verificar = false;

    public PreguntasFacil() {
        do{
            restaN1 = n1.nextInt(1000)+1;
            restaN2 = n1.nextInt(1000)+1;
            divi1 = n1.nextInt(500)+1;
            divi2 = n2.nextInt(100)+1;
            if (divi1 % divi2 == 0 && restaN1 > restaN2) {
                verificar = true;
            }
        }while(!verificar);
    }

    public Random getN1() {
        return n1;
    }

    public void setN1(Random n1) {
        this.n1 = n1;
    }

    public Random getN2() {
        return n2;
    }

    public void setN2(Random n2) {
        this.n2 = n2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSumaN1() {
        return sumaN1;
    }

    public void setSumaN1(int sumaN1) {
        this.sumaN1 = sumaN1;
    }

    public int getSumaN2() {
        return sumaN2;
    }

    public void setSumaN2(int sumaN2) {
        this.sumaN2 = sumaN2;
    }

    public int getRestaN1() {
        return restaN1;
    }

    public void setRestaN1(int restaN1) {
        this.restaN1 = restaN1;
    }

    public int getRestaN2() {
        return restaN2;
    }

    public void setRestaN2(int restaN2) {
        this.restaN2 = restaN2;
    }

    public int getDivi1() {
        return divi1;
    }

    public void setDivi1(int divi1) {
        this.divi1 = divi1;
    }

    public int getDivi2() {
        return divi2;
    }

    public void setDivi2(int divi2) {
        this.divi2 = divi2;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }


    

    
}

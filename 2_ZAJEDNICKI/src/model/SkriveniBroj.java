/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class SkriveniBroj implements Serializable {
 
    private int red;
    private int kolona;
    private int vrednost;

    public SkriveniBroj() {
    }

    public SkriveniBroj(int red, int kolona, int vrednost) {
        this.red = red;
        this.kolona = kolona;
        this.vrednost = vrednost;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getKolona() {
        return kolona;
    }

    public void setKolona(int kolona) {
        this.kolona = kolona;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        this.vrednost = vrednost;
    }

    @Override
    public String toString() {
        return "SkriveniBroj{" + "red=" + red + ", kolona=" + kolona + ", vrednost=" + vrednost + '}';
    }
    
    
    
}

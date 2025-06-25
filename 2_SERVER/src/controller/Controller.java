/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.SkriveniBroj;
import model.User;

/**
 *
 * @author User
 */
public class Controller {
    
    private User ulogovani = null;
    private List<User> admini = new ArrayList<>();
    private List<SkriveniBroj> brojevi = new ArrayList<>();
    
    private static Controller instance;
    public static Controller getInstance(){
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller() {
        
        User u1 = new User("Pera", "Peric", "pera@gmail.com", "123456");
        User u2 = new User("Mara", "Maric", "mara@gmail.com", "654321");
        
        admini.add(u1);
        admini.add(u2);
        
    }

    public User getUlogovani() {
        return ulogovani;
    }

    public void setUlogovani(User ulogovani) {
        this.ulogovani = ulogovani;
    }

    public List<User> getAdmini() {
        return admini;
    }

    public void setAdmini(List<User> admini) {
        this.admini = admini;
    }

    public List<SkriveniBroj> getBrojevi() {
        return brojevi;
    }

    public void setBrojevi(List<SkriveniBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public User login(String email, String lozinka) {
        for (User u : admini) {
            if (u.getEmail().equals(email) && u.getLozinka().equals(lozinka)) {
                ulogovani = u;
                return u;
            }
        }
        return null;
    }

    public boolean postoji(SkriveniBroj sb) {
        for (SkriveniBroj br : brojevi) {
            if (br.getVrednost() == sb.getVrednost()) {
                return true;
            }
        }
        return false;
    }

    public void dodajBroj(SkriveniBroj sb) {
        brojevi.add(sb);
    }

    public SkriveniBroj pogodiBroj(SkriveniBroj skriveniBroj) {
        for (SkriveniBroj broj : brojevi) {
            if (broj.getRed() == skriveniBroj.getRed() && broj.getKolona() == skriveniBroj.getKolona()) {
                return broj;
            }
        }
        return null;
    }

    
    
    
    
    
}

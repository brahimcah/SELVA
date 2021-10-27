import acm.graphics.GImage;

import java.util.Random;

public class Camell extends GImage{

    private int mida;
    //Indiquem on es troba la imatge del camell
    private static String imgPath = "../resources/camell.gif";
    String nom;

    public Camell(String nom) {
        super(imgPath);
        this.nom = nom;
        this.mida = getMida();
    }

    //Getters & Setters
    public String getNom() {
       return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMida() {
        this.setSize(90, 97);
        return mida;
    }

    public void setMida(int mida) {
        this.mida = mida;
    }

    public void mou (){
        Random r = new Random();

        int posicions = r.nextInt(15) + 1;
        this.setLocation(getX() + posicions, getY());
    }
}
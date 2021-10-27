import java.util.Random;

public class Camellfrondista extends Camell{

    public Camellfrondista(String nom) {
        super(nom);

    }

    public void mou (){

        Random r = new Random();

        int posicions = r.nextInt(10) + 6;
        this.setLocation(getX() + posicions, getY());

    }
}


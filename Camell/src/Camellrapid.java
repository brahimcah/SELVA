import java.util.Random;

public class Camellrapid extends Camell{

    public Camellrapid(String nom) {
        super(nom);

    }

    public void mou (){

        Random r = new Random();

        int posicions = r.nextInt(15) + 1;
        this.setLocation(getX() + (posicions*2), getY());

    }
}

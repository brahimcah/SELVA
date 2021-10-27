import java.util.Random;
public class Camellantisenar extends Camell{

    public Camellantisenar(String nom) {
        super(nom);

    }

    public void mou (){

        Random r = new Random();

        int posicions = r.nextInt(15) + 1;
        if(posicions%2==0) {

            this.setLocation(getX() + posicions, getY());
        }else this.setLocation(getX() + 2, getY());

    }
}
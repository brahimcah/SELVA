import java.util.Random;

public class Camellflipat extends Camell{

public Camellflipat(String nom) {
    super(nom);
}
   public void mou (){

        Random r = new Random();

        int posicions = r.nextInt(15) + 1;

        boolean sino = r.nextBoolean();
        if(sino==true) {
            this.setLocation(getX() + posicions, getY());
        }
        else{
            this.setLocation(getX() - posicions, getY());
        }
   }
}


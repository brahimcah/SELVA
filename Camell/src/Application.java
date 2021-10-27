import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import java.util.Random;
/*
UF3 Projecte Camell
Brahim Chahbouni El Kammouni
 */

public class Application extends GraphicsProgram {

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    private static final String NOMS[] = {"Camell1", "Camell2", "Camell3", "Camell4", "Camell5", "Camell6"};
    public static final int REFRESH = 50;

    //Indiquem quin volem que sigui el noste fons de pantalla
    public void Background (){


        GImage background = new GImage("../resources/pistadecamells.PNG");
        background.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        add(background);

    }

    //Funcio on es mostra el camell guanydor
    private void MostrarGuanyador(Camell camells[]) {

        int camellvencedor [] = new int [6];
        for (int i = 0; i<camells.length; i++) {
            camellvencedor[i] = (int) camells[i].getX();
        }

        int gran = 0;
        for(int i = 0; i < camellvencedor.length; i++) {
            if (camellvencedor[i] > gran) {
                gran = camellvencedor[i];
            }
        }

            if(gran==camellvencedor[0]){

                GImage guanyador = new GImage("../resources/Guanyadors/camell-1.png");
                guanyador.setSize(600, 100);
                add(guanyador);

            }
            else if(gran==camellvencedor[1]){
                GImage guanyador = new GImage("../resources/Guanyadors/camell-2.png");
                guanyador.setSize(600, 100);
                add(guanyador);

            }
            else if(gran==camellvencedor[2]){
                GImage guanyador = new GImage("../resources/Guanyadors/camell-3.png");
                guanyador.setSize(600, 100);
                add(guanyador);

            }
            else if(gran==camellvencedor[3]){
                GImage guanyador = new GImage("../resources/Guanyadors/camell-png");
                guanyador.setSize(600, 100);
                add(guanyador);
            }
            else if(gran==camellvencedor[4]){
                GImage guanyador = new GImage("../resources/Guanyadors/camell-5.png");
                guanyador.setSize(600, 100);
                add(guanyador);
            }
            else if(gran == camellvencedor[5]) {
                GImage guanyador = new GImage("../resources/Guanyadors/camell-6.png");
                guanyador.setSize(600, 100);
                add(guanyador);
            }

    }

//Funcio on diem si algu ha guanyat
    public boolean Guanya (Camell camells[]) {

        boolean vencedor = false;
        for (int i = 0; i < camells.length; i++) {
            if (camells[i].getX() >= 800)
            {
                vencedor = true;
                break;
            }
            else
            {
                vencedor = false;
            }

        }
        return vencedor;
    }


    //El run() fa la funcio de main
    public void run ()
    {
        Random r = new Random();
        Background();
        setSize (WINDOW_WIDTH, WINDOW_HEIGHT);

        Camell camells [] = new Camell[6];
        int n = 0;
        //Generem els camells
        for (int i = 0; i<camells.length; i++){

            int quincamell = r.nextInt(5)+1;

            if (quincamell==1){
                camells[i]= new Camell(NOMS[i]);
            }
            else if (quincamell==2){
                camells[i]= new Camellrapid(NOMS[i]);
            }
            else if (quincamell==3){
                camells[i]=new Camellfrondista(NOMS[i]);
            }
            else if (quincamell==4){
                camells[i]=new Camellantisenar(NOMS[i]);
            }
            else if (quincamell==5){
                camells[i]=new Camellflipat(NOMS[i]);
            }

            n += 100;
            camells[i].getMida();
            camells[i].setLocation(1,n);
            add(camells[i]);

        }

        //Fem que corrin
        do {

            for (int i = 0; i<camells.length; i++){

                camells[i].mou();
            }
            pause(REFRESH);

            if(Guanya(camells)){
                MostrarGuanyador(camells);
            }

        }while(!Guanya(camells));

    }

}
package oppgave2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Tallspill{

    public int nyttTall(){
        // metoden trekker og returner et slumtall mellom 0 og 200;
        return (int) (Math.random()* 10); // Det gir oss en verdi mellom 0 og 200.
    }
    public void visMelding(String melding){
    // Viser hva parameteren innhold i en meldingsboks.
    showMessageDialog(null,melding);
    }

    private void forLite(int tall){
    /* viser melding om at parameterens verdi er for
     lite tall og ber spilleren prøve igjen*/

         showMessageDialog(null,tall+"Det er for liten tall. prøv igjen");

     }
    private void forStort(int tall){
 /* viser melding om at parameterens verdi er for
     lite tall og ber spilleren prøve igjen*/

         showMessageDialog(null,tall+"Det er for stort tall. prøv igjen");

     }
    public void avslutteRunde(int antall, int gjetning){
        /*metoden viser melding om at det ble gjettet riktig
        og antall gjetninger som ble brukt.  */

        showMessageDialog (null,antall+" er riktig"+"Du gjettet riktig på"+
                gjetning+"forsøk");}

    public void kjøreSpill(){
 /*Metoden kjører ved å trekke et tall,
nullstiller tellevariabel, innhente gjentatte gjetning
til det gjettes riktig. Når det skjer, avsluttes runden med passe
meldinger til spilleren.*/
     int i=-1;
     int gjetning=0;
     int personGjettning=nyttTall();

   while(i!=personGjettning){
       String innTall= showInputDialog("Skriv inn tall fra 1 til 200");
       gjetning++;
       try{
       i=Integer.parseInt(innTall);}
       catch (Exception e){
           showMessageDialog(null, "feil tasta inn. prøv igjen.");
       }
       if(i==personGjettning){
           avslutteRunde(i,gjetning);}

       if (i<personGjettning){
           forLite(i);
       }
       if(i>personGjettning){
           forStort(i);

       }


   }


    }

}

public class oppgave2 {
    public static void main(String[]args){
        Tallspill en= new Tallspill();
        en.kjøreSpill();






    }
}

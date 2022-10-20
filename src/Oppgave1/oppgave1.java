package Oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave1 {
    public static void main(String []args) {
        int nedreTall = Integer.parseInt(showInputDialog("skriv tall 1:"));
        int øvreTall = Integer.parseInt(showInputDialog("skriv tall 2"));
        int sum = 0;
        int antall = 0;
        //Lager en forløkka som kjører Programmet.
        for (int i = nedreTall; i<=øvreTall; i++) {
            sum += i;
            antall++;
            System.out.print(i);
            if (i < øvreTall) {
                System.out.print(" + ");}
            if(i%10==0){
                System.out.print("\n");
            }
        }
        System.out.print(" = "+sum);

        if (nedreTall > øvreTall) {
            showMessageDialog(null, "skriv nytt Tall");

        }
    }


}







package hu.petrik.aukcioprojekt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cim;
        String festo;
        String stilus;

        List<Festmeny> festmeny= new ArrayList<>();


        Festmeny f1 = new Festmeny("Csillagos éjszaka", "Vincent van Gogh", "posztimpresszionizmus");
        Festmeny f2 = new Festmeny("Éjjeli kávézó", "Vincent van Gogh", "posztimpresszionizmus");

        festmeny.add(f1);
        festmeny.add(f2);

        Festmenyek festmenyek= new Festmenyek(festmeny);

        System.out.println("Kérlek adj meg egy darabszámot!");
        int db = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < db; i++) {
            System.out.print("Cím?");
            cim = sc.nextLine();
            System.out.print("Festő?");
            festo = sc.nextLine();
            System.out.print("Stílus?");
            stilus = sc.nextLine();

           // festmeny.add(Festmeny f3= new Festmeny(cim,festo,stilus));
        }

        /*try {
            Festnyek festmenyek2 = new Festmenyek("emberek.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Hiba,a fájl nem található.");
            ;
        }
        catch (IOException e){
            System.err.println("Ismeretlen hiba.");
        }*/




    }
}

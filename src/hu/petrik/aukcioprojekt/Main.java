package hu.petrik.aukcioprojekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cim;
        String festo;
        String stilus;

        List<Festmeny> list = new ArrayList<Festmeny>();

        Festmeny f1 = new Festmeny("Csillagos éjszaka", "Vincent van Gogh", "posztimpresszionizmus");
        Festmeny f2 = new Festmeny("Éjjeli kávézó", "Vincent van Gogh", "posztimpresszionizmus");

        list.add(f1);
        list.add(f2);

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

            list.add(f1 = new Festmeny(cim, festo, stilus));

        }


    }
}

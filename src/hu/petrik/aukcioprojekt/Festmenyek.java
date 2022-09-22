package hu.petrik.aukcioprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Festmenyek {
    private List<Festmeny> festmenyek;

    public Festmenyek(List<Festmeny> festmenyTomb) {
        this.festmenyek = new ArrayList<>();
        for (Festmeny f:festmenyTomb){
            this.festmenyek.add(f);
        }
    }

    public Festmenyek(String fajlNev) throws IOException {
        this.festmenyek= new ArrayList<>();
        FileReader fr= new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        String sor=br.readLine();
        while(sor!=null && !sor.equals("")){
            String[] adatok = sor.split(";");
            Festmeny festmeny = new Festmeny(adatok[0],adatok[1],adatok[2]);

            festmenyek.add(festmeny);
            sor= br.readLine();

        }
        fr.close();
        br.close();
    }

}

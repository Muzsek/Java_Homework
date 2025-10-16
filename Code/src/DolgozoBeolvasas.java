import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DolgozoBeolvasas
{
    public static List<Dolgozo> beolvas(String fajlnev)
    {
        List<Dolgozo> dolgozok = new ArrayList<>();

        try
        {
            List<String> sorok = Files.readAllLines(Paths.get(fajlnev));
            for (int i = 1; i < sorok.size(); i++)
            {
                String sor = sorok.get(i);
                String[] adat = sor.split(",");

                String azonosito = adat[0].trim();
                String nev = adat[1].trim();
                String beosztas = adat[2].trim();
                int munkaido = Integer.parseInt(adat[3].trim());
                int alapVoraber = Integer.parseInt(adat[4].trim());
                int tuloraPotlek = Integer.parseInt(adat[5].replaceAll("[%]","").trim());
                // Mivel a te Dolgozo osztályod több paramétert kér,
                // ideiglenesen 0-kat adunk az extra mezőkhöz
                Dolgozo d = new Dolgozo(azonosito,nev,beosztas,munkaido,alapVoraber,tuloraPotlek);
                dolgozok.add(d);
            }
        }
        catch (IOException e)
            {
            System.out.println("Hiba a fájl beolvasásakor: " + e.getMessage());
            }
        return dolgozok;
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TelephelyBeolvasas
{
    public static void beolvasTelephely(String fajlNev, List<Dolgozo> dolgozok)
    {
        try
        {
            List<String> sorok = Files.readAllLines(Paths.get(fajlNev));

            for(int i = 1;i<sorok.size();i++)
            {
                String sor = sorok.get(i);
                String[] adatok = sor.split(",");

                String napAzonosito = adatok[0].trim();
                String dolgAzonosito = adatok[1].trim();
                int ledolgozottOrak = Integer.parseInt(adatok[2].trim());

                for (Dolgozo d : dolgozok)
                {
                    if(d.getAzonosito().equals(dolgAzonosito))
                    {
                        d.setLedolgozottEloirt(d.getLedolgozottEloirt() + ledolgozottOrak);
                        d.osszeMunkaIdo += d.getMunkaido();
                    }
                }
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
} //*/
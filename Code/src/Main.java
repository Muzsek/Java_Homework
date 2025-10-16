import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Dolgozo dolgozo = new Dolgozo("2354A","Ádám",1,10,2,5);
        //System.out.println(dolgozo.toString());

        List<Dolgozo> dolgozok = DolgozoBeolvasas.beolvas("data/Workers.csv");

        for(Dolgozo d : dolgozok)
        {
            System.out.println(d);
        }
    }
}
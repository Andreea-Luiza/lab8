package ro.ase.cts;
//structura proiect

//    CEO
//    -Sef dep vanzari      -S.D. Marketing         -S.D.Dezvoltare
//    -PM1      -PM2        -PM3        -PM4        -PM5        -PM6
//  -TM1  -TM2  ................................

//    iAngajat - printDetalii() ->interfata
//    Angajat : nume,codAngajat,salariu,listaSubordonati(obiecte de tip angajat) ...constr cu para, printDetalii(),addSubordonat,deleteSubordonat

import java.util.ArrayList;
import java.util.List;

//Pasi
//1.Creare membri echipe
//2. Creare team manageri
//3. Adaugare membri in obiectele t.m.
//4. Adaugare
public class Main {

    public static void main(String args[]) {
        Angajat co1 = new Angajat("Ion Ionescu", 1, 3500, null);
        Angajat co2 = new Angajat("Ion2 Ionescu", 2, 3600, null);
        Angajat co3 = new Angajat("Ion Ionescu", 3, 3700, null);

        List<Angajat> subTM1 = new ArrayList<>();

        List<Angajat> subTM2 = new ArrayList<>();

        Angajat tm1 = new Angajat("Sef Ionescu", 4, 4500, subTM1);

        Angajat tm2 = new Angajat("Ion Ionescu", 4, 4500, subTM2);

        tm1.addAngajat(co1);
        tm1.addAngajat(co2);

        tm2.addAngajat(co3);

        tm1.printDetalii();
    }
}

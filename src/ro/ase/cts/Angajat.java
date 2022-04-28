package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat {
    public String nume;
    public int codAngajat;
    public float salariu;
    public List<Angajat> listaAngajati=new ArrayList<>();

    public Angajat(String nume, int codAngajat, float salariu, List<Angajat> listaAngajati) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.listaAngajati = listaAngajati;
    }

    public void addAngajat(Angajat a)
    {
        this.listaAngajati.add(a);
    }

    public void deleteAngajat(Angajat a)
    {
        this.listaAngajati.remove(a);
    }

    @Override
    public void printDetalii() {
        System.out.println(this.nume);
        for (Angajat a:listaAngajati
             ) {
            System.out.println(a.nume);
        }

    }
}

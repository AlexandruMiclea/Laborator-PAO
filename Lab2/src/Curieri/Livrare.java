package Curieri;

import Produse.Electrocasnic;
import Produse.Haina;

public class Livrare implements Transport {
    String numeCompanie;
    double tarifStandard;
    String adresa;
    String dataLivrare;
    Boolean confirmat = false;
    Boolean livrat = false;

    public Livrare() {}
    public Livrare(String numeCompanie_, String adresa_, String dataLivrare_, double tarifStandard_) {
        this.numeCompanie = numeCompanie_;
        this.adresa = adresa_;
        this.dataLivrare = dataLivrare_;
        this.tarifStandard = tarifStandard_;
    }

    @Override
    public double CalculeazaCostTransport(Electrocasnic electrocasnic) {
        return electrocasnic.getPret() + electrocasnic.getGreutate() * 0.05 + (1 + comision) * this.tarifStandard;
    }

    @Override
    public double CalculeazaCostTransport(Haina haina) {
        return haina.getPret() + this.tarifStandard;
    }

    @Override
    public void ConfirmaLivrare(Electrocasnic electrocasnic) {
        this.confirmat = true;
        System.out.println("Livrare confirmata pentru electrocasnic: " + electrocasnic.getDenumire() + ", cu costul de " + electrocasnic.getPret() + "!");
    }

    @Override
    public void ConfirmaLivrare(Haina haina) {
        this.confirmat = true;
        System.out.println("Livrare confirmata pentru haina: " + haina.getDenumire() + ", cu costul de " + haina.getPret() + "!");
    }

    public void Livreaza() {
        if (this.livrat) {
            System.out.println("Produsul a fost deja livrat!");
        }
        if (!this.confirmat) {
            System.out.println("Livrarea nu a fost confirmata! Te rog confirma livrarea mai intai!");
        } else {
            System.out.println("Livrarea a fost efectuata! Multumim pentru ca ati ales sa livrati cu noi");
            livrat = true;
        }
    }

    public void Livreaza(String adresaAlternativa) {
        if (this.livrat) {
            System.out.println("Produsul a fost deja livrat!");
        }
        if (!this.confirmat) {
            adresa = adresaAlternativa;
            System.out.println("Livrarea nu a fost confirmata! Totusi am modificat adresa de livrare!");
        } else {
            adresa = adresaAlternativa;
            System.out.println("Livrarea a fost efectuata catre noua adresa! Multumim pentru ca ati ales sa livrati cu noi");
            livrat = true;
        }
    }
}

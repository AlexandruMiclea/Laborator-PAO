package Produse;

abstract class Produs {
    static int numarProduse;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    String denumire;

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    double pret;
    double greutate;
    Produs(){}
    Produs(String denumire_, double pret_, double greutate_) {
        this.denumire = denumire_;
        this.pret = pret_;
        this.greutate = greutate_;
    }

    static {
        numarProduse++;
    }
}

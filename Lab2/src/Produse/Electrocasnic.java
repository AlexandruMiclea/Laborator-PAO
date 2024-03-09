package Produse;

public class Electrocasnic extends Produs{
    double putereConsumata;
    String brand;

    public double getPutereConsumata() {
        return putereConsumata;
    }

    public void setPutereConsumata(double putereConsumata) {
        this.putereConsumata = putereConsumata;
    }

    public Electrocasnic() {};
    public Electrocasnic(String denumire_, double pret_, double greutate_, double putereConsumata_, String brand_){
        this.denumire = denumire_;
        this.pret = pret_;
        this.greutate = greutate_;
        this.brand = brand_;
        this.putereConsumata = putereConsumata_;
    }
}

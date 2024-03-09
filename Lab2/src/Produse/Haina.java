package Produse;

public class Haina extends Produs{
    String marime;
    String material;

    public Haina() {};
    public Haina(String denumire_, double pret_, double greutate_, String marime_, String material_){
        this.denumire = denumire_;
        this.pret = pret_;
        this.greutate = greutate_;
        this.marime = marime_;
        this.material = material_;
    }
}

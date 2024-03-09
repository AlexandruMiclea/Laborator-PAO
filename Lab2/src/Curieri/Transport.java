package Curieri;

import Produse.Electrocasnic;
import Produse.Haina;

public interface Transport {
    static final double comision = 0.09;
    public double CalculeazaCostTransport(Electrocasnic electrocasnic);
    public double CalculeazaCostTransport(Haina haina);
    public void ConfirmaLivrare(Haina haina);
    public void ConfirmaLivrare(Electrocasnic electrocasnic);
}

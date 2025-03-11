package org.example;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double Kilometraje;
    private String estado;
    private String placa;


    public Auto() {

    }

    public Auto(String marca, String modelo, int anio, double kilometraje, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        Kilometraje = kilometraje;
        this.estado = estado;
        this.placa  = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    //Metodos

    public void mostrarDetalle(){
        System.out. println("Marca "+ marca);
        System.out.println("Modelo"+ modelo);
        System.out.println("año"+anio);
        System.out.println("Kilometraje"+ Kilometraje);
        System.out.println("Estado"+estado);

    }

    public void actualizarKilometraje(double Nukilometraje){
        if (Nukilometraje> this.Kilometraje){
            this.Kilometraje = Nukilometraje;
        }


    }

    public boolean esAntiguo() {
        return (2025 - anio) > 15;
    }


    public boolean necesitaMantenimiento() {
        return Kilometraje > 100000;
    }


    public double calcularCombustible(double distancia, double consumoPorKm) {
        return distancia * consumoPorKm;
    }


    public double combustibleRestante(double capacidadTanque, double distancia, double consumoKm) {
        double usado = calcularCombustible(distancia, consumoKm);
        return Math.max(0, capacidadTanque - usado);
    }


    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + Kilometraje+
                ", estado='" + estado + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}

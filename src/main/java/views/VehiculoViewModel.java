package views;

import domain.*;

public class VehiculoViewModel {
    private String patente;
    private String marca;  // Nuevo: para guardar el nombre de la marca
    private String modelo; // Nuevo: para guardar el modelo por separado
    private String vehiculo;
    private String tipo;
    private String sucursal;
    private String pais;
    private double capacidadCarga;
    private double kmPorLitro;
    private double kwhBase;
    private int anio;
    private double litrosExtra;
    private double kmARecorrer;
    
    public VehiculoViewModel(Vehiculo vehiculo){
        if(vehiculo == null)return;
        patente = vehiculo.getPatente();
        this.vehiculo = vehiculo.toString();
        
        // Obtenemos el nombre desde el nuevo objeto Marca
        this.marca = vehiculo.getMarca().getNombre(); 
        this.modelo = vehiculo.getModelo();
        this.pais = vehiculo.getMarca().getPais();
        
        tipo = vehiculo.getTipo().name();
        sucursal = vehiculo.getCodigoSucursal();
        capacidadCarga = vehiculo.getCapacidadCarga();
        anio = vehiculo.getAnio();
        if (vehiculo instanceof VehiculoCombustible) {
           kmPorLitro = ((VehiculoCombustible) vehiculo).getKilometrosPorLitro();
           } else {
            kmPorLitro = ((VehiculoElectrico) vehiculo).getKwhBase();
           }
        litrosExtra = vehiculo instanceof VehiculoCombustible ? ((VehiculoCombustible)vehiculo).getLitrosExtra() : 0;
        kmARecorrer = 100;
    }

    public String getPatente() {
        return patente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public int getAnio() {
        return anio;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    public double getKmARecorrer() {
        return kmARecorrer;
    }

    public String getSucursal() {
        return sucursal;
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
    
    public String getPais() {
        return pais;
    }
      
}

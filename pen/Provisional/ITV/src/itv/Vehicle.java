package itv;

import enums.TipusVehicle;
import java.util.regex.Pattern;

public class Vehicle {

    private String matricula;
    private String modelo;
    private TipusVehicle tipusVehicle;
    

    public Vehicle(String matricula, String modelo, TipusVehicle tipusVehicle) {
        assert Pattern.matches("\\d{4}[A-Z]{3}",matricula);
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipusVehicle = tipusVehicle;
    }
}

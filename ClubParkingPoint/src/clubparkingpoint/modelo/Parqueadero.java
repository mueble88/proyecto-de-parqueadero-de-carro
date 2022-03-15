/*

 */
package clubparkingpoint.modelo;

public class Parqueadero {

    private int idParqueadero;
    private String nombreParqueadero;
    private String telefono;
    private String direccion;
    private String cantidadPuesto;
    private String cuposDisponibles;

    public Parqueadero() {
    }

    public Parqueadero(int idParqueadero, String nombreParqueadero, String telefono, String direccion, String cantidadPuesto, String cuposDisponibles) {
        this.idParqueadero = idParqueadero;
        this.nombreParqueadero = nombreParqueadero;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cantidadPuesto = cantidadPuesto;
        this.cuposDisponibles = cuposDisponibles;
    }

    public int getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(int idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCantidadPuesto() {
        return cantidadPuesto;
    }

    public void setCantidadPuesto(String cantidadPuesto) {
        this.cantidadPuesto = cantidadPuesto;
    }

    public String getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(String cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

 
   
}

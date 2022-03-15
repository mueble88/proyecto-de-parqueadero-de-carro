/* 
consulta de parqueadero
*/

package clubparkingpoint.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaParqueadero extends ModeloBD{
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;

   public boolean registrarParqueadero(Parqueadero parqueadero)
   {       
        Connection conexion=conectarBD();
        
        String query="INSERT INTO parquedero(nom_park,telefono,direccion,cantidadPuesto,cuposdisponible)"
                + "VALUES (?,?,?,?,?,?)";
        
        try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,parqueadero.getNombreParqueadero());
            consultaSQL.setString(2,parqueadero.getTelefono());
            consultaSQL.setString(3,parqueadero.getDireccion());
            consultaSQL.setString(4,parqueadero.getCantidadPuesto());
            consultaSQL.setString(5,parqueadero.getCuposDisponibles());

            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            if(resultado>0){
              return true;  
            }else{
               return false; 
            }            
        }
        catch(Exception error)
        {
            System.out.println("upsss... "+error);
            return false;
        }
   }
   
   
    public Parqueadero buscarParqueadero (int IDParqueadero) {      
        Connection conexion=conectarBD();
        String query="SELECT * from parqueadero where IDParqueadero=?";
        
        try{
            
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setInt(1,IDParqueadero);
            
            //Ejecuto la consulta
            resultadoSQL=consultaSQL.executeQuery();
            
            //Orgaizo el resultado
            Parqueadero parqueadero= new Parqueadero();
            if(resultadoSQL.next()){
                
                parqueadero.setIdParqueadero(resultadoSQL.getInt("id_park "));
                parqueadero.setNombreParqueadero(resultadoSQL.getString("nom_park"));
                parqueadero.setTelefono(resultadoSQL.getString("telefono"));
                parqueadero.setDireccion(resultadoSQL.getString("direccion"));
                parqueadero.setCantidadPuesto(resultadoSQL.getString("cantidadPuesto"));
                parqueadero.setCuposDisponibles(resultadoSQL.getString("cuposdisponible"));
                
                return parqueadero;                
            }else{
                return null;
            }   
        }
        catch(Exception error)
        {
            System.out.println("upsss... "+error);
            return null;
        }
    }
}

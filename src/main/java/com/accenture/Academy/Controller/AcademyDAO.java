package com.accenture.Academy.Controller;
import com.accenture.Academy.Conexion;
import com.accenture.Academy.Repository.Academic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcademyDAO {

    public static void crearStudentDB(Academic academic){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection())  {
            PreparedStatement  ps=null;
            try{
                String query="INSERT INTO mensajes ( name, last_name) VALUES (?,?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, academic.getName());
                ps.setString(2, academic.getLastName());
                ps.executeUpdate();
                System.out.println("Student register");

            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void leerStudentDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement  ps=null;
        ResultSet rs = null;
        try(Connection conexion = db_connect.get_connection()) {
            String query = "select * from student";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_student"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Phone: "+ rs.getString("last_name"));
                System.out.println("resume: "+ rs.getString("resume"));
                System.out.println("");
            }
        }catch(SQLException ex){
            System.out.println("No se pudieron recuperar los estudiantes");
            System.out.println(ex);
        }
    }

    public static void actualizarStudentDB(Academic academic){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement  ps=null;
            try{
                String query = "UPDATE mensajes set mensaje = ? WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setString(1, academic.getName());
                ps.setString(2, academic.getLastName());
                ps.executeUpdate();
                System.out.println("El mensaje se actualizo correctamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo actualizar el mensaje");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public static void borrarStudentDB(int id_student){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement  ps=null;
            String query = "DELETE FROM mensajes WHERE id_student = ?";
            ps=conexion.prepareStatement(query);
            ps.setInt(1,id_student);
            ps.execute();
            System.out.println("El estudiante ha sido borrado");

        }catch(SQLException ex){
            System.out.println("No se pudo borrar el estudiante");
            System.out.println(ex);
        }
    }

}

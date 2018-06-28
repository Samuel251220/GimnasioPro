/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimp;

import Util.Conexion;
import dao.UsuarioDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class UsuarioDaoImp implements UsuarioDao{
    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;

    @Override
    public HashMap<String, Object> validar(String x, String y) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call validarUser(?,?)}");
            cst.setString(1, x);
            cst.setString(2, y);
            rs = cst.executeQuery();
            while(rs.next()){                
                map.put("idu", rs.getInt(3));
                map.put("nick", rs.getString(4));
                map.put("nom", rs.getString(1));
                map.put("apell", rs.getString(2));
                map.put("tipo", rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return map;
    }
    
}

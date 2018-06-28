/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author asus
 */
public class Usuario {
    private int idUsu;
    private String nick;
    private String contraseña;
    private String email;
    private int idPersona;
    private int  idTipo;

    public Usuario() {
    }

    public Usuario(String nick, String contraseña, String email, int idPersona, int idTipo) {
        this.nick = nick;
        this.contraseña = contraseña;
        this.email = email;
        this.idPersona = idPersona;
        this.idTipo = idTipo;
    }

    public Usuario(int idUsu, String nick, String contraseña, String email, int idPersona, int idTipo) {
        this.idUsu = idUsu;
        this.nick = nick;
        this.contraseña = contraseña;
        this.email = email;
        this.idPersona = idPersona;
        this.idTipo = idTipo;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    
    
    
    
}

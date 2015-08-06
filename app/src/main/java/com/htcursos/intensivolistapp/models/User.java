package com.htcursos.intensivolistapp.models;

/**
 * Created by Virmerson on 29/07/15.
 */
public class User {

    public long id;
    public String name;
    public int imagem; //Id R da imagem

    public User(long id, String name, int imagem) {
        this.id = id;
        this.name = name;
        this.imagem = imagem;
    }

    public  User(){

    }
}

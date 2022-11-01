package project2002;

import java.util.*;
import project2002.master;

public class Cineplexes { 
	
	private String nameCineplex; //name of cineplex
    
    private int idCineplex; //cineplex ID
    
    private ArrayList<Cinema> listCinemas; //list of cinemas in each cineplex

    public Cineplexes(String nameCineplex, int idCineplex) { //constructor for the class
        this.nameCineplex = nameCineplex; //name of cineplex
        this.idCineplex = idCineplex; //ID of cinema in a cineplex
        this.listCinemas = new ArrayList<Cinema>();
    }

    public Cineplexes(String nameCineplex, int idCineplex, ArrayList<Cinema> listCinemas) {
        this.nameCineplex = nameCineplex; //name of cineplex
        this.idCineplex = idCineplex; //ID of cinema in cineplex
        this.listCinemas = listCinemas; //array of all the cinemas in a cineplex
    }

  
    public String getNameCineplex() { //obtain name of cineplex
        return nameCineplex;
    }
    
    public void setNameCineplex(String nameCineplex) { //create name of cineplex 
        this.nameCineplex = nameCineplex; 
    }

    public int getIDCineplex() { //obtain id of cineplex
        return idCineplex;
    }
    
  
    public ArrayList<Cinema> getListCinemas() { //get list of cinemas in cineplex
        return listCinemas;
    }
    
 
    public void addCinema(Cinema cinema) {
    	listCinemas.add(cinema); //add cinema to cineplex
    }

}
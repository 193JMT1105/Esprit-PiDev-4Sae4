package tn.esprit.spring.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javassist.SerialVersionUID;

@Entity

public class ad implements Serializable{
	private final static long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AdID;
	private double price;
	private String Location;
	private int nbRoom;
	private int nbBath;
	private int terrace;
	private String description;
	private boolean pool;
	private boolean elevator;
	private boolean airConditioner;
    private boolean furnished;
	private boolean parcking;
	private boolean state;
	private Date date;
	@Enumerated(EnumType.STRING)
	private AdType type;
	
	
	public int getAdID() {
		return AdID;
	}



	public void setAdID(int adID) {
		AdID = adID;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}



	public int getNbRoom() {
		return nbRoom;
	}



	public void setNbRoom(int nbRoom) {
		this.nbRoom = nbRoom;
	}



	public int getNbBath() {
		return nbBath;
	}



	public void setNbBath(int nbBath) {
		this.nbBath = nbBath;
	}



	public int getTerrace() {
		return terrace;
	}



	public void setTerrace(int terrace) {
		this.terrace = terrace;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public boolean isPool() {
		return pool;
	}



	public void setPool(boolean pool) {
		this.pool = pool;
	}



	public boolean isElevator() {
		return elevator;
	}



	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}



	public boolean isAirConditioner() {
		return airConditioner;
	}



	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}



	public boolean isFurnished() {
		return furnished;
	}



	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}



	public boolean isParcking() {
		return parcking;
	}



	public void setParcking(boolean parcking) {
		this.parcking = parcking;
	}



	public boolean isState() {
		return state;
	}



	public void setState(boolean state) {
		this.state = state;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public ad(double p, String location,String desc,Date d,int nbR,int nbB,int terrace,boolean pool,boolean elevator,boolean airC,boolean funished,boolean parcking,boolean s)
	{
		
	}



	public ad(int adID, double price, String location, int nbRoom, int nbBath, int terrace, String description,
			boolean pool, boolean elevator, boolean airConditioner, boolean furnished, boolean parcking, boolean state,
			Date date) {
		super();
		AdID = adID;
		this.price = price;
		Location = location;
		this.nbRoom = nbRoom;
		this.nbBath = nbBath;
		this.terrace = terrace;
		this.description = description;
		this.pool = pool;
		this.elevator = elevator;
		this.airConditioner = airConditioner;
		this.furnished = furnished;
		this.parcking = parcking;
		this.state = state;
		this.date = date;
	}
	
	
	
}
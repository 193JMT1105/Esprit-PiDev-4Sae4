package tn.esprit.spring.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javassist.SerialVersionUID;
@Entity

public class ad implements Serializable{
	private final static long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AdID;
	private double price;
	private double surface;
	private String Location;
	private int nbRoom;
	private int nbBath;
	private int terrace;
	private String description;
	private boolean pool;
	private boolean elevator;
	private int airConditioner;
    private boolean furnished;
	private boolean parcking;
	private Date date;
	private String image;
	@Enumerated(EnumType.STRING)
	private AdType type;
	@Enumerated(EnumType.STRING)
	private AdState state;
	
	@ManyToOne
	private User user;
	public int getAdID() {
		return AdID;
	}


	public double getSurface() {
		return price;
	}



	public void setSurface(double s) {
		this.price = s;
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



	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
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



	public int isAirConditioner() {
		return airConditioner;
	}



	public void setAirConditioner(int airConditioner) {
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



	


	public AdState getState() {
		return state;
	}


	public void setState(AdState state) {
		this.state = state;
	}


	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	

	



	


	public ad(int adID, double price, double surface, String location, int nbRoom, int nbBath, int terrace,
			String description, boolean pool, boolean elevator, int airConditioner, boolean furnished, boolean parcking,
			Date date, AdType type, AdState state, User user) {
		super();
		AdID = adID;
		this.price = price;
		this.surface = surface;
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
		this.date = date;
		this.type = type;
		this.state = state;
		this.user = user;
	}


	public ad() {
		super();
	}



	@Override
	public String toString() {
		return "ad [AdID=" + AdID + ", price=" + price + ", Location=" + Location + ", nbRoom=" + nbRoom + ", nbBath="
				+ nbBath + ", terrace=" + terrace + ", description=" + description + ", pool=" + pool + ", elevator="
				+ elevator + ", airConditioner=" + airConditioner + ", furnished=" + furnished + ", parcking="
				+ parcking + ", state=" + state + ", date=" + date + ", type=" + type + "]";
	}
	
	
	
	
	
}

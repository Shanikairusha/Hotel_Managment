/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

/**
 *
 * @author SHA
 */
public class RoomMap {
    private String RoomID;;
    private String RoomType;
    private Double Rates;
    private int availability;

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getRoomID() {
        return RoomID;
    }

    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public Double getRates() {
        return Rates;
    }

    public void setRates(Double Rates) {
        this.Rates = Rates;
    }

    public RoomMap(String RoomID, String RoomType, Double Rates, int availability) {
        this.RoomID = RoomID;
        this.RoomType = RoomType;
        this.Rates = Rates;
        this.availability = availability;
    }

    public RoomMap(String RoomID, String RoomType, Double Rates) {
        this.RoomID = RoomID;
        this.RoomType = RoomType;
        this.Rates = Rates;
    }
    
}

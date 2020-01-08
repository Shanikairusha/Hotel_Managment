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
public class Room {
    private String RoomID;
    private String ResID;

    public String getRoomID() {
        return RoomID;
    }

    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    public String getResID() {
        return ResID;
    }

    public void setResID(String ResID) {
        this.ResID = ResID;
    }

    public Room(String RoomID, String ResID) {
        this.RoomID = RoomID;
        this.ResID = ResID;
    }
    
    
}

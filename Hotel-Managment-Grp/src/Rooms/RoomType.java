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
public class RoomType {
    private String RoomType;
    private String Details;
    

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

   

    public RoomType(String RoomType, String Details) {
        this.RoomType = RoomType;
        this.Details = Details;
       
    }
    
    
}

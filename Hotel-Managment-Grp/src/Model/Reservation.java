/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.Addreservationtodb;

/**
 *
 * @author Darkness
 */
public class Reservation {
   private String u_id, reserve_type;
   private String g_name,g_address,g_nic,booked_date,g_email;
   private int g_mobileNum ;
   private String r_id, check_in,check_out,r_roomtype,reserve_date;
   private int r_adults,r_children,r_numofroom,r_numofpeople,r_numoftable;

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getReserve_type() {
        return reserve_type;
    }

    public void setReserve_type(String reserve_type) {
        this.reserve_type = reserve_type;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_address() {
        return g_address;
    }

    public void setG_address(String g_address) {
        this.g_address = g_address;
    }

    public String getG_nic() {
        return g_nic;
    }

    public void setG_nic(String g_nic) {
        this.g_nic = g_nic;
    }

    public String getBooked_date() {
        return booked_date;
    }

    public void setBooked_date(String booked_date) {
        this.booked_date = booked_date;
    }

    public String getG_email() {
        return g_email;
    }

    public void setG_email(String g_email) {
        this.g_email = g_email;
    }

    public int getG_mobileNum() {
        return g_mobileNum;
    }

    public void setG_mobileNum(int g_mobileNum) {
        this.g_mobileNum = g_mobileNum;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public String getR_roomtype() {
        return r_roomtype;
    }

    public void setR_roomtype(String r_roomtype) {
        this.r_roomtype = r_roomtype;
    }

    public String getReserve_date() {
        return reserve_date;
    }

    public void setReserve_date(String reserve_date) {
        this.reserve_date = reserve_date;
    }

    public int getR_adults() {
        return r_adults;
    }

    public void setR_adults(int r_adults) {
        this.r_adults = r_adults;
    }

    public int getR_children() {
        return r_children;
    }

    public void setR_children(int r_children) {
        this.r_children = r_children;
    }

    public int getR_numofroom() {
        return r_numofroom;
    }

    public void setR_numofroom(int r_numofroom) {
        this.r_numofroom = r_numofroom;
    }

    public int getR_numofpeople() {
        return r_numofpeople;
    }

    public void setR_numofpeople(int r_numofpeople) {
        this.r_numofpeople = r_numofpeople;
    }

    public int getR_numoftable() {
        return r_numoftable;
    }

    public void setR_numoftable(int r_numoftable) {
        this.r_numoftable = r_numoftable;
    }

    public boolean addtodb(Reservation x){
        Addreservationtodb add = new Addreservationtodb();
       
        boolean y = add.add(x);
        
        return y;
    }
    
    public void print(){
        System.out.println(getG_name());
        System.out.println(getBooked_date());
        System.out.println(getG_address());
        System.out.println(getG_email());
        System.out.println(getG_mobileNum());
        System.out.println(getG_nic());
        
      /*  System.out.println(getCheck_in());
        System.out.println(getCheck_out());
        System.out.println(getR_adults());
        System.out.println(getR_children());
        System.out.println(getR_roomtype());
        System.out.println(getR_numofroom());
        */
      /*  System.out.println(getReserve_date());
        System.out.println(getR_numofpeople());
        System.out.println(getR_numoftable());
        */
    }
    
}

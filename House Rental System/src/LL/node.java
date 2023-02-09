/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LL;

public class node {
String addressf, cityf, provincef, countryf, ownerNamef, Kitchenf=" ", Parkingf = " ", Internetf = " ", Laundryf = " ", PropertyNamef;
int roomsf, restRoomsf;
int rentf;
node next;
public String a="";
String From, To, PropName, bkID, rent, name, cnic;
node(String From, String To, String PropName, String bkID, String rent, String name, String cnic){
    this.From = From;
    this.To = To;
    this.PropName = PropName;
    this.bkID = bkID;
    this.rent  = rent;
    this.name = name;
    this.cnic = cnic;
    a = bkID+","+PropName+","+From+","+To+","+rent+","+name+","+cnic+"\n";
    this.next = null;
}

node(String PropertyNamef,String addressf, String cityf, String provincef, String countryf, String ownerNamef, String Kitchenf, String Parkingf, String Internetf, String Laundryf, int roomsf, int restRoomsf, int rentf){
    this.Kitchenf = Kitchenf;
    this.Parkingf = Parkingf;
    this.addressf = addressf;
    this.cityf = cityf;
    this.provincef = provincef;
    this.countryf = countryf;
    this.ownerNamef = ownerNamef;
    this.Internetf = Internetf;
    this.Laundryf = Laundryf;
    this.PropertyNamef = PropertyNamef;
    this.roomsf = roomsf;
    this.restRoomsf = restRoomsf;
    this.rentf = rentf;
    a= PropertyNamef +","+ addressf +","+ cityf +","+ provincef +","+ countryf +","+ ownerNamef +","+ Kitchenf +","+Parkingf +","+ Internetf +"," + Laundryf +","+ roomsf +","+ restRoomsf +","+ rentf;
    this.next=null;
}
}



package LL;

public class LinkedList {
public node top;
public LinkedList()
{
 top=null;
}
public void addfirst(String PropertyNamef,String addressf, String cityf, String provincef, String countryf, String ownerNamef, String Kitchenf, String Parkingf, String Internetf, String Laundryf, int roomsf, int restRoomsf, int rentf)
{ 
  node newnode=new node( PropertyNamef, addressf, cityf, provincef, countryf, ownerNamef, Kitchenf,Parkingf, Internetf, Laundryf , roomsf, restRoomsf, rentf);
  newnode.next=top;
  top=newnode;
}

public void addViewfirst( String bkID, String PropName,String From, String To, String rent, String name, String cnic )
{

    node newnode=new node(bkID,PropName,From,To,rent,name,cnic);
    newnode.next=top;
    top=newnode;
}

public void display()
{
    node temp=top;
    while(temp!=null)
    {
        System.out.println(temp.a);
        temp=temp.next;
    }
}
}
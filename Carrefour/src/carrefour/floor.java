/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haider
 */
public class floor {
    private List <Shops> groundFloor = new ArrayList<Shops>();
    private List <Shops> Floor1 = new ArrayList<Shops>();
    private List <Shops> Floor2 = new ArrayList<Shops>();
    private List <Shops> Floor3 = new ArrayList<Shops>();
    
    
    /**
     * making the floor Class Singleton
     */
    private floor(){}
    static floor f = null;
    public static floor getInstance() {
        if (f == null) {
            f = new floor();
            return f;

        }
        return f;

    }

    public List<Shops> getGroundFloor() {
        return groundFloor;
    }

    public List<Shops> getFloor1() {
        return Floor1;
    }

    public List<Shops> getFloor2() {
        return Floor2;
    }

    public List<Shops> getFloor3() {
        return Floor3;
    }
    
    //Methods
    
    public boolean addShop(Shops s)
    {
        if(s.getFloorNumber().equals( "1"))
        {
            Floor1.add(s);
            return true;
        }
        else if(s.getFloorNumber().equals( "2"))
        {
            Floor2.add(s);
            return true;
        }
        else if(s.getFloorNumber().equals( "3"))
        {
            Floor3.add(s);
            return true;
        }
        else if(s.getFloorNumber().equals( "0"))
        {
            groundFloor.add(s);
            return true;
        }
            
        return false;
    
    }

    public boolean deleteShop(Shops s)
    {
        int index = getIndex(s);
        if(index != -1)
        {
            if(s.getFloorNumber().equals( "1"))
            {
            Floor1.remove(index);
            return true;

            }
            else if(s.getFloorNumber().equals( "2"))
            {
            Floor2.remove(index);
            return true;
           
            }
            else if(s.getFloorNumber().equals( "3"))
            {
            Floor3.remove(index);
            return true;
            }
            else if(s.getFloorNumber().equals( "0"))
            {
            groundFloor.remove(index);
            return true;
            }
        
        }
            
        return false;
        
    }
    public boolean updateShop(Shops s)
    {
        int index = getIndex(s);
        
        if (index != -1)
        {
        if(s.getFloorNumber().equals("1"))
        {
            Floor1.set(index, s);
            return true;

        }
        else if(s.getFloorNumber().equals( "2"))
        {
            Floor2.set(index, s);
            return true;
           
        }
        else if(s.getFloorNumber().equals( "3"))
        {
            Floor3.set(index, s);
            return true;
        }
        else if(s.getFloorNumber().equals( "0"))
        {
            groundFloor.set(index, s);
            return true;
        }
        }
        return false;
    }
    
    public int getIndex(Shops s)
    {
        if(s.getFloorNumber().equals( "1"))
        {
            for (int i = 0; i < Floor1.size(); i++) {
                if (s.getShopId().equals(Floor1.get(i).getShopId())) {
                    
                    return i;
                }
            }
        }
        else if(s.getFloorNumber().equals( "2"))
        {
            for (int i = 0; i < Floor2.size(); i++) {
                if (s.getShopId().equals(Floor2.get(i).getShopId())) {
                    
                    return i;
                }
            }
        }
        else if(s.getFloorNumber().equals("3"))
        {
            for (int i = 0; i < Floor3.size(); i++) {
                if (s.getShopId().equals(Floor3.get(i).getShopId())) {
                    return i;
                }
            }
        }
        else if(s.getFloorNumber().equals("0"))
        {
            for (int i = 0; i < groundFloor.size(); i++) {
                if (s.getShopId().equals(groundFloor.get(i).getShopId())) {
                    return i;
                }
            }
        }
            
        
        return -1;
    }
    public Shops getShop(String id)
    {
        Shops s = new Shops("01","1","25ft sq.","Luxury",10000,2);
        s.setShopName("NabeelShop");
        
        Floor1.add(s);
        
        for (int i = 0; i < groundFloor.size(); i++) {

            if (groundFloor.get(i).getShopId().equals(id)) {
                return groundFloor.get(i);
            }
        }
        for (int i = 0; i < Floor1.size(); i++) {

            if (Floor1.get(i).getShopId().equals(id)) {
                return Floor1.get(i);
            }
        }
        for (int i = 0; i < Floor2.size(); i++) {
            if (Floor2.get(i).getShopId().equals(id)) {
                return Floor2.get(i);
            }
        }
        for (int i = 0; i < Floor3.size(); i++) {
            if (Floor3.get(i).getShopId().equals(id)) {
                return Floor3.get(i);
            }
        }

        return null;
    }
    
    public List<Shops> availAbleShops()
    {
        List<Shops> available = new ArrayList<>();
        for (Shops shops : groundFloor) {
            if (shops.isAvailableStatus()) {
                available.add(shops);
                
            }
            
        }
        for (Shops shops : Floor1) {
            if (shops.isAvailableStatus()) {
                available.add(shops);
                
            }
            
        }
        for (Shops shops : Floor2) {
            if (shops.isAvailableStatus()) {
                available.add(shops);
                
            }
            
        }
        for (Shops shops : Floor3) {
            if (shops.isAvailableStatus()) {
                available.add(shops);
                
            }
            
        }
        
        return available;
    }
    
    
    public boolean saveShops() throws IOException
    {
        boolean flag = false;
        FileWriter save = new FileWriter("Database\\AvailableShops\\AvailableShops.txt");
        for (Shops shops : groundFloor) {
            if (shops.isAvailableStatus()) {
                
                save.write(shops.getShopName() + ",");
                save.write(shops.getShopId() + ",");
                save.write(shops.getArea() + ",");
                save.write(shops.getShopType() + ",");
                save.write(shops.getFloorNumber() + ",");
                save.write(shops.getShopNumber() + ",");
                save.write(shops.getShopRent() + ",");
                save.write(shops.getTax() + ",");
                save.write(shops.isAvailableStatus() + ",");
                save.write(shops.isUsingStatus() + "\n");
                flag = true;
                
            }
        }
        save.flush();
        save.close();
        
        return flag;
    }
    
    
     
}

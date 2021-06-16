/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrefour;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haider
 */
public class floor {
     
    private List <Shops> Floor1 = new ArrayList<Shops>();
    private List <Shops> Floor2 = new ArrayList<Shops>();
    private List <Shops> Floor3 = new ArrayList<Shops>();
    
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
            
        return false;
    
    }

    public boolean deleteShop(Shops s)
    {
        if(s.getFloorNumber().equals( "1"))
        {
            Floor1.remove(getIndex(s));
            return true;

        }
        else if(s.getFloorNumber().equals( "2"))
        {
            Floor2.remove(getIndex(s));
            return true;
           
        }
        else if(s.getFloorNumber().equals( "3"))
        {
            Floor3.remove(getIndex(s));
            return true;
        }
            
        return false;
        
    }
    public boolean updateShop(Shops s)
    {
        if(s.getFloorNumber().equals("1"))
        {
            Floor1.set(getIndex(s), s);
            return true;

        }
        else if(s.getFloorNumber().equals( "2"))
        {
            Floor2.set(getIndex(s), s);
            return true;
           
        }
        else if(s.getFloorNumber().equals( "3"))
        {
            Floor3.set(getIndex(s), s);
            return true;
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
            
        
        return -1;
    }
    
    
     
}

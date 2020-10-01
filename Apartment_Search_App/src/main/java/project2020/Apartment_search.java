package project2020;
import java.awt.List;
import java.util.ArrayList;

public class Apartment_search {
	
	
	

private ArrayList<Apartment> all =new ArrayList<Apartment> () ;
  private ArrayList<Apartment> result=new ArrayList<Apartment> () ;
  
  
  public ArrayList<Apartment> getAll() {
		return all;
	}
	public void setAll(ArrayList<Apartment> all) {
		this.all = all;
	}
	public void setApartment(String [] st) {
		Apartment  c =new Apartment();
		c.setType(st[0]);
		c.setMaterial(st[1]);
		c.setPlacement(st[2]);
		c.setAllow_Pets(st[3]!="NO");
		c.setAmenities(st[4]);
		c.setPrice(Integer.valueOf(st[5]));
		c.setArea(Integer.valueOf(st[6]));
		c.setBedrooms(Integer.valueOf(st[7]));
		c.setBathrooms(Integer.valueOf(st[8]));
		c.setLease_Length(st[9]);
		all.add(c);
		
	}
	public ArrayList<Apartment> getResult() {
		return result;
	}
	public void setResult(ArrayList<Apartment> result) {
		this.result = result;
	}

  
  public Apartment_search() {
		super();
  }
  public Apartment_search(ArrayList<Apartment> all, ArrayList<Apartment> result) {
	super();
	this.all = all;
	this.result = result;
}
 
public ArrayList<Apartment> searchByPlacement(String pla) {
	  result.clear();
	  
	  for(Apartment x:all)
	  {
		  
		  if(x.getPlacement().equals(pla))
			  result.add(x);
	  }
	  return result;
  }
public ArrayList<Apartment> searchByMaterial(String Mat) {
	 result.clear();
	  for(Apartment x:all)
	  {
		  if(x.getMaterial().equals(Mat))
			  result.add(x);
	  }
	  return result;
  }
public ArrayList<Apartment> searchByprice(int price) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getPrice()==price)
			  result.add(x);
	  }
	  return result;
	 
}
public ArrayList<Apartment> searchByRangeOfPrices(int price1,int price2) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(between(x.getPrice(),price1,price2))
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchByArea(int Area) {
	
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getArea()==Area)
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchByRangeOfAreas(int Area1,int Area2) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(between(x.getArea(),Area1,Area2))
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchBybedrooms(int numd) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getBathrooms()==numd)
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchBybathrooms(int numt) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getBathrooms()==numt)
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchByAllow_Pets(Boolean  Ame) {
	 result.clear();
	 for(Apartment x:all) {
		  if(x.isAllow_Pets())
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchByType(String Type) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getType().equals(Type))
			  result.add(x);
	  }
	  return result;
	 
}
public ArrayList<Apartment> searchByLease_Length(String Len) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getLease_Length().equals(Len))
			  result.add(x);
	  }
	  return result;
}
public ArrayList<Apartment> searchByAmenities(String strings) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getAmenities().contains(strings))
			  result.add(x);
	  }
		  
	  
	 
	 return result;
	
}
public void print(ArrayList<Apartment> e) {
	for(Apartment g : e) {
		g.toString();
	}
	
}



public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
    if (i >= minValueInclusive && i <= maxValueInclusive)
        return true;
    else
        return false;
}
	
}

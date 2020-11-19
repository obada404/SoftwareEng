

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

//import org.omg.CORBA.RepositoryIdHelper;

public class Apartment_search {
	
	
	

private ArrayList<Apartment> all =new ArrayList<Apartment> () ;
 public static  ArrayList<Apartment> result=new ArrayList<Apartment> () ;
  private int x ;
  Mockemail moc =new Mockemail(this );
private   Emailservices emailservices =new Emailservices();
public void setEmailservices(Emailservices emailservices) {
	// TODO Auto-generated method stub
	this.emailservices =emailservices;
	
}
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
		c.setAllow_Pets( !st[3].equals("NO"));
		c.setAmenities(st[4]);
		c.setPrice(Integer.valueOf(st[5]));
		c.setArea(Integer.valueOf(st[6]));
		c.setBedrooms(Integer.valueOf(st[7]));
		c.setBathrooms(Integer.valueOf(st[8]));
		c.setLease_Length(st[9]);
		all.add(c);
		
	}
	public static ArrayList<Apartment> getResult() {
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
	 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;
  }
public ArrayList<Apartment> searchByMaterial(String Mat) {
	/* result.clear();
	  for(Apartment x:all)
	  {
		  if(x.getMaterial().equals(Mat))
			  result.add(x);
	  }
	  if(result!=null) {
			 emailservices.sendEmail("kgkanassar17@gmail.com", result);
		 }
		 if(!result.equals(null)) {
			 emailservices.sendEmail("kgkanassar17@gmail.com", result);
		 }
	  return result;*/
	
	
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getMaterial().equals(Mat)) {
			ap.add(a);
		}
		
	}
	result=ap;
	if(!result.equals(null)) {
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);}
	return result;
  }
public ArrayList<Apartment> searchByprice(int price) {
	/* result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getPrice()==price)
			  result.add(x);
	  }
	 
	 if(result!=null) {
		 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	 }
	 if(!result.equals(null)) {
		 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	 }
	 
	  
	  
	  return result;
	  
	  */

	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getPrice()<price) {
			ap.add(a);
		}
		
	}
	result=ap;
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
	return ap;
	  
	  
	  
}
public ArrayList<Apartment> searchByRangeOfPrices(int price1,int price2) {
	/* result.clear();
	 for(Apartment x:all)
	  {
		  if(between(x.getPrice(),price1,price2))
			  result.add(x);
	  }
	
	 if(!result.equals(null)) {
	//	 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	 }	  return result;*/

	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(between(a.getPrice(),price1,price2)) {
			ap.add(a);
		}
		
	}
	result=ap;
	if(!result.equals(null)) {
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);}
	return ap;
}
public ArrayList<Apartment> searchByArea(int Area) {
	
/*	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getArea()==Area)
			  result.add(x);
	  }
	// emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;*/
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getArea()==Area) {
			ap.add(a);
		}
		
	}
	result=ap;
	if(!result.equals(null)) {
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);}
	return ap;
}
public ArrayList<Apartment> searchByRangeOfAreas(int Area1,int Area2) {
	/* result.clear();
	 for(Apartment x:all)
	  {
		  if(between(x.getArea(),Area1,Area2))
			  result.add(x);
	  }
//	 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;*/
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(between(a.getArea(),Area1,Area2)) {
			ap.add(a);
		}
		
	}
	result=ap;
	if(!result.equals(null)) {
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);}
	return ap;
}
public ArrayList<Apartment> searchBybedrooms(int numd) {
	/* result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getBedrooms()==numd)
			  result.add(x);
	  }
	// emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;*/
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getBedrooms()==numd) {
			ap.add(a);
		}
		
	}
	result=ap;
	if(!result.equals(null)) {
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);}
	return ap;
}
public ArrayList<Apartment> searchBybathrooms(int numt) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(numt==x.getBathrooms()) {
			  result.add(x);
		  }
	  }
	emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;
}
public ArrayList<Apartment> searchByAllow_Pets(String  string) {
	 result.clear();
	 for(Apartment x:all) {
		  if((!x.isAllow_Pets())&&string.equals("no"))
			  result.add(x);
		  else if(x.isAllow_Pets()&&string.equals("yes"))
			  result.add(x);
	  }
	 emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;
}
public ArrayList<Apartment> searchByType(String Type) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getType().equals(Type))
			  result.add(x);
	  }
	 
	 
      emailservices.sendEmail("oday.qr.2001@gmail.com", result);
	 
	  return result;
	 
}
public ArrayList<Apartment> searchByLease_Length(String Len) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getLease_Length().equals(Len))
			  result.add(x);
	  }
	emailservices.sendEmail("kgkanassar17@gmail.com", result);
	  return result;
}
public ArrayList<Apartment> searchByAmenities(String strings) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getAmenities().toLowerCase().contains(strings))
			  result.add(x);
	  }
		  
	  
	 emailservices.sendEmail("kgkanassar17@gmail.com", result); 
	 return result;
	
}
public void print(ArrayList<Apartment> e) {
	for(Apartment g : e) {
		System.out.println(g.toString());

	}
	if(e.isEmpty())
	System.out.println( "no result");
	
	System.out.println(  );

}



public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
    if (i >= minValueInclusive && i <= maxValueInclusive)
        return true;
    else
        return false;
}

	
} 
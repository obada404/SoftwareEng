


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class apartmentSearch {
	
	
	

private ArrayList<Apartment> all =new ArrayList() ;
 protected static  ArrayList<Apartment> result = new ArrayList<Apartment> () ;

  //Mockemail moc =new Mockemail(this );
private   Emailservices emailservices =new Emailservices();
public void setEmailservices(Emailservices emailservices) {
	// TODO Auto-generated method stub
	this.emailservices =emailservices;
	
}
  public List<Apartment> getAll() {
		return all;
	}
	public void setAll(List<Apartment> all) {
		this.all = (ArrayList<Apartment>) all;
	}
	public void setApartment(String [] st) {
		Apartment  c =new Apartment();
		c.setType(st[0]);
		c.setMaterial(st[1]);
		c.setPlacement(st[2]);
		c.setallowpets( !st[3].equals("NO"));
		c.setAmenities(st[4]);
		c.setPrice(Integer.valueOf(st[5]));
		c.setArea(Integer.valueOf(st[6]));
		c.setBedrooms(Integer.valueOf(st[7]));
		c.setBathrooms(Integer.valueOf(st[8]));
		c.setLeaseLength(st[9]);
		all.add(c);
		
	}
	public static ArrayList<Apartment> getResult() {
		return (ArrayList<Apartment>) result;
	}
	public void setResult(ArrayList<Apartment> result) {
		this.result = result;
	}

  
  public apartmentSearch() {
		super();
  }
  public apartmentSearch(ArrayList<Apartment> all, ArrayList<Apartment> result) {
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
	 emailservices.sendEmail("kgkanassar17@gmail.com", (ArrayList<Apartment>) result);
	  return (ArrayList<Apartment>) result;
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

	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
	return (ArrayList<Apartment>) result;
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

	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
	return ap;
}
public ArrayList<Apartment> searchByArea(int Area) {
	

	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getArea()==Area) {
			ap.add(a);
		}
		
	}
	result=ap;
	
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
	return ap;
}
public ArrayList<Apartment> searchByRangeOfAreas(int Area1,int Area2) {
	
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(between(a.getArea(),Area1,Area2)) {
			ap.add(a);
		}
		
	}
	result=ap;

	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
	return ap;
}
public ArrayList<Apartment> searchBybedrooms(int numd) {
	
	ArrayList<Apartment> ap=new ArrayList<Apartment>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getBedrooms()==numd) {
			ap.add(a);
		}
		
	}
	result=ap;
	
	emailservices.sendEmail("kgkanassar17@gmail.com", ap);
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
	emailservices.sendEmail("kgkanassar17@gmail.com", (ArrayList<Apartment>) result);
	  return (ArrayList<Apartment>) result;
}
public ArrayList<Apartment> searchByAllow_Pets(String  string) {
	 result.clear();
	 for(Apartment x:all) {
		  if((!x.isallowPets())&&string.equals("no"))
			  result.add(x);
		  else if(x.isallowPets()&&string.equals("yes"))
			  result.add(x);
	  }
	 emailservices.sendEmail("kgkanassar17@gmail.com", (ArrayList<Apartment>) result);
	  return (ArrayList<Apartment>) result;
}
public ArrayList<Apartment> searchByType(String Type) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getType().equals(Type))
			  result.add(x);
	  }
	 
	 
      emailservices.sendEmail("oday.qr.2001@gmail.com", (ArrayList<Apartment>) result);
	 
	  return (ArrayList<Apartment>) result;
	 
}
public ArrayList<Apartment> searchByLease_Length(String Len) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getLeaseLength().equals(Len))
			  result.add(x);
	  }
	emailservices.sendEmail("kgkanassar17@gmail.com", (ArrayList<Apartment>) result);
	  return (ArrayList<Apartment>) result;
}
public ArrayList<Apartment> searchByAmenities(String strings) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getAmenities().toLowerCase().contains(strings))
			  result.add(x);
	  }
		  
	  
	 emailservices.sendEmail("kgkanassar17@gmail.com", (ArrayList<Apartment>) result);
	 return (ArrayList<Apartment>) result;
	
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
package packagemain;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ApartmentSearch {
	
	
	

private List<Apartment> all = new ArrayList<>();


	public static void setResult(List<Apartment> result) {
		ApartmentSearch.result = result;
	}

	protected static List<Apartment> result = new ArrayList<>();


private   Emailservices emailservices =new Emailservices();
public void setEmailservices(Emailservices emailservices) {

	this.emailservices =emailservices;
	
}
  public List<Apartment> getAll() {
		return all;
	}
	public void setAll(List<Apartment> all) {
		this.all = all;
	}
	public void setApartment(String [] st) {
		Apartment  c =new Apartment();
		c.setType(st[0]);
		c.setMaterial(st[1]);
		c.setPlacement(st[2]);
		c.setallowpets( !st[3].equals("NO"));
		c.setAmenities(st[4]);
		c.setPrice(Integer.parseInt(st[5]));
		c.setArea(Integer.parseInt(st[6]));
		c.setBedrooms(Integer.parseInt(st[7]));
		c.setBathrooms(Integer.parseInt(st[8]));
		c.setLeaseLength(st[9]);
	 	all.add(c);
		
	}
	public static List<Apartment> getResult() {
		return result;
	}

  public ApartmentSearch() {
		super();
  }

	public List<Apartment> searchByPlacement(String pla) {
	  result.clear();
	  
	  for(Apartment x:all)
	  {
		  
		  if(x.getPlacement().equals(pla))
			  result.add(x);
	  }
	 emailservices.sendEmail((ArrayList<Apartment>) result);
	  return  result;
  }
public List<Apartment> searchByMaterial(String mat) {

	
	ArrayList<Apartment> ap=new ArrayList<>();
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getMaterial().equals(mat)) {
			ap.add(a);
		}
		
	}
	setResult(ap);

	emailservices.sendEmail( ap);
	return result;
}
public List<Apartment> searchByprice(int price) {


	ArrayList<Apartment> ap=new ArrayList<>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getPrice()<price) {
			ap.add(a);
		}
		
	}
	setResult(ap);
	emailservices.sendEmail( ap);
	return ap;
	  
	  
	  
}
public List<Apartment> searchByRangeOfPrices(int price1,int price2) {

	ArrayList<Apartment> ap=new ArrayList<>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(between(a.getPrice(),price1,price2)) {
			ap.add(a);
		}
		
	}
	setResult(ap);
	emailservices.sendEmail( ap);
	return ap;
}
public List<Apartment> searchByArea(int area) {
	

	ArrayList<Apartment> ap=new ArrayList<>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getArea()==area) {
			ap.add(a);
		}
		
	}
	setResult(ap);
	
	emailservices.sendEmail( ap);
	return ap;
}
public  List<Apartment> searchByRangeOfAreas(int area1,int area2) {
	
	ArrayList<Apartment> ap=new ArrayList<>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(between(a.getArea(),area1,area2)) {
			ap.add(a);
		}
		
	}
	setResult(ap);

	emailservices.sendEmail( ap);
	return ap;
}
public List<Apartment> searchBybedrooms(int numd) {
	
	ArrayList<Apartment> ap=new ArrayList<>();
	
	Iterator<Apartment> it =all.iterator();
	while(it.hasNext()) {
		Apartment a=it.next();
		if(a.getBedrooms()==numd) {
			ap.add(a);
		}
		
	}
	setResult(ap);
	emailservices.sendEmail( ap);
	return ap;
}
public List<Apartment> searchBybathrooms(int numt) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(numt==x.getBathrooms()) {
			  result.add(x);
		  }
	  }
	emailservices.sendEmail( (ArrayList<Apartment>) result);
	  return result;
}
public List<Apartment> searchByAllowPets(String  string) {
	 result.clear();
	 for(Apartment x:all) {
		  if((!x.isallowPets())&&string.equals("no"))
			  result.add(x);
		  if(x.isallowPets()&&string.equals("yes"))
			  result.add(x);
	  }
	 emailservices.sendEmail((ArrayList<Apartment>) result);
	  return result;
}
public List<Apartment> searchByType(String type) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getType().equals(type))
			  result.add(x);
	  }
	 
	 
      emailservices.sendEmail( (ArrayList<Apartment>) result);
	 
	  return result;
	 
}
public List<Apartment> searchByLeaseLength(String len) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getLeaseLength().equals(len))
			  result.add(x);
	  }
	emailservices.sendEmail( (ArrayList<Apartment>) result);
	  return result;
}
public List<Apartment> searchByAmenities(String strings) {
	 result.clear();
	 for(Apartment x:all)
	  {
		  if(x.getAmenities().toLowerCase().contains(strings))
			  result.add(x);
	  }
		  
	  
	 emailservices.sendEmail( (ArrayList<Apartment>) result);
	 return result;
	
}
public String print(List<Apartment> e) {
	String a ="";
	for(Apartment g : e) {
		a=a.concat(g.toString());

	}
	if(e.isEmpty())
		a= "no result \n";

	a=a.concat("\n");
	return a;

}



public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
    if (i >= minValueInclusive && i <= maxValueInclusive)
        return true;
    else
        return false;
}

	
} 
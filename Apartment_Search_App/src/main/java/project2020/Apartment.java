package project2020;

public class Apartment {
	 enum Placement{
	City, Village
}
 enum Material{
	 Stone,Brick,Wood
}

 enum type{
	 Apartment, house
}
 enum Lease_Length{
	short_term_6_months, long_term_year
}
 enum Amenities{
	AirConditioning, Balcony, Elevator, FirePlace, Garage_Parking,
	Swimming_Pool
}


  private String Placement,Material,type,Lease_Length,Amenities;
  private int Area,bedrooms,bathrooms,Price;
  private boolean Allow_Pets;
	
	
	
	public Apartment(String placement, String material, int price, String type, String lease_Length,
			String amenities, int area, int bedrooms, int bathrooms, boolean allow_Pets) {
		super();
		Placement = placement;
		Material = material;
		Price = price;
		this.type = type;
		Lease_Length = lease_Length;
		Amenities = amenities;
		Area = area;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		Allow_Pets = allow_Pets;
	}
	public Apartment() {
		super();
	}
	public String getPlacement() {
		return Placement;
	}
	public void setPlacement(String placement) {
		Placement = placement;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}

	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLease_Length() {
		return Lease_Length;
	}
	public void setLease_Length(String lease_Length) {
		Lease_Length = lease_Length;
	}
	public String getAmenities() {
		return Amenities;
	}
	public void setAmenities(String amenities) {
		Amenities = amenities;
	}
	public int getArea() {
		return Area;
	}
	public void setArea(int area) {
		Area = area;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public boolean isAllow_Pets() {
		return Allow_Pets;
	}
	public void setAllow_Pets(boolean allow_Pets) {
		Allow_Pets = allow_Pets;
	}
	
	
	
	@Override
	public String toString() {
		return "Apartment [Placement=" + Placement + ", Material=" + Material + ", Price=" + Price + ", type=" + type
				+ ", Lease_Length=" + Lease_Length + ", Amenities=" + Amenities + ", Area=" + Area + ", bedrooms="
				+ bedrooms + ", bathrooms=" + bathrooms + ", Allow_Pets=" + Allow_Pets + "]";
	}
	
}

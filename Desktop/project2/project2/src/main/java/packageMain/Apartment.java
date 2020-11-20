package packageMain;

public class Apartment {
	

	private String placement;
	  private String material;
	  private String type;
	  private String leaseLength;
	  private String amenities;
	  private int area;
	  private int bedrooms;
	  private int bathrooms;
	  private int price;
	  private boolean allowPets;
		
		
		
		
		public Apartment() {
			super();
		}
		public String getPlacement() {
			return placement;
		}
		public void setPlacement(String placement) {
			this.placement = placement;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}

		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getLeaseLength() {
			return leaseLength;
		}
		public void setLeaseLength(String leaseLength) {
			if(leaseLength.equals("6"))
			this.leaseLength = "short term_6 months";
			else 
				this.leaseLength = "long term_year";
		}
		public String getAmenities() {
			return amenities;
		}
		public void setAmenities(String amenities) {
			this.amenities = amenities;
		}
		public int getArea() {
			return area;
		}
		public void setArea(int area) {
			this.area = area;
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
		public boolean isallowPets() {
			return allowPets;
		}
		public void setallowpets(boolean allowPets) {
			this.allowPets = allowPets;
		}
		
		
		
		@Override
		public String toString() {
			return "packageMain.Apartment [Placement=" + placement + ", Material=" + material + ", Price=" + price + ", type=" + type
					+ ", Lease_Length=" + leaseLength + ", Amenities=" + amenities + ", Area=" + area + ", bedrooms="
					+ bedrooms + ", bathrooms=" + bathrooms + ", Allow_Pets=" + allowPets + "]";
		}
		
	}

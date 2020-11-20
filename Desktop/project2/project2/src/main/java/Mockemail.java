import static org.mockito.Mockito.*;
public class Mockemail {
	
	
	
private Emailservices emailservicse=mock(Emailservices.class);



public Mockemail(apartmentSearch apa) {
	apa.setEmailservices(emailservicse);
	
	
}
public Emailservices getEmailservicse() {
	return emailservicse;
	
	
}
public void setEmailservices(Emailservices emailservices) {
	
	
	this.emailservicse=emailservices;
	
	
	
}
}

package packagemain;

import static org.mockito.Mockito.*;
public class Mockemail {


	Emailservices a =new Emailservices();
private Emailservices emailservicse=mock(a.getClass());



public Mockemail(ApartmentSearch apa) {
	apa.setEmailservices(emailservicse);
	
	
}
public Emailservices getEmailservicse() {
	return emailservicse;
	
	
}
public void setEmailservices(Emailservices emailservices) {
	
	
	this.emailservicse=emailservices;
	
	
	
}
}

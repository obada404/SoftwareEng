package packagemain;

import java.util.ArrayList;


public class Emailservices {
public void sendEmail( List<Apartment> result) {

    String to = "oday.qr.2001@gmail.com";

    // Mention the Sender's email address
    String from = "o.qasrawi@stu.najah.edu";
    Properties properties = System.getProperties();
    String host = "smtp.gmail.com";
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", "465");
    properties.put("mail.smtp.ssl.enable", "true");
    properties.put("mail.smtp.auth", "true");
    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("o.qasrawi@stu.najah.edu", "obada123456");
        }
    });
   
    session.setDebug(true);
   

   try {
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        
     
  
    	  message.setSubject("this is the sub");
    	 	  if (result.equals(null)) {
    		  message.setText("empty");
    	  }
     
      for(int i=0;i<=result.size();i++) {
    	  String h= result.toString();
    	  message.setText(h);
      }

    	  
    	
     
        

        System.out.println("sending...");
        // Send message
        Transport.send(message);
        System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
        mex.printStackTrace();
    }
	
	

	
	
	
	
}


}

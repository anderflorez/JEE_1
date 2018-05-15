import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {

	public static void main(String[] args) throws NamingException {
		
		Properties jndiProperties = new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		jndiProperties.put("jboss.naming.client.ejb.context",  true);
		
		Context jndi;
		try {
			jndi = new InitialContext(jndiProperties);
			
			ShoppingCartSession session = (ShoppingCartSession) jndi.lookup("ShoppingCartServer/ShoppingCartSessionImplementation!ShoppingCartSession");
			session.addItem("First product");
			session.addItem("Second product");
			session.addItem("Third product");
			List<String> cartItems = session.getCartContents();
			for (String item : cartItems) {
				System.out.println(item);
			}
			session.checkout();
			
			cartItems = session.getCartContents();
			for (String item : cartItems) {
				System.out.println(item);
			}
			
			session.checkout();
			
		} catch (javax.ejb.NoSuchEJBException e) {
			System.err.println("The session could not be found in the server");
		}
		
	}

}

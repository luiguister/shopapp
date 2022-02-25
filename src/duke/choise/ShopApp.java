package duke.choise;
import java.net.InetAddress;
import java.net.UnknownHostException;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

public class ShopApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Duke choise shop");
		
		Clothing item1 = new Clothing("Blue Jacket", 28.9, 'M');
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, 'S');
		Clothing item3 = new Clothing("Green Scarf", 5, 'S');
		Clothing item4 = new Clothing("Blue T-Shirt T-Shirt", 10.5, 'S');
		
		Clothing[] items = {item1, item2, item3, item4};
		
		try {
			ItemList list = new ItemList(items);
			Routing routing = Routing.builder().get("/items", list).build();
			
			ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost())
					.port(8888).build();
			WebServer ws = WebServer.create(config, routing);
			ws.start();
		}catch(UnknownHostException ex) {
			ex.printStackTrace();
		}
		
	}

}

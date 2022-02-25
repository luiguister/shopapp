package duke.choise;
import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.netty.handler.address.ResolveAddressHandler;

public class ItemList implements Handler{
	
	private Clothing[]items;
	
	public ItemList(Clothing[] items) {
		super();
		this.items = items;
	}

	@Override
	public void accept(ServerRequest req, ServerResponse res) {
		
		res.status(Http.Status.OK_200);
		res.headers().put("Content-Type", "text/plain; charset=UTF-8");
		StringBuilder result = new StringBuilder();
		for(Clothing item : items) {
			result.append(item+"\n");
		}
		res.send(result);
	}

}

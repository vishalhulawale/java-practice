interface Server {
	void serve();
}

abstract class HttpServer implements Server {

	void respond() {
	
		System.out.println("Send Http Response");
	
	}
	
}

class AppServer extends HttpServer{

	@Override
	public void serve() {
		
		System.out.println("Handling App Requests.");
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {

		AppServer appServer = new AppServer();
		appServer.serve();
		appServer.respond();
		
	}

}

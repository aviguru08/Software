package AWS_app2.AWS_app2;

import com.google.gwt.angular.client.NgInject;

@NgInject(name="simple")
public class SimpleService {

	public String greet(String name) {
		return "Hello " + name;
	}
	
	public String dismiss(String name) {
		return "Goodbye " + name;
	}
}

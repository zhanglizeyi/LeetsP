
import org.junit.Test;

public class DependencyInjectionExample{

	GoodMorningService service = new GoodMorningService();

	@Test
	public void dummyTest(){
		System.out.println(service.sayHi());
	}
}

class GoodMorningService{
	
	public String sayHi(){
		return "Good Morning";
	}

}

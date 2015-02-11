package demo;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	private static final String template = "Hello %s!";

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(template, name);
	}
	
	@RequestMapping("/stuff")
	public @ResponseBody Map<String, String> showstuff() {
		
		return System.getenv();
		
//		Map<String, String> env = System.getenv();
//		List<String> list = new ArrayList<String>();
//		
//		
//		for (String key : env.keySet()) {
//			list.add(env.get(key));
//		}
//		
//		return list;
	}

}

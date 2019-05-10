package zm.zmmm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZmmmContext {
	public static ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	public static <T> T getBean(String beanId, Class<T> clazz) {
		return context.getBean(beanId,clazz);
	}
}

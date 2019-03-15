package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import alpha.Demo;

public class Demo1 {
	
	private static Logger log1 = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		log1.debug("I am debugging 1");
		log1.info("Object is present 1");
		log1.error("Object is not present 1");
        log1.fatal("This is fatal 1");
		
	}

}

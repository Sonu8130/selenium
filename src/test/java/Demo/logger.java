package Demo;

import org.apache.logging.log4j.*;

public class logger {

	private static Logger log = LogManager.getLogger(Logger.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.error("This is error");
		log.fatal("This is fatal");

	}

}

package logic;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("logger test start");
		Logger logger = Logger.getLogger(MainClass.class);
		logger.log(Priority.INFO, "Info: Reached main class");
		logger.log(Priority.ERROR, "Error: Reached main class");
		logger.log(Priority.FATAL, "Fatal: Reached main class");
		logger.log(Priority.WARN, "Warn: Reached main class");
		logger.log(Priority.DEBUG, "Debug: Reached main class");
		System.out.println("logger end");
	}
}

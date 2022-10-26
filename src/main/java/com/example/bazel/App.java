package src.main.java.com.example.bazel;

import org.apache.log4j.Logger;

public class App {
  private static Logger logger = Logger.getLogger(App.class);
  public static void main(String[] args) {
    logger.debug("===========================test log4j===========================");
    logger.info("===========================test log4j===========================");
    logger.warn("===========================test log4j===========================");
    logger.error("===========================test log4j===========================");
  }
}

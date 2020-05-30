package test;

import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

/**
 * Hello world!
 */
public class app {
    private static final Logger log = Logger.getLogger(app.class);

    public static void main(String[] args) {

       /* System.getProperties().put( "proxySet", "true" );
        System.getProperties().put( "socksProxyHost", "127.0.0.1" );
        System.getProperties().put( "socksProxyPort", "9150" );*/
        ApiContextInitializer.init();
        Bot test_habr_bot = new Bot("helloVsevolodBot", "1165270811:AAGNlKY5mcWwfeb0EKusX8-uRVIAWRpaCaw");
        test_habr_bot.botConnect();
    }



}
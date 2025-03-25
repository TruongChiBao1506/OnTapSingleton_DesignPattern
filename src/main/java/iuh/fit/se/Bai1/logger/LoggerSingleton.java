package iuh.fit.se.Bai1.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private static final String LOG_FILE = "log.txt";

    private LoggerSingleton(){}

    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
    public void log(String message){
        String timestamp = LocalDateTime.now().toString();
        String logMessage = timestamp + ": " + message;
        System.out.println(logMessage);

        try(PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))){
            out.println(logMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

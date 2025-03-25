package iuh.fit.se.Bai1.services;

import iuh.fit.se.Bai1.logger.LoggerSingleton;

public class UserService {

    private LoggerSingleton logger = LoggerSingleton.getInstance();
    public void loginUser(String username){
        logger.log("User logged in");
        System.out.println("User " + username + " created!");
    }
}

package com.ljg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by lijianguo on 2017/4/21.
 */
public class User {

    private static Logger LOGGER = LogManager.getLogger(User.class);

    private int id;

    private String username;

    public int getId() {
        LOGGER.debug("id==" + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        LOGGER.debug("username==" + username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        LOGGER.debug("toString==" + this.getUsername());
        return super.toString();
    }
}

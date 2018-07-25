package com.gamezone.server;

import org.springframework.stereotype.Component;

@Component
public interface GamezoneServer {

    String sentDataToClient(String ipaddress, String keyword) throws Exception;
    String sentDataToClientThread(String ipaddress, String keyword, String time) throws Exception;
}

package com.gamezone.server;

import org.springframework.stereotype.Component;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

@Component
public class GamezoneServerImpl implements GamezoneServer{

    private DatagramSocket clientSocket;
    private InetAddress IPAddress;
    private DatagramPacket sendPacket, receivePacket;
    private String modifiedSentence;

    /**
     * This method use to sent data to client
     * @param ipaddress
     * @param keyword
     * @return
     * @throws Exception
     */
    public String sentDataToClient(String ipaddress, String keyword) throws Exception {
        /**
         * Catch those exceptions SocketException, UnknownHostException, IOException
         */
        clientSocket = new DatagramSocket();
        IPAddress = InetAddress.getByName(ipaddress);

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        sendData = keyword.getBytes();
        System.out.println("sendData :" + sendData);

        sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);
        clientSocket.setSoTimeout(1000);

        try {
            receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            modifiedSentence = new String(receivePacket.getData());
            System.out.println("From gaming PC :" + modifiedSentence);
        } catch (SocketTimeoutException socketTimeoutException) {
            /**
             * timeout exception
             */
            System.out.println("Timeout reached :" + socketTimeoutException.getMessage());
            modifiedSentence = "offline";
            clientSocket.close();
        }
        clientSocket.close();
        return modifiedSentence;
    }

    /**
     * This method use to sent data to create or replace current thread in client
     * @param ipaddress
     * @param keyword
     * @return
     * @throws Exception
     */
    public String sentDataToClientThread(String ipaddress, String keyword, String time) throws Exception {
        /**
         * Catch those exceptions SocketException, UnknownHostException, IOException
         */
        clientSocket = new DatagramSocket();
        IPAddress = InetAddress.getByName(ipaddress);

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        String word = keyword + time;
        System.out.println("time sending :"+word);
        sendData = word.getBytes();

        sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);
        clientSocket.setSoTimeout(1000);

        try {
            receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            modifiedSentence = new String(receivePacket.getData());
            System.out.println("From gaming PC :" + modifiedSentence);
        } catch (SocketTimeoutException socketTimeoutException) {
            /**
             * timeout exception
             */
            modifiedSentence = "offline";
            System.out.println("Timeout reached :" + socketTimeoutException.getMessage());
            clientSocket.close();
        }
        clientSocket.close();
        return modifiedSentence;
    }
}

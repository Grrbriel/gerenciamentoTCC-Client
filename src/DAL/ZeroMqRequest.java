/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

/**
 *
 * @author gabriel
 */
public class ZeroMqRequest {
    public static ZContext context;
    public static ZMQ.Socket reqSocket;
    
    public ZeroMqRequest() {
        context = new ZContext();
        reqSocket = context.createSocket(SocketType.REQ);
        reqSocket.connect("tcp://localhost:5555");
    }
    
    public static void sendRequest(String req){
        System.out.println("Sending request: " + req);
        reqSocket.send(req);
    }
    
    public static String receiveReply(){
        String reply = reqSocket.recvStr();
        
        return reply;
    }
}

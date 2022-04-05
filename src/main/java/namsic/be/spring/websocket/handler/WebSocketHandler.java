package namsic.be.spring.websocket.handler;

import lombok.extern.slf4j.Slf4j;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@Slf4j
@ServerEndpoint(value = "")
public class WebSocketHandler {
    
    @OnOpen
    public void onOpen(Session session) {
        log.info("Open {}", session.getId());
    }
    
    @OnMessage
    public void onMessage(Session session, String payload) throws IOException {
        log.info("Message: {} {}", session.getId(), payload);
    }
    
    @OnClose
    public void onClose(Session session) {
        log.info("Close {}", session.getId());
    }
    
}

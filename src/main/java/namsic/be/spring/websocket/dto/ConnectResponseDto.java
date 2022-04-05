package namsic.be.spring.websocket.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ConnectResponseDto extends BasicDto {

    public ConnectResponseDto() {
        this.header.put("version", 1);
        this.header.put("requestId", UUID.randomUUID());
        this.header.put("messageType", "commandRequest");
        this.header.put("messagePurpose", "subscribe");
        
        this.body.put("eventName", "PlayerMessage");
    }

}

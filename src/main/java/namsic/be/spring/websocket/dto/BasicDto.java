package namsic.be.spring.websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicDto {

    Map<String, Object> header = new HashMap<>();
    Map<String, Object> body = new HashMap<>();

}

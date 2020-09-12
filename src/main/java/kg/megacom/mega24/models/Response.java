package kg.megacom.mega24.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private int status;
    private String message;

    public Response getResponse(){
        return Response.builder()
                .status(1)
                .message("Успешно!")
                .build();
    }
}

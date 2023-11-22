package pl.merito.shopai.util.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {
    private ErrorStatus status;
    private String message;
    private final LocalDateTime timestamp;

    public ApiError(ErrorStatus status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}

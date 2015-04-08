package azvasa.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class VMNotFoundException extends RuntimeException {
    public VMNotFoundException(String message) {
        super(message);
    }
}

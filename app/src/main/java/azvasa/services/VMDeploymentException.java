package azvasa.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class VMDeploymentException extends RuntimeException {
    VMDeploymentException(String message){
        super(message);
    }
}

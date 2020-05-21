package com.vitamin.vitamin.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class VitaminNotFoundException extends RuntimeException {

    private String message;
    private HttpStatus status;

    public VitaminNotFoundException(String message) {
        this.message = message;
        this.status = HttpStatus.NOT_FOUND;
    }
}

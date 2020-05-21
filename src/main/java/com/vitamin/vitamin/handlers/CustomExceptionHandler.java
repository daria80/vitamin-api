package com.vitamin.vitamin.handlers;

import com.vitamin.vitamin.exceptions.ProductNotFoundException;
import com.vitamin.vitamin.exceptions.VitaminNotFoundException;
import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.transfers.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(VitaminNotFoundException.class)
    public ResponseEntity<?> handleVitaminNotFoundException(VitaminNotFoundException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), e.getStatus().value()), e.getStatus());
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), e.getStatus().value()), e.getStatus());
    }

}

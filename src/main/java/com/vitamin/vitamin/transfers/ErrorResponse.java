package com.vitamin.vitamin.transfers;

import lombok.Data;

import java.util.Map;

@Data
public class ErrorResponse {

    private String message;
    private Integer status;

    public ErrorResponse(int status, Map<String, Object> errorAttributes) {
        this.setStatus(status);
        this.setMessage((String) errorAttributes.get("message"));
    }

    public ErrorResponse(String message, Integer status) {
        this.message = message;
        this.status = status;
    }
}

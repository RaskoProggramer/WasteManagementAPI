package com.enviro.assessment.grad001.mphorakgope.exception;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
    private String message;
    private HttpStatus status;

    public ErrorResponse(String message, HttpStatus status){
        this.message = message;
        this.status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setStatus(HttpStatus status){
        this.status = status;
    }

    public String getMessage(){
        return this.message;
    }

    public HttpStatus getStatus(){
        return this.status;
    }
}

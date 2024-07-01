package com.workintech.zoo.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@Setter
public class ZooException extends RuntimeException{
    private HttpStatus HttpStatus;

    public ZooException(String message, HttpStatus status) {
        super(message);
        this.HttpStatus = status;
    }

}

package com.project.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DataBindingException extends RuntimeException {
    public DataBindingException(String message){
        super(message);
    }

}

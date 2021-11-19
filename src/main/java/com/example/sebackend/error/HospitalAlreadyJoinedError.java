package com.example.sebackend.error;

public class HospitalAlreadyJoinedError implements ServiceError{

    @Override
    public String getMessage() {
        return "Hospital has already joined!";
    }

    @Override
    public Integer getCode() {return 5;}
}

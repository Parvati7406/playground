package com.example.login.Model;

import com.example.login.Global.Request_status;

import java.io.Serializable;

public class Request_model implements Serializable {

    String Request_num;
    Request_status request_status;
    String Request_date;

    public String getRequest_num() {
        return Request_num;
    }

    public void setRequest_num(String request_num) {
        Request_num = request_num;
    }

    public Request_status getRequest_status() {
        return request_status;
    }

    public void setRequest_status(Request_status request_status) {
        this.request_status = request_status;
    }

    public String getRequest_date() {
        return Request_date;
    }

    public void setRequest_date(String request_date) {
        Request_date = request_date;
    }



}

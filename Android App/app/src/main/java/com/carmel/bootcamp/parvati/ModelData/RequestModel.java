package com.carmel.bootcamp.parvati.ModelData;

import com.carmel.bootcamp.parvati.GlobalData.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
    String Request_num;
    RequestStatus request_status;
    String Request_date;

    public String getRequest_num() {
        return Request_num;
    }

    public void setRequest_num(String request_num) {
        Request_num = request_num;
    }

    public RequestStatus getRequest_status() {
        return request_status;
    }

    public void setRequest_status(RequestStatus request_status) {
        this.request_status = request_status;
    }

    public String getRequest_date() {
        return Request_date;
    }

    public void setRequest_date(String request_date) {
        Request_date = request_date;
    }
}


package com.lead.dto;

public class LeadSaveResponse {
    private String status;
    private String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LeadSaveResponse{" +
                "status='" + status + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

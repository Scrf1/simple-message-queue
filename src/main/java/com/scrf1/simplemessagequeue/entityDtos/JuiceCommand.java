package com.scrf1.simplemessagequeue.entityDtos;

import java.io.Serializable;
import java.util.Date;

public class JuiceCommand implements Serializable {

    private Long clientId;
    private Long juiceId;
    private Date date;

    public JuiceCommand(Long clientId, Long juiceId, Date date) {
        this.clientId = clientId;
        this.juiceId = juiceId;
        this.date = date;
    }

    public JuiceCommand() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getJuiceId() {
        return juiceId;
    }

    public void setJuiceId(Long juiceId) {
        this.juiceId = juiceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "JuiceCommand{" +
                "clientId=" + clientId +
                ", juiceId=" + juiceId +
                ", date=" + date +
                '}';
    }
}

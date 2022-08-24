package com.scrf1.simplemessagequeue.entityDtos;

import java.util.Date;

public class JuiceCommand {

    private Long clientId;
    private Long juiceId;
    private Date date;

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
}

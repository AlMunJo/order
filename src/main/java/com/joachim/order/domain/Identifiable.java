package com.joachim.order.domain;

import java.util.UUID;

public class Identifiable {

    private final String Uuid;

    public Identifiable() {
        this.Uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return this.Uuid;
    }

}

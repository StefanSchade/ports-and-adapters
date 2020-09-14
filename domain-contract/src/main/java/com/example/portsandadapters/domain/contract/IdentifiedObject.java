package com.example.portsandadapters.domain.contract;

public abstract class IdentifiedObject {

    protected Long id;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

}

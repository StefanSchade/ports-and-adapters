package com.example.portsandadapters.domain.contract;

public abstract class IdentifiedObject {

    protected final Long id;

    protected final Boolean objectIsPersisted;

    protected IdentifiedObject(Long id) {

        if (id==null) {
            this.id = null;
            this.objectIsPersisted = false;
        } else {
            this.id = id;
            this.objectIsPersisted = true;
        }
    }

    public Long getId() {

        return id;
    }

    public Boolean getObjectIsPersisted() {

        return objectIsPersisted;
    }

}

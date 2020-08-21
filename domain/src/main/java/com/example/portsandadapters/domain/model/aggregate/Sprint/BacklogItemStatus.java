package com.example.portsandadapters.domain.model.aggregate.Sprint;

import com.example.portsandadapters.domain.model.base.ValueObject;

public enum BacklogItemStatus implements ValueObject {

    NEW, APPROVED, COMMITTED, DONE, REMOVED
}

package com.example.portsAndAdapters.domain.model.aggregate.Sprint;

import com.example.portsAndAdapters.domain.model.base.ValueObject;

public enum BacklogItemStatus implements ValueObject {

    NEW, APPROVED, COMMITTED, DONE, REMOVED
}

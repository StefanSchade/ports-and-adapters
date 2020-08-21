package com.example.ports_and_adapters.domain.model.aggregate.Sprint;

import com.example.ports_and_adapters.domain.model.base.ValueObject;

public enum BacklogItemStatus implements ValueObject {

    NEW, APPROVED, COMMITTED, DONE, REMOVED
}

package com.example.portsAndAdapters.domain.model.base;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class BaseEntity {

    public final Long key;

}

package com.example.portsandadapters.domain.model.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PUBLIC)
public abstract class IdentifiedObject {

    protected Long id;

}

package com.example.portsandadapters.domain.model.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter(AccessLevel.PUBLIC)
@SuperBuilder
public abstract class IdentifiedObject {

    protected Long id;

}

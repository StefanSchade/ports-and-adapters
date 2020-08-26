package com.example.portsandadapters.domain.model.aggregate.sprint;

import com.example.portsandadapters.domain.model.base.Entity;
import com.example.portsandadapters.domain.model.base.IdentifiedObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem extends IdentifiedObject implements Entity {

    private String name;

    private double totalStorypoints;

    private double remainingStorypoints;

    private BacklogItemStatus status;

}

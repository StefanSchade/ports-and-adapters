package com.example.portsandadapters.domain.model.aggregate.sprint;

import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem implements Entity {

    private Long id;

    private String name;

    private double totalStorypoints;

    private double remainingStorypoints;

    private BacklogItemStatus status;


}

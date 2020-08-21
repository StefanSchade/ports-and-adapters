package com.example.portsandadapters.domain.model.aggregate.Sprint;

import com.example.portsandadapters.domain.model.base.AggregateRoot;
import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem implements Entity {

    private String name;

    private double totalStorypoints;

    private double remainingStorypoints;

    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITTED);
        sprint.commitBacklogItem(this);
    }

}

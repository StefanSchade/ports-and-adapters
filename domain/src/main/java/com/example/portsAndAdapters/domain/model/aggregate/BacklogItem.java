package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.base.BaseEntity;
import com.example.portsAndAdapters.domain.model.value.BacklogItemStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem extends BaseEntity {

    private String name;

    private double totalStorypoints;

    private double remainingStorypoints;

    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITTED);
        sprint.commitBacklogItem(this);
    }

}

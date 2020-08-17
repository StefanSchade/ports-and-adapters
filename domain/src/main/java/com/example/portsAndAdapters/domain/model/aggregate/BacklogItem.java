package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import com.example.portsAndAdapters.domain.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem extends BaseEntity {

    private String itemName;

    private double totalStorypoints;
    private double remainingStorypoints;
    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITED);
        sprint.commitBacklogItem(this);
    }

}

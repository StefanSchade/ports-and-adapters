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

    private String name;
    private double storyPoints;
    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITED);
        sprint.commitBacklogItem(this);
    }
}

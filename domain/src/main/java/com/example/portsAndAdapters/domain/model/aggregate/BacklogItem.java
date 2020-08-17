package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem {

    @Generated
    private Long id;

    private String itemName;

    private double totalStorypoints;
    private double remainingStorypoints;
    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITED);
        sprint.commitBacklogItem(this);
    }

}

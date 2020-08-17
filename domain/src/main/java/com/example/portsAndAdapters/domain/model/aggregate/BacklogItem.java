package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import lombok.*;

@RequiredArgsConstructor
@Setter(AccessLevel.PRIVATE)
@Getter
public class BacklogItem {

    @Generated
    private final Long id;

    private String itemName;

    private double totalStorypoints;
    private double remainingStorypoints;
    private BacklogItemStatus status;

    public void commitToSprint(Sprint sprint) {
        setStatus(BacklogItemStatus.COMMITED);
        sprint.commitBacklogItem(this);
    }

}

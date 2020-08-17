package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@RequiredArgsConstructor
@Setter(AccessLevel.PRIVATE)
@Getter
public class Sprint {

    @Generated
    private final Long id;

    private final List<BacklogItem> commitedBacklogItems = new LinkedList<>();

    private boolean isStarted;

    private boolean isClosed;

    private boolean isRunning;

    private double sprintCapacityInStoryPoints;

    public double getRemainingStoryPointsCommited() {
        return getCommitedBacklogItems()
                .stream()
                .mapToDouble(BacklogItem::getRemainingStorypoints)
                .sum();
    }

    public void commitBacklogItem(BacklogItem backlogItem) {
        assert BacklogItemStatus.COMMITED.equals(backlogItem.getStatus());
           commitedBacklogItems.add(backlogItem);
    }
}

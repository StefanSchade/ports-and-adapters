package com.example.portsAndAdapters.domain.model.aggregate;

import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import com.example.portsAndAdapters.domain.model.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Setter(AccessLevel.PRIVATE)
@Getter
@Builder
public class Sprint extends BaseEntity {

    private final List<BacklogItem> committedBacklogItems = new LinkedList<>();

    private String name;

    public double getTotalStoryPointsCommitted() {
        return getCommittedBacklogItems().stream()
                                         .mapToDouble(BacklogItem::getStoryPoints)
                                         .sum();
    }

    public void commitBacklogItem(BacklogItem backlogItem) {
        assert BacklogItemStatus.COMMITED.equals(backlogItem.getStatus());
        committedBacklogItems.add(backlogItem);
    }
}

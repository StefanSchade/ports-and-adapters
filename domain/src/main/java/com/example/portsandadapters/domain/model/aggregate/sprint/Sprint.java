package com.example.portsandadapters.domain.model.aggregate.sprint;

import com.example.portsandadapters.domain.model.base.AggregateRoot;
import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Setter(AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public class Sprint extends AggregateRoot implements Entity {

    private final List<BacklogItem> backlogItems = new LinkedList<>();

    private Long id;

    private double sprintCapacityInStoryPoints;

    private String name;

    public void addBacklogItem(BacklogItem backlogItem) {
        this.getBacklogItems()
            .add(backlogItem);
    }

    public void removeBacklogItemById(Long id) {
        BacklogItem bli = this.getBacklogItemById(id);
        this.getBacklogItems().remove(bli);
    }

    public double getRemainingStoryPointsCommited() {
        return this.getBacklogItems()
                   .stream()
                   .mapToDouble(BacklogItem::getRemainingStorypoints)
                   .sum();
    }

    public List<BacklogItem> getBacklogItemByName(String name) {
        return this.getBacklogItems()
                   .stream()
                   .filter(bli -> bli.getName()
                                     .equals(name))
                   .collect(Collectors.toList());
    }

    public BacklogItem getBacklogItemById(Long id) {
        List<BacklogItem> blilist;
        blilist = this.getBacklogItems()
                      .stream()
                      .filter(bli -> bli.getId()==id)
                      .collect(Collectors.toList());
        if (blilist.size()!=1) {
            throw new IllegalArgumentException("Backlogitem #" + id + " not found in Sprint #" + this.id);
        }
        return blilist.get(0);
    }


}

package com.example.portsAndAdapters.adapter;

import com.example.portsAndAdapters.application.port.in.persistence.PersistenceAbstraction;
import com.example.portsAndAdapters.domain.model.aggregate.BacklogItem;
import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBean {

    private final PersistenceAbstraction<Sprint, com.example.portsAndAdapters.domain.model.base.BaseKey>
            sprintPersistenceAbstraction;
    private final PersistenceAbstraction<BacklogItem, com.example.portsAndAdapters.domain.model.base.BaseKey>
            backlogItemPersistenceAbstraction;

    public void testcrudservices() {
        Sprint sprint1 = Sprint.builder()
                               .name("Testsprint 01")
                               .build();

        Sprint sprint2 = Sprint.builder()
                               .name("Testsprint 02")
                               .build();


        Sprint sprint3 = Sprint.builder()
                               .name("Testsprint 03")
                               .build();

        BacklogItem bli1 = BacklogItem.builder()
                                      .name("bli 1")
                                      .storyPoints(1.1)
                                      .build();

        BacklogItem bli2 = BacklogItem.builder()
                                      .name("bli 1")
                                      .storyPoints(2.2)
                                      .build();

        BacklogItem bli3 = BacklogItem.builder()
                                      .name("bli 1")
                                      .storyPoints(3.3)
                                      .build();

        bli1.commitToSprint(sprint1);
        bli2.commitToSprint(sprint1);
        bli3.commitToSprint(sprint1);


        System.out.println("Saving Sprint id:" + sprint1.getKey() + " name; " + sprint1.getName());
        sprintPersistenceAbstraction.save(sprint1.getKey(), sprint1);

        System.out.println("Retrieving Sprint 1, committed story points = " +
                sprintPersistenceAbstraction.findByID(sprint1.getKey())
                                            .getTotalStoryPointsCommitted());

    }



}

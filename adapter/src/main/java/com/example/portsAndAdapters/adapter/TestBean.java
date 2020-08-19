package com.example.portsAndAdapters.adapter;

import com.example.portsAndAdapters.application.port.in.persistence.CRUDService;
import com.example.portsAndAdapters.domain.model.aggregate.BacklogItem;
import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBean {

    private final CRUDService<Sprint> sprintCRUDService;
    private final CRUDService<BacklogItem> backlogItemCRUDService;

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


        System.out.println("Saving Sprint id:" + sprint1.getId() + " name; " + sprint1.getName());
        sprintCRUDService.save(sprint1.getId(), sprint1);

        System.out.println("Retrieving Sprint 1, committed story points = " +
                sprintCRUDService.findByID(sprint1.getId())
                                 .getTotalStoryPointsCommitted());

    }

}

package com.example.portsAndAdapters.adapter;

import com.example.portsAndAdapters.application.port.in.persistence.PersistenceAbstraction;
import com.example.portsAndAdapters.domain.model.aggregate.BacklogItem;
import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBean {

    private final PersistenceAbstraction<Sprint, Long> sprintPersistenceAbstraction;
    private final PersistenceAbstraction<BacklogItem, Long> backlogItemPersistenceAbstraction;

    public void testcrudservices() {
        Sprint sprint1 = Sprint.builder()
                               .name("Testsprint 01")
                               .id(1L)
                               .build();

        Sprint sprint2 = Sprint.builder()
                               .name("Testsprint 02")
                               .id(2L)
                               .build();


        Sprint sprint3 = Sprint.builder()
                               .name("Testsprint 03")
                               .id(3L)
                               .build();

        BacklogItem bli1 = BacklogItem.builder()
                                      .name("bli 1")
                                      .id(1L)
                                      .build();

        BacklogItem bli2 = BacklogItem.builder()
                                      .name("bli 1")
                                      .id(2L)
                                      .build();

        BacklogItem bli3 = BacklogItem.builder()
                                      .name("bli 1")
                                      .id(3L)
                                      .build();

        System.out.println("Saving Sprint id:" + sprint1.getId() + " name; " + sprint1.getName());

        sprintPersistenceAbstraction.save(sprint1.getId(), sprint1);

        System.out.println("Retrieving Sprint 1 "+sprintPersistenceAbstraction.findByID(1L).getName());

    }

}

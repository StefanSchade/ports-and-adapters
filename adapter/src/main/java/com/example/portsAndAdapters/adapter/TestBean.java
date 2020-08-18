package com.example.portsAndAdapters.adapter;

import com.example.portsAndAdapters.application.port.in.persistence.CRUDService;
import com.example.portsAndAdapters.domain.model.aggregate.BacklogItem;
import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import com.example.portsAndAdapters.domain.model.base.BacklogItemStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBean {

    private final CRUDService<Sprint> sprintCRUDService;
    private final CRUDService<BacklogItem> backlogItemCRUDService;

    public void testcrudservices() {
        Sprint sprint = Sprint.builder()
                              .isClosed(false)
                              .isRunning(true)
                              .isStarted(true)
                              .name("Testsprint")
                              .build();

        BacklogItem bli = BacklogItem.builder()
                                     .itemName("bli 1")
                                     .remainingStorypoints(2.3)
                                     .status(BacklogItemStatus.COMMITED)
                                     .totalStorypoints(4.4)
                                     .build();
        System.out.println("Saving Sprint id:" + sprint.getId() + " name; " + sprint.getName());

        sprintCRUDService.save(sprint.getId(), sprint);
    }

}

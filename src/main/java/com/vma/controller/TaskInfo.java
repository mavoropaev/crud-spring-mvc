package com.vma.controller;

import com.vma.domain.Status;

public class TaskInfo {
    private String description;
    //private Status status;
    private Integer status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

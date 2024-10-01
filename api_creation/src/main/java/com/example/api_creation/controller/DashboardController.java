package com.example.api_creation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_creation.model.Dashboard;
import com.example.api_creation.repository.DashboardRepository;

@RestController
public class DashboardController {

    @Autowired
    private DashboardRepository dashboardRepository;

    @GetMapping("/dashboards")
    public List<Dashboard> getDashboards() {
        System.out.println("Fetching dashboards...");
        return dashboardRepository.findAll();
    }
}
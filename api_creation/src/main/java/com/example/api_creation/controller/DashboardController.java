package com.example.api_creation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_creation.model.Dashboard;
import com.example.api_creation.repository.DashboardRepository;

@RestController
@RequestMapping("/dashboards")
public class DashboardController {

    @Autowired
    private DashboardRepository dashboardRepository;

    @GetMapping
    public List<Dashboard> getDashboards() {
        List<Dashboard> dashboards = dashboardRepository.findAll();
        System.out.println("Fetching dashboards: " + dashboards);
        return dashboards;
    }
}
package com.example.api_creation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_creation.model.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
}
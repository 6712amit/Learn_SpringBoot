package com.secondproject_restapi.restpi_demo.services;

import java.util.List;

import com.secondproject_restapi.restpi_demo.entities.Job;

public interface jobService {
 List<Job> getAllJobs();
 void createJob(Job job);
Job getJobById(int jobid);
String deleteJobById(int jobid);
Job UpdateJob(Job job);
}

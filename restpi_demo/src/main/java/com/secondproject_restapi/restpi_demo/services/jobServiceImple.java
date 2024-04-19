package com.secondproject_restapi.restpi_demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.secondproject_restapi.restpi_demo.entities.Job;


@Service
public class jobServiceImple implements jobService{
List<Job> jobs = new ArrayList<>();
int id =1;

    @Override
    public List<Job> getAllJobs() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(id++);
       jobs.add(job);
    }

    @Override
    public Job getJobById(int jobid) {
      for(Job job:jobs) {
        if(job.getId() == jobid){
            return job;
        }
      }
      return null;
    }

    @Override
    public String deleteJobById(int jobid) {
        for(Job job:jobs){
            if(job.getId() == jobid){
                jobs.remove(job);
                return "job deleted";
            }
        }
        return "job not found";
    }

    @Override
    public Job UpdateJob(Job job) {
        int jobid=job.getId();
        for(Job j:jobs){
            if(j.getId()==jobid){
                jobs.remove(j);
                jobs.add(job);
                return job;
            }
        }
      return null;
    }
    

}

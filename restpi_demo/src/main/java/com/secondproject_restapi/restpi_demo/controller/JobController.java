package com.secondproject_restapi.restpi_demo.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.secondproject_restapi.restpi_demo.entities.Job;
import com.secondproject_restapi.restpi_demo.services.jobService;


@RestController
// @RequestMappping("/jobs")    // when used at class level it set base url for all the request that are handeling the requests in that perticular urls. since here "/jobs" is base url here so we can remove this base url from all mappings at method level and rest  keep as it is
public class JobController {
private jobService jobserv;

public JobController(jobService jobserv) {
    this.jobserv = jobserv;
}

@GetMapping("/Jobs")
public ResponseEntity<List<Job>> getAllJobs(){
    return ResponseEntity.ok(jobserv.getAllJobs());
}

@PostMapping("/creatJob")
// public String createJob(@RequestBody Job job){
    public ResponseEntity<String> createJob(@RequestBody Job job){
    jobserv.createJob(job);
    return new ResponseEntity<String>("job created successfully", HttpStatus.CREATED);
}

@GetMapping("/Job/{jobid}")
public ResponseEntity<Job> getJobById(@PathVariable int jobid){

    Job job=jobserv.getJobById(jobid);
    if (job!=null) {
        return new ResponseEntity<>(job, HttpStatus.OK);
    }
    return new ResponseEntity<>( HttpStatus.NOT_FOUND);
}

@DeleteMapping("/job/{jobid}")
public ResponseEntity<String> deleteJobById(@PathVariable int jobid){
  String result = jobserv.deleteJobById(jobid); 
  if(result=="job deleted"){
     return new ResponseEntity<>(result, HttpStatus.OK);
  }
  return new ResponseEntity<>(result,HttpStatus.NOT_FOUND);
}

// we can also use  this way as commented below
// @PutMapping("/job/update/{id}")
// public ResponseEntity<String> updateJob(@PathVariable int id, @RequestBody Job job){

// instead of put/get/update/delete mapping we can use @requestMapping(value="/jobs/{id}", method= RequestMethod.PUT)
@PutMapping("/job/update")
public ResponseEntity<Job> UpdateJobById(@RequestBody Job job){
    Job result = jobserv.UpdateJob(job); 
    return new ResponseEntity<>(result, HttpStatus.CREATED);

}

}

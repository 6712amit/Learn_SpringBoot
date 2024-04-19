package com.secondproject_restapi.restpi_demo.entities;

public class Job {
private int id;
private String Jobname;
private String description;
private String location;
private String maxSalary;
private String minSalary;

public int getId() {
    return id;
}

public void setId(int id2) {
    this.id = id2;
}

public String getJobname() {
    return Jobname;
}

public void setJobname(String jobname) {
    Jobname = jobname;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}

public String getMaxSalary() {
    return maxSalary;
}

public void setMaxSalary(String maxSalary) {
    this.maxSalary = maxSalary;
}

public String getMinSalary() {
    return minSalary;
}

public void setMinSalary(String minSalary) {
    this.minSalary = minSalary;
}

public Job(int id, String jobname, String description, String location, String maxSalary, String minSalary) {
    this.id = id;
    Jobname = jobname;
    this.description = description;
    this.location = location;
    this.maxSalary = maxSalary;
    this.minSalary = minSalary;
}


}

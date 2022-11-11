package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min=4, max=100, message = "Must be between 4 and 100 characters")
    private String location;
    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();


    public Employer() {}

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;

    }

 //   public List<Job> getJobs() {
 //       return jobs;
    }

//    public void setJobs(List<Job> jobs) {
 //       this.jobs = jobs;
//    }

//}

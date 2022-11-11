package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Field required")
    @Size(min =4, max = 100, message = "Minimum of at least 4 characters")
    private String description;
      @ManyToMany(mappedBy="skills")
      private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(String description) {
        super();
        this.description = description;

    }

    public List<Job> getJobs() {
        return jobs;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
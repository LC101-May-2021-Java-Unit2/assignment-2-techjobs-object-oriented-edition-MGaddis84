package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job () {
        id = nextId;
        nextId++;
    }

    public Job (String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = anEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
        String nameOutput = null;
        if (name == null) {
            nameOutput = "Data not available";
        }else {
            nameOutput = name;
        }
        String employerOutput = null;
        if (employer == null || employer.toString().equals("")) {
            employerOutput = "Data not available";
        }else {
            employerOutput = employer.toString();
        }
        String locationOutput = null;
        if (location == null) {
            locationOutput = "Data not available";
        }else {
            locationOutput = location.toString();
        }
        String positionTypeOutput = null;
        if (positionType == null || positionType.toString().equals("")) {
            positionTypeOutput = "Data not available";
        }else {
            positionTypeOutput = positionType.toString();
        }
        String coreCompetencyOutput = null;
        if (coreCompetency == null) {
            coreCompetencyOutput = "Data not available";
        }else {
            coreCompetencyOutput = coreCompetency.toString();
        }

        return String.format('\n' + "ID: " + id + "\n" + "Name: " + nameOutput + "\n" + "Employer: " + employerOutput +"\n" + "Location: " + locationOutput
                + "\n" + "Position Type: " + positionTypeOutput + "\n" + "Core Competency: " + coreCompetencyOutput + '\n');
    }
}
package br.com.dio.challenge.domain;


public class Course  extends Content{

    private int workload;

    @Override
    public double computeTotalExperience() {
        return DEFAULT_XP + workload;
    }

    public Course() {

    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return " Course { " + 
        " Title  " + "'" + getTitle() + "'"  + 
        ", Description " +  getDescription() + '\'' +
        ", Workload = " +  workload +  " Hours }";
    }

}

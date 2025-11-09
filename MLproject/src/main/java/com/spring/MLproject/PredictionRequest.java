package com.spring.MLproject;

public class PredictionRequest{
    private String gender;
    private String ethnicity;
    private String parental_level_of_education;
    private String lunch;
    private String test_preparation_course;
    private double reading_score;
    private double writing_score;

    // Getters and setters
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getEthnicity() { return ethnicity; }
    public void setEthnicity(String ethnicity) { this.ethnicity = ethnicity; }

    public String getParental_level_of_education() { return parental_level_of_education; }
    public void setParental_level_of_education(String parental_level_of_education) {
        this.parental_level_of_education = parental_level_of_education;
    }

    public String getLunch() { return lunch; }
    public void setLunch(String lunch) { this.lunch = lunch; }

    public String getTest_preparation_course() { return test_preparation_course; }
    public void setTest_preparation_course(String test_preparation_course) {
        this.test_preparation_course = test_preparation_course;
    }

    public double getReading_score() { return reading_score; }
    public void setReading_score(double reading_score) { this.reading_score = reading_score; }

    public double getWriting_score() { return writing_score; }
    public void setWriting_score(double writing_score) { this.writing_score = writing_score; }
}

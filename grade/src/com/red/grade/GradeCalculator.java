package com.red.grade;


import com.professor.ds.model.GPA;
import com.professor.ds.facade.IDeveloper;
import com.professor.ds.facade.IGrade;


public class GradeCalculator implements IGrade, IDeveloper
{
    public String getMidSemesterGrade(final float score) {
        return null;
    }
    
    public GPA getGPA(final float score) {
        GPA gpa = null;
        if (score >= 90.0f) {
            gpa = new GPA(score, "A", 4.0f);
        }
        else if (score >= 80.0f) {
            gpa = new GPA(score, "B", 3.0f);
        }
        else if (score >= 70.0f) {
            gpa = new GPA(score, "C", 2.0f);
        }
        else if (score >= 55.0f) {
            gpa = new GPA(score, "D", 1.0f);
        }
        return gpa;
    }
    
    public String getEmailAddress() {
        return "joshua.carpentier@mail.citytech.cuny.edu";
    }
    
    public String getFullName() {
        return "Joshua Carpentier";
    }
}

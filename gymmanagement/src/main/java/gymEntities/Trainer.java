/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymEntities;

/**
 *
 * @author ACER TRAVELMATE
 */
public final class Trainer {
    private String name;
    private int experienceYears;

    public Trainer(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

}

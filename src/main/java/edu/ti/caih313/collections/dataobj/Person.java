package edu.ti.caih313.collections.dataobj;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class Person {
    private Name name;
    private Gender gender;

    private EmailAddress emailAddress;

    private LocalDate birthDate;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        Period ageNow = Period.between(birthDate, LocalDate.now());
        return ageNow.getYears();
    }

    // TODO -- implement toString with String.format 10 points
    @Override
    public String toString() {

        String primaryEmailAddress;
        if (emailAddress == null)
        {
            primaryEmailAddress = "no emails available";
        }
        else {
            primaryEmailAddress = emailAddress.getEmailAddress();
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d, yyyy 'CE'");
        String bday = birthDate.format(format);
        return String.format("Person{ name = %s, gender = %s, birthdate = %s, emails = %s", name, gender, bday, primaryEmailAddress);
    }
}

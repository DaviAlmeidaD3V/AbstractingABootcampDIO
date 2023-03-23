package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {
    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(45);
    private Set<Developer> registerDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Developer> getRegisterDevs() {
        return registerDevs;
    }

    public void setRegisterDevs(Set<Developer> registerDevs) {
        this.registerDevs = registerDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) 
        && Objects.equals(description, bootcamp.description)
        && Objects.equals(initialDate, bootcamp.initialDate) 
        && Objects.equals(finalDate, bootcamp.finalDate) 
        && Objects.equals(registerDevs, bootcamp.registerDevs) 
        && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, registerDevs, contents);
    }
}

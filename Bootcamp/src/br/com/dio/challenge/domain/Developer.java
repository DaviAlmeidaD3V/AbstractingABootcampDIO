package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    

    private String name;
    private Set<Content> writedContents = new LinkedHashSet<>();
    private Set<Content> concludeContents = new LinkedHashSet<>();


    public void registerBootcamp(Bootcamp bootcamp) {
        this.writedContents.addAll(bootcamp.getContents());
        bootcamp.getRegisterDevs().add(this);
    }

    public void advance() {
        Optional<Content> content = this.writedContents.stream().findFirst(); 
        if (content.isPresent()) {
            this.concludeContents.add(content.get());
            this.writedContents.remove(content.get());
        }
        else {
            System.err.println("You is not Register in none content !");;
        }
    }

    public double computeTotalExperience() {
        return this.concludeContents.stream()
        .mapToDouble(content -> content.computeTotalExperience())
        .sum();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Set<Content> getWritedContents() {
        return writedContents;
    }

    public void setWritedContents(Set<Content> writedContents) {
        this.writedContents = writedContents;
    }

    public Set<Content> getConcludeContents() {
        return concludeContents;
    }

    public void setConcludeContents(Set<Content> concludeContents) {
        this.concludeContents = concludeContents;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer dev = (Developer) o;
        return Objects.equals(name, dev.name)
        && Objects.equals(writedContents, dev.writedContents) 
        && Objects.equals(concludeContents, dev.concludeContents); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, writedContents, concludeContents);
    }


}

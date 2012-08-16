package de.jbellmann.aspects;

public aspect NormalBeforeAspect {
    
    before() : execution(public String de.jbellmann.domain.Person.getName(..)){
        System.out.println("Before calling Person.getName()");
    }

}
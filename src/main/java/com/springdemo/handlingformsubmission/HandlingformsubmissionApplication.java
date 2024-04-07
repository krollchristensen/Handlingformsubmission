package com.springdemo.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Denne annotation markerer klassen som en Spring Boot-applikation.
// Spring Boot bruger denne annotation til at finde og initialisere konfiguration, komponent scanning, og i sidste ende starte applikationen.
@SpringBootApplication
public class HandlingformsubmissionApplication {

    public static void main(String[] args) {
        // Starter Spring Boot-applikationen.
        // SpringApplication.run metoden er en statisk metode, der tager applikationsklassen som det første argument,
        // efterfulgt af args-arrayet. Denne metode bootstrapper applikationen, starter Spring-applikationskonteksten,
        // og udfører den interne service som en webserver, så din applikation kan håndtere HTTP-anmodninger.
        SpringApplication.run(HandlingformsubmissionApplication.class, args);
    }

}

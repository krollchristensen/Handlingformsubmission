package com.springdemo.handlingformsubmission;
//MODEL
// Definerer Greeting-modellen med to egenskaber: id og indhold.
public class Greeting {

  private long id; // Unikt identifikator for en hilsen. Bruges til at skelne mellem forskellige Greeting-objekter.
  private String content; // Indholdet af hilsenbeskeden. Denne tekst er det, der vil blive vist for brugeren.

  // Getter for id.
  // Denne metode returnerer id'et for Greeting-objektet.
  // Getters bruges til at hente værdien af en egenskab.
  public long getId() {
    return id;
  }

  // Setter for id. Tillader indstilling af id for en hilsen.
  // Denne metode sætter id'et for Greeting-objektet.
  // Setters bruges til at indstille eller opdatere værdien af en egenskab.
  public void setId(long id) {
    this.id = id;
  }

  // Getter for content.
  // Denne metode returnerer indholdsteksten for Greeting-objektet.
  // Bruges til at hente indholdet, så det kan vises for brugeren eller anvendes andetsteds i applikationen.
  public String getContent() {
    return content;
  }

  // Setter for content. Tillader indstilling af beskedindholdet for en hilsen.
  // Denne metode sætter indholdsteksten for Greeting-objektet.
  // Dette er nyttigt, når en bruger indsender en formular, og indholdet skal opdateres til det, brugeren har indtastet.
  public void setContent(String content) {
    this.content = content;
  }

}

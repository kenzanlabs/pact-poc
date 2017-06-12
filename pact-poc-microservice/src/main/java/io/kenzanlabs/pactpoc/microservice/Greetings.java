package io.kenzanlabs.pactpoc.microservice;

public class Greetings {

  private String salutation = "Mr.";
  private String name;

  public Greetings(String salutation, String name) {
    this.salutation = salutation;
    this.name = name;
  }

  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Greetings [salutation=" + salutation + ", name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((salutation == null) ? 0 : salutation.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Greetings other = (Greetings) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (salutation == null) {
      if (other.salutation != null)
        return false;
    } else if (!salutation.equals(other.salutation))
      return false;
    return true;
  }

}

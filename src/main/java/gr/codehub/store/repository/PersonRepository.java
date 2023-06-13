package gr.codehub.store.repository;

import gr.codehub.store.model.Person;

import java.util.List;

public interface PersonRepository {
    //CRUD  create read update delete

    int createPerson(String name);
    Person readPerson(int id);
    List<Person> readPerson();
    void updatePerson(int id, String name);
    boolean deletePerson(int id);
}

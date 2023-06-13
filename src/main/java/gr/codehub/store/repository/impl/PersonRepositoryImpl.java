package gr.codehub.store.repository.impl;

import gr.codehub.store.model.Person;
import gr.codehub.store.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    private final List<Person> persons ;
    private int personCounter;
    public PersonRepositoryImpl() {
        persons = new ArrayList<>();
    }

    @Override
    public int createPerson(String name) {
        personCounter++;
        Person person = new Person();
        person.setId(personCounter);
        person.setName(name);
        persons.add(person);
        return personCounter;
    }

    @Override
    public Person readPerson(int id) {
        for(Person p:persons){
            if (p.getId() == id)
                    return p;
        }
        return null;
    }

    @Override
    public List<Person> readPerson() {
        return persons;
    }

    @Override
    public void updatePerson(int id, String name) {
        Person person = readPerson(id);
        if(person != null) {
            person.setName(name);
        }
    }

    @Override
    public boolean deletePerson(int id) {
        Person person = readPerson(id);
        if(person != null) {
            persons.remove(person);
            return true;
        }
        return false;
    }
}

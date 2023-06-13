package gr.codehub.store.service.impl;

import gr.codehub.store.model.Person;
import gr.codehub.store.repository.PersonRepository;
import gr.codehub.store.repository.impl.PersonRepositoryImpl;
import gr.codehub.store.service.HrService;

import java.util.List;

public class HrServiceImpl implements HrService {
    private PersonRepository personRepository;
    public HrServiceImpl(){
        personRepository = new PersonRepositoryImpl();
    }


    @Override
    public void insertData() {
        String name="Dimos";
        personRepository.createPerson(name);

        String name2 = "Dimitra";
        personRepository.createPerson(name2);
    }

    @Override
    public void deleteData() {
        personRepository.deletePerson(1);
    }

    @Override
    public void printData() {

        List<Person> persons = personRepository.readPerson();

        for(Person p:persons){
            System.out.println("id= "+p.getId() + " name=" +p.getName());
        }
    }
}

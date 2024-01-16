package MappingDemo1.Mapping.Demo1.Service;

import MappingDemo1.Mapping.Demo1.Model.Passport;
import MappingDemo1.Mapping.Demo1.Model.Person;
import MappingDemo1.Mapping.Demo1.Payload.PersonPassport;
import MappingDemo1.Mapping.Demo1.Repository.PassportRepository;
import MappingDemo1.Mapping.Demo1.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PassportRepository passportRepository;

    public void saveData(PersonPassport temp){
        Person p1 = new Person();

        Passport pass = new Passport();

        p1.setPersonName(temp.getPersonName());
        p1.setPersonAge(temp.getPersonAge());
        p1.setPersonSalary(temp.getPersonSalary());

        pass.setPassportNumber(temp.getPassportNumber());
        pass.setCountry(temp.getCountry());

        p1.setPassRef(pass);

        personRepository.save(p1);

    }

    public List<Person> getData(){
       return personRepository.findAll();
    }

    public List<Passport> getPassportInfo(){
        return passportRepository.findAll();
    }

}

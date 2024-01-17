package MappingDemo1.Mapping.Demo1.Controller;

import MappingDemo1.Mapping.Demo1.Model.Passport;
import MappingDemo1.Mapping.Demo1.Model.Person;
import MappingDemo1.Mapping.Demo1.Payload.PersonPassport;
import MappingDemo1.Mapping.Demo1.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonPassportController {
    @Autowired
    private Service service;
    @PostMapping("/saveData")
    public void saveInfo(@RequestBody PersonPassport temp){
        service.saveData(temp);

    }
    @GetMapping("/getData")
    public List<Person> getData(){
        return service.getData();

    }
    @GetMapping("/getPassportInfo")
    public List<Passport> getPassportInfo(){
        return service.getPassportInfo();
    }
    @GetMapping("/getPersonObject")
    public Person getPersonObject(@RequestParam("id") int id){
      return  service.getPersonDataById(id);
    }
    @PutMapping("/updatePassportCountry/{pId}/{country}")
    public void updatePassportCountry(@PathVariable int pId ,@PathVariable String country){
        service.updatePassportCountry(pId,country);

    }
    @DeleteMapping("/deleteById/{perId}")
    public void deleteById(@PathVariable(name = "perId") int id ){
        service.deleteById(id);
    }
}

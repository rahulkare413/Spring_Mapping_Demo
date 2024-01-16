package MappingDemo1.Mapping.Demo1.Repository;

import MappingDemo1.Mapping.Demo1.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person , Integer> {

}

package MappingDemo1.Mapping.Demo1.Repository;

import MappingDemo1.Mapping.Demo1.Model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer> {
}

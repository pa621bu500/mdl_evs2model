package org.pabuff.model;

//Spring Boot 2.5+

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReadingIwowRepo extends CrudRepository<MeterReadingIwowModel, Long> {
//Spring Boot 3.0+
//ListCrudRepository<MeterReadingModel, Long> {
}

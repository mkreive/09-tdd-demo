package lt.javau5.testdemo.repository;

import lt.javau5.testdemo.entity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {
}

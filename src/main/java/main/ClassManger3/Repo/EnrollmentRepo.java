package main.ClassManger3.Repo;

import main.ClassManger3.Entity.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepo extends JpaRepository<EnrollmentEntity, Long> {
}

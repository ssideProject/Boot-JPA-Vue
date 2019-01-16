package demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.user.domain.BowlUser;

public interface BowlUserRepository extends JpaRepository<BowlUser, String>{

}

package keeper.log4j.attack.repository;

import keeper.log4j.attack.entity.AttackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttackRepository extends JpaRepository<AttackEntity, Long> {


}


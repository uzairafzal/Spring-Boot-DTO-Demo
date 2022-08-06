package net.javaDto.springdto.repository;

import net.javaDto.springdto.model.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {


}

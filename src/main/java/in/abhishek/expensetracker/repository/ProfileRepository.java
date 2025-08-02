package in.abhishek.expensetracker.repository;

import in.abhishek.expensetracker.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity , Long> {

    //select * from tbl_profiles where email = ?
    Optional<ProfileEntity> findByEmail(String email);

    //select * from tbl_profiles where activationToken = ?
    Optional<ProfileEntity> findByActivationToken(String activationToken);
}

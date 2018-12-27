package com.user.user.repository;

import com.user.user.model.Movie;
import com.user.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findById(int id);

    @Query(value = "SELECT id_movie from movie_user_map where id_user = :id", nativeQuery = true)
    List<Integer> getBestMovies(@Param("id") int id);
}

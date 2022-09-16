package com.test.reddin.Repository;

import com.test.reddin.Entity.SubReddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRedditRepository extends JpaRepository<SubReddit,Long> {
}

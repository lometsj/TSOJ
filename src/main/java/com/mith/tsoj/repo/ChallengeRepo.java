package com.mith.tsoj.repo;

import com.mith.tsoj.entity.ChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepo extends JpaRepository <ChallengeEntity,Long> {


}

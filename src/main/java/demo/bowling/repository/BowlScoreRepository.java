package demo.bowling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.bowling.domain.BowlScore;

public interface BowlScoreRepository extends JpaRepository<BowlScore, Integer>{

}

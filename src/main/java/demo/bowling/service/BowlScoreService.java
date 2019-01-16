package demo.bowling.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import demo.bowling.domain.BowlScore;
import demo.bowling.repository.BowlScoreRepository;

@Service
@Transactional // 메소드가 호출 될때 트랜잭션 관리가 되도록 사용한다.
public class BowlScoreService {
	
	@Autowired
	BowlScoreRepository bowlScoreRepository;
	
	// usable page
	public Page<BowlScore> findAll(Pageable pageable) {
		return bowlScoreRepository.findAll(pageable);
	}
	
/*	public List<BowlScore> findAll() {
		return bowlScoreRepository.findAll();
	}*/
	
	public BowlScore getOne(Integer id) {
		return bowlScoreRepository.getOne(id);
	}
	
	public BowlScore create(BowlScore bowlScore) {
		return bowlScoreRepository.save(bowlScore);
	}
	
	public BowlScore update(BowlScore bowlScore) {
		return bowlScoreRepository.save(bowlScore);
	}
	
	public void delete(Integer id) {
		bowlScoreRepository.deleteById(id);
	}
}

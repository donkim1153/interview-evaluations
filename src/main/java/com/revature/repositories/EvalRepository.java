package com.revature.repositories;

import java.util.ArrayList;


import com.revature.domain.Eval;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvalRepository extends PagingAndSortingRepository<Eval, Integer> {

	Page<Eval> findAllByBatchId(Pageable pageable, int id);
	
	Page<Eval> findAllByBatchIdAndEvalTypeDescriptionIgnoreCase(Pageable pageable, int id, String type);
	
	Page<Eval> findAllByBatchIdAndWeek(Pageable pageable, int id, int num);
	
	Page<Eval> findAllByBatchIdAndWeekAndEvalTypeDescriptionIgnoreCase(Pageable pageable, int id, int num, String type);
	
	Page<Eval> findAllByTraineeId(Pageable pageable, int id);
	
	Page<Eval> findAllByTraineeIdAndEvalTypeDescriptionIgnoreCase(Pageable pageable, int id, String type);
	
	Page<Eval> findAllByTraineeIdAndWeek(Pageable pageable, int id, int num);
	
	Page<Eval> findAllByTraineeIdAndWeekAndEvalTypeDescriptionIgnoreCase(Pageable pageable, int id, int num, String type);

}

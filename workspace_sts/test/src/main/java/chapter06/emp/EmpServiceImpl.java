package chapter06.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDAO dao;
	
	@Override
	public List<EmpVO> list() {
		return dao.list();
		
	}

}
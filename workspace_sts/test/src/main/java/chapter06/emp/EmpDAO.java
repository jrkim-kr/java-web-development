package chapter06.emp;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
	// SqlSessionTemplate 주입
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<EmpVO> list() {
		List<EmpVO> list = sst.selectList("emp.empList");
		return list;
	}
}

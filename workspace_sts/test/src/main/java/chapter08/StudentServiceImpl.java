package chapter08;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper mapper;

	@Override
	public Map<String, Object> list(StudentVO vo) {
		List<StudentVO> list = mapper.list(vo);
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("count", mapper.count(vo));
		return map;
	}

	@Override
	@Transactional
	public void insert(StudentVO vo) {
		System.out.println(vo); // 파라미터가 담긴 vo
		mapper.insert(vo); // 학생 등록
		System.out.println(vo); // 파라미터가 담긴 vo + PK(studno) 추가

		for (String hobby : vo.getHobbyName()) {
			HobbyVO hvo = new HobbyVO();
			hvo.setStudno(vo.getStudno());
			hvo.setName(hobby);
			mapper.insertHobby(hvo);
		}

	}

}
package chapter07;

import java.util.Map;

/*================================================
 * [1] 서비스 인터페이스 정의
 *================================================*/
public interface StudentService {
    // → 학생 목록 조회와 검색을 위한 메서드 선언
    // → 반환값은 목록과 총 개수를 담은 Map
    Map<String, Object> list(StudentVO vo);

    // → 학생 정보 등록을 위한 메서드 선언
    // → 취미 정보도 함께 등록됨
    void insert(StudentVO vo);
}
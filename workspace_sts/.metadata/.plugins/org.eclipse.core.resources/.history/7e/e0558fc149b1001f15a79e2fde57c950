package chapter07;

import java.sql.Timestamp;

import lombok.Data;

/*================================================
* [1] StudentVO (학생 정보를 담는 Value Object)
*================================================*/
@Data   // ★ Lombok: Getter/Setter/toString 등 자동 생성
public class StudentVO {
   // → 기본 학생 정보 필드
   private int studno;      // 학번
   private String name;     // 이름
   private String id;       // 아이디
   private int grade;       // 학년
   private String jumin;    // 주민번호
   private Timestamp birthday;  // 생년월일
   private String tel;      // 전화번호
   private int height;      // 키
   private int weight;      // 몸무게
   private int major1;      // 전공1
   private int major2;      // 전공2
   private int profno;      // 지도교수번호

   // → 검색 관련 필드
   private String searchType;    // 검색 유형
   private String searchWord;    // 검색어
   private String profname;      // 교수명
   private int searchGrade;      // 검색할 학년
   private int[] searchMajor;    // 검색할 전공

   // → 취미 관련 필드
   private String[] hobbyName;   // 취미명 배열
}
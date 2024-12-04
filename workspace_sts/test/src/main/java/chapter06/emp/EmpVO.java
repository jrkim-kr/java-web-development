package chapter06.emp;

import java.sql.Date;

import lombok.Data;

@Data
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}

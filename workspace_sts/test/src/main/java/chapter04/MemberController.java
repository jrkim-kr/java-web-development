package chapter04;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class MemberController {
	
	// GET방식으로 /test.do -> /WEB-INF/views/test.jsp 포워딩
	@GetMapping("/test.do")
	public String test() {
		System.out.println("test");
		return "a/test";
	}
	
	@GetMapping("/test2.do")
	public String test2() {
		System.out.println("test2");
		return "test";
	}
	
	@PostMapping("/test3.do")
	public String test3() {
		return "";
	}
	// get, post... 모든 method 가능
	// 만약 특정 method만 가능하게하려면 method 속성 사용
	@RequestMapping(value="/test4.do", method=RequestMethod.POST)
	public String test4() {
		return "test";
	}
	
	// 응답
	// String -> prefix + 문자열 + suffix 포워딩
	// void -> prefix + 접속 url + suffix 포워딩
	@GetMapping("/home.do") 
	public void home() {
		// url : /user/home.do -> /WEB-INF/views/user/home.do
	}
	
	// 리다이렉트
	// /user/test5.do -> /user/test.do
	
	@GetMapping("/test5.do")
	public String test5() {
//		return "redirect:/user/test.do"; // 절대경로(컨텟스트패스X)
//		return "redirect: /test/user/test.do"; // 절대경로(컨텟스트패스O) -> : 뒤에 공백 있음
		return "redirect:test.do"; // 상대경로
	}
	
	// 파라미터 받는 방법
	// 1, HttpServletRequest
	@GetMapping("/test6.do")
	public void test6(HttpServletRequest request, HttpServletResponse response)	{
		String id = request.getParameter("id");
		System.out.println("id : " + id);
	}
	
	
	// 2. @RequestParam
	@GetMapping("/test7.do")
	public void test7(@RequestParam(value = "idx", required = false) String id,
							@RequestParam(required = false, defaultValue = "0") int age) {
		System.out.println("id : " + id);
		System.out.println("age : " + age);
		String idx;
	}
	
	// 3. @ModelAttribute
	@GetMapping({"/member/form.do","/member/form2.do"})
	public String memberForm() {
		System.out.println("member/form.do");
		return "member/form";
	}
	@PostMapping("/member/regist.do")
	public String memberRegist(@ModelAttribute MemberVO vo,
										@RequestParam Map<String, Object> map,
										HttpServletRequest request) {
		System.out.println("member/regist.do");
		System.out.println(vo);
		System.out.println(map);
		request.setAttribute("map",map);
		return "member/form";
	}
	
	// 4. PathVariable
	@GetMapping("/member/{id}")
	public void path(@PathVariable String id) {
		System.out.println("id : " + id);
	}
	
	
	// 자장 -> request, Model, ModelAndView
	// 포워딩되는 jsp(뷰)에서 사용하기 위함
	// 예제 : test8.do?v=3 -> 9 출력
	@GetMapping("/test8.do")
	public ModelAndView test8(@RequestParam int v, 
										HttpServletRequest req,
										Model model, 
										HttpSession sess
										) {
		int v2 = v * v;  
		
		req.setAttribute("v3", v2);  //request 영역에 저장
		model.addAttribute("v4", v2);  //request 영역에 저장
		ModelAndView mav = new ModelAndView("test8");
		mav.addObject("v5", v2);  //request 영역에 저장
		sess.setAttribute("v6", v2);
		
		return mav;
	}
	
	
	@GetMapping("/test9.do")
	@ResponseBody
	public MemberVO[] test9() {
		
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setName("gildong");
		
		MemberVO[] arr = {vo, vo, vo};
		
		Map<String, Object> map = new HashMap<>();
		map.put("page", 1);
		map.put("searchWord", "java");
		map.put("list", arr);
		return arr;
	}
	
}

package chapter10.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadController {
	
	@GetMapping("/download.do")
	public void download(HttpServletRequest request, HttpServletResponse response) {
		
		
	}
	
}
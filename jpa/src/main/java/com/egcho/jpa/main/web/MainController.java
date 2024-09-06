package com.egcho.jpa.main.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {

	@GetMapping("/")
	public String index() {
		return test("A", "B", "C", "D", "E", "F");
	}

	private String test(String... args) {
		String result = "";
		for (String arg : args) {
			result += switch (arg) {
			case "A" -> "aaa";
			case "B", "C" -> "bbb or ccc";
			case "D" -> "ddd";
			default -> "default";
			};
		}
		
		String escapedText = "Hello\\nWorld";
		String translatedText = escapedText.translateEscapes();
		
		log.info("translatedText : " + translatedText);
		
		return result;
	}
	
	
}

package jenkin_pipeline.jenkin_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinPipelineApplication {
	@GetMapping("/message")
	public String getMessage()
	{
		return "Jai Shree Ram";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinPipelineApplication.class, args);
	}

}

package hello.service;

import org.springframework.stereotype.Service;

@Service
public class ActualService implements SomeService {

	@Override
	public String getAValue() {
		return "from the actual service";
	}

}

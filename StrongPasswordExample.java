import java.util.Collections;
import java.util.HashMap;

import org.mariuszadara.strongpassword.api.StrongPasswordEstimatorFactory;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordGeneratorFactory;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordScorerFactory;

public class StrongPasswordExample {

	public static void main(String[] args) {
		
		var exitCode = 0;
		
		try {
			var options = new StrongPasswordOptions();
			var generator = StrongPasswordGeneratorFactory.make();

			var passwords = generator.generatePasswords(options);
			
			if (!passwords.isEmpty()) {
				
				var scorer = StrongPasswordScorerFactory.make();
				var estimator = StrongPasswordEstimatorFactory.make();

				var scores = new HashMap<String, Long>();
				var times = new HashMap<String, Double>();
				
				passwords.forEach(password -> {
					scores.put(password, scorer.computeScore(options, password));
					times.put(password, estimator.estimateDecodeTime(options, password));
				});
				
				Collections.sort(passwords, (password1, password2) -> {
					var score1 = scores.get(password1);
					var score2 = scores.get(password2);
					
					if (score1 != score2) {
						return score1 > score2 ? -1 : 1;
					}
					
					var time1 = times.get(password1);
					var time2 = times.get(password2);
					
					return time1 > time2 ? -1: time1 < time2 ? 1 : 0;
				});
				
				for (String password : passwords) {
					System.out.println(String.format("password = %s - score = %d - time = %.0f", password, scores.get(password), times.get(password)));
				}
			}
		}
		catch (StrongPasswordException e) {
			e.printStackTrace();
			exitCode = e.getCode();
		}
		catch (Exception e) {
			e.printStackTrace();
			exitCode = 1;
		}
		
		System.exit(exitCode);
	}
}

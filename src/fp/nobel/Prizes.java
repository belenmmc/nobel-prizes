package fp.nobel;

import java.util.*;

public interface Prizes {
	
	void addPrize(Prize p);
	Collection<Prize> obtainPrizeGender(Gender g);
	Integer calculateNumberPrizesLess(Integer threshold);
	Map<String, Double> calculateAverageAgeCategory();
}

package fp.nobel;

import java.util.Collection;
import java.util.*;

public class PrizesLoop implements Prizes{

	private Set<Prize> prizes;
	
	public PrizesLoop( ) {
		prizes = new HashSet<Prize>();
	}

	public void addPrize(Prize p) {
		prizes.add(p);
	}

	public Collection<Prize> obtainPrizeGender(Gender g) {
		return null;
	}

	public Integer calculateNumberPrizesLess(Integer threshold) {
		return null;
	}

	public Map<String, Double> calculateAverageAgeCategory() {
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prizes == null) ? 0 : prizes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrizesLoop other = (PrizesLoop) obj;
		if (prizes == null) {
			if (other.prizes != null)
				return false;
		} else if (!prizes.equals(other.prizes))
			return false;
		return true;
	}
}

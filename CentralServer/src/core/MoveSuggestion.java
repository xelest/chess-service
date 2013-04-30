package core;

/**
 * The model for all suggestion of move (from databases or bots).
 * This class was abstract but I(clement) changed it.
 */
public abstract class MoveSuggestion {
	protected String move;
	
	/**
	 * Constructor
	 * @param move The move suggested.
	 */
	public MoveSuggestion(String move) {
		this.move = move;
	}
	
	/**
	 * @return The move suggested.
	 */
	public String getMove() {
		return this.move;
	}

	@Override
	public String toString() {
		return "MoveSuggestion [move=" + move + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((move == null) ? 0 : move.hashCode());
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
		MoveSuggestion other = (MoveSuggestion) obj;
		if (move == null) {
			if (other.move != null)
				return false;
		} else if (!move.equals(other.move))
			return false;
		return true;
	}
}
import java.awt.Color;

public interface ISpecialProcess {
	void decreasePriority();

	void decreaseBurstTime();
	
	boolean increaseWaitingTime();
	
	void resetWaitingTime();

	int getPid();

	Priority getPriority();

	int getBurstTime();
	
	ProcessBuilder getProcessBuilder();

	Color getColor();

	Statement getStatement();

	void setStatement(Statement statement);
}
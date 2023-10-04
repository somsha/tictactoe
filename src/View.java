import java.awt.event.ActionListener;

public interface View {

	void updateStatus(String s);

	String getButtonText(int i, int j);

	void setButtonText(int i, int j, String s);

	void addButtonActionListener(int i, int j, ActionListener actionListener);

}

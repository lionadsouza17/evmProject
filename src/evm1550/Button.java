package evm1550;

public abstract class Button 
{
	private boolean isPressed;

	public boolean isPressed() {
		return isPressed;
	}

	public void setPressed(boolean isPressed) {
		this.isPressed = isPressed;
	}
}

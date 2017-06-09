package evm1550;

public class Off extends SwitchCommand
{

	@Override
	public void working(Lamp lamp)
	{
		lamp.off(lamp.getClass().getSimpleName());
		
	}
	
}

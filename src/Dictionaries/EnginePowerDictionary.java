package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.EnginePowerEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class EnginePowerDictionary implements IDictionary<EnginePowerEnum> {
	
	public static String Description = "�������� ���������";
	
	public List<ValueDescription<EnginePowerEnum>> GetDescriptions()
	{
		List<ValueDescription<EnginePowerEnum>> result = new ArrayList<ValueDescription<EnginePowerEnum>>();
		
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.Up50,
				"�� 50 �.�"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From51To70,
				"�� 51 �� 70 �.�"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From71To100,
				"�� 71 �� 100 �.�"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From101To120,
				"�� 101 �� 120 �.�"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From121To150,
				"�� 121 �� 150 �.�"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From151AndOver,
				"�� 151 � �����"));
			
		return result;
	}
}
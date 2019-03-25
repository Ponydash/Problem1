package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.PersonsAllowedToDriveEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class PersonsAllowedToDriveDictionary implements IDictionary<PersonsAllowedToDriveEnum> {

	public String Description = "����������� ������������� ��������";

	public List<ValueDescription<PersonsAllowedToDriveEnum>> GetDescriptions() {
		List<ValueDescription<PersonsAllowedToDriveEnum>> result = new ArrayList<ValueDescription<PersonsAllowedToDriveEnum>>();

		result.add(new ValueDescription<PersonsAllowedToDriveEnum>(PersonsAllowedToDriveEnum.LimitedList,
				"������������ ������"));
		result.add(new ValueDescription<PersonsAllowedToDriveEnum>(PersonsAllowedToDriveEnum.AnyDrivers,
				"����� ��������"));

		return result;
	}
}
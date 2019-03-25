package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.PeriodOfUseEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class PeriodOfUseDictionary implements IDictionary<PeriodOfUseEnum> {

	public String Description = "������ �������������";

	public List<ValueDescription<PeriodOfUseEnum>> GetDescriptions() {
		List<ValueDescription<PeriodOfUseEnum>> result = new ArrayList<ValueDescription<PeriodOfUseEnum>>();

		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._1Year, "1 ���"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._9Month, "9 �������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._8Month, "8 �������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._7Month, "7 �������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._6Month, "6 �������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._5Month, "5 �������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._4Month, "4 ������"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._3Month, "3 ������"));

		return result;
	}
}

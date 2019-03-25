package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.InsurancePeriodEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class InsurancePeriodDictionary implements IDictionary<InsurancePeriodEnum> {

	public String Description = "������ �����������";

	public List<ValueDescription<InsurancePeriodEnum>> GetDescriptions() {
		List<ValueDescription<InsurancePeriodEnum>> result = new ArrayList<ValueDescription<InsurancePeriodEnum>>();

		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._1Year, "1 ���"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._9Month, "9 �������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._8Month, "8 �������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._7Month, "7 �������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._6Month, "6 �������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._5Month, "5 �������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._4Month, "4 ������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._3Month, "3 ������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._2Month, "2 ������"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._1Month, "1 �����"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._15Days, "15 ����"));

		return result;
	}
}

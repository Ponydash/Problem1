package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.VehicleTypeEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class VehicleTypeDictionary implements IDictionary<VehicleTypeEnum> {

	public String Description = "������������ ��������";

	public List<ValueDescription<VehicleTypeEnum>> GetDescriptions() {
		List<ValueDescription<VehicleTypeEnum>> result = new ArrayList<ValueDescription<VehicleTypeEnum>>();

		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.MotorcyclesAndScooters,
				"��������� � �����������"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.Cars, "�������� ����������"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CarsTaxi, "�������� ���������� - �����"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CargoVehiclesUpTo16tons,
				"�������� �� �� 16 ����"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CargoVehiclesOver16tons,
				"�������� �� ����� 16 ����"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesUpTo20seats, "�������� �� 20 ����"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesOver20seats, "�������� ����� 20 ����"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.TractorsAndOtherMachines,
				"�������� � ���� ������"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesTaxi, "�������� - �����"));

		return result;
	}
}

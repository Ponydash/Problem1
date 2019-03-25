package Services;

import java.util.ArrayList;
import java.util.List;

import Shared.AreaCreator;
import Shared.AreaDetails;
import Shared.RegionDetails;

public class AreaValueService {
	public List<AreaDetails> areas = new ArrayList<AreaDetails>();

	private void Add(AreaCreator areaCreator) {
		areas.add(areaCreator.Create());
	}

	public AreaValueService() {

		Add(new AreaCreator() {
			@Override
			public AreaDetails Create() {
				List<RegionDetails> regions = new ArrayList<RegionDetails>();

				regions.add(new RegionDetails(1, "������������", (float) 1.2));
				regions.add(new RegionDetails(2, "�����������", (float) 1.2));
				regions.add(new RegionDetails(3, "�������", (float) 1.1));
				regions.add(new RegionDetails(4, "��������", (float) 1.1));
				regions.add(new RegionDetails(5, "�������", (float) 1.1));
				regions.add(new RegionDetails(6, "�����������", (float) 1.3));
				regions.add(new RegionDetails(7, "�������", (float) 1.3));
				regions.add(new RegionDetails(8, "���", (float) 1.8));
				regions.add(new RegionDetails(9, "������ ������", (float) 1.0));

				return new AreaDetails(1, "���������� ������������", regions);
			}
		});

		Add(new AreaCreator() {
			@Override
			public AreaDetails Create() {
				List<RegionDetails> regions = new ArrayList<RegionDetails>();

				regions.add(new RegionDetails(1, "�����������", (float) 1.3));
				regions.add(new RegionDetails(2, "������������", (float) 1.3));
				regions.add(new RegionDetails(3, "����������", (float) 1.3));
				regions.add(new RegionDetails(4, "��������", (float) 1.0));
				regions.add(new RegionDetails(5, "�����������", (float) 1.0));
				regions.add(new RegionDetails(6, "���������", (float) 1.0));
				regions.add(new RegionDetails(7, "�������", (float) 1.2));
				regions.add(new RegionDetails(8, "������", (float) 2.0));
				regions.add(new RegionDetails(9, "���������� �����", (float) 1.7));
				regions.add(new RegionDetails(10, "������ ������", (float) 1.1));

				return new AreaDetails(2, "���������� ���������", regions);
			}
		});

	}

	public RegionDetails Get(int areaId, int regionId)
	{
		for (AreaDetails area : areas)
		{
			if (area.Id == areaId)
			{
				for(RegionDetails region : area.Regions)
				{
					if (region.Id == regionId)
					{
						return region;
					}
				}
			}
		}
		
		return null;
	}
	
	public AreaDetails Get(int areaId)
	{
		for (AreaDetails area : areas)
		{
			if (area.Id == areaId)
			{
				return area;
			}
		}
		
		return null;
	}
}

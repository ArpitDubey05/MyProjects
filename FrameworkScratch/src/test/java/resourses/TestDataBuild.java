package resourses;

import java.util.ArrayList;
import java.util.List;

import pojo.Location;
import pojo.Searializable;

public class TestDataBuild {

	public Searializable addPlacePayload()
	{
		System.out.println("Under given condition");
		 Searializable s=new Searializable();
			s.setAccuracy(50);
			s.setAddress("29, side layout, cohen 09");
			s.setLanguage("French-IN");
			s.setName("Frontline house");
			s.setPhone_number("(+91) 983 893 3937");
			s.setWebsite("http://google.com");
			Location l=new Location();
			
			l.setLat(-38.383494);
			l.setLng(33.427362);
			s.setLocation(l);
			
			List<String> list=new ArrayList<String>();
			list.add("shoe park");
			list.add("shop");
			s.setTypes(list);
			return s;
	}
}

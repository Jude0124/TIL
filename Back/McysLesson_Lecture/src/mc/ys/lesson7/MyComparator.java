package mc.ys.lesson7;

import java.util.Comparator;

public class MyComparator implements Comparator<GisaDataVO> {

	@Override
	public int compare(GisaDataVO o1, GisaDataVO o2) {
		
		int result = 0;
		result = (o2.getKorean() + o2.getEnglish()) - (o1.getKorean()+ o1.getEnglish());
		if(result==0) {
			result = o2.getStudentID() - o1.getStudentID();
		}
		return result;
	}

}

package  com.tns.placement.service;

import com.tns.placement.entities.College;

public interface ICollegeService {

	public College addCollege(College college);  // C
	public College updateCollege(College college); // U
	public College searchCollege(int id); // R
	public College deleteCollege(College college); // D
	
}

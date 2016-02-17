package cl.citymovil.optaplanner.dao;

import java.util.List;

import cl.citymovil.optaplanner.domain.LocationTmp;



public interface LocationTmpDAO {
	
	public List<LocationTmp> getTmpLocationList() throws Exception;
	
	public void updateTmpLocation(long LocationId);

    public void mergeTmpLocation(LocationTmp loc);
    
    public void persistTmpLocation(LocationTmp loc);
    
    public void deleteTmpLocation(LocationTmp loc) throws Exception;

}

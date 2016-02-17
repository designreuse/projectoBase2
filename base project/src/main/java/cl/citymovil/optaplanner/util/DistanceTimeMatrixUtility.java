package cl.citymovil.optaplanner.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.maps.model.DistanceMatrix;

import cl.citymovil.optaplanner.dao.LocationDAO;
import cl.citymovil.optaplanner.domain.DistanceTimeMatriz;
import cl.citymovil.optaplanner.domain.Location;

@Service
public class DistanceTimeMatrixUtility {
	
	
	
	public static final Logger log = LoggerFactory.getLogger(Location.class);

	public static Logger getLog() {
		return log;
	}
	
	private DistanceMatrix distanceMatrix;
	private String[] origen;
	private String[] destiny;
	private List <Long[]> idOriginDestiny=new ArrayList <Long[]>();
	
	
	

	public List<Long[]> getIdOriginDestiny() {
		return idOriginDestiny;
	}

	public void setIdOriginDestiny(List<Long[]> idOriginDestiny) {
		this.idOriginDestiny = idOriginDestiny;
	}

	public DistanceTimeMatrixUtility(){}
	
	public DistanceMatrix getDistanceMatrix() {
		return distanceMatrix;
	}
	public void setDistanceMatrix(DistanceMatrix distanceMatrix) {
		this.distanceMatrix = distanceMatrix;
	}
	public String[] getOrigen() {
		return origen;
	}
	public void setOrigen(String[] origen) {
		this.origen = origen;
	}
	public String[] getDestiny() {
		return destiny;
	}
	public void setDestiny(String[] destiny) {
		this.destiny = destiny;
	}


}

package streams_api.example_question.cooltrack;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DataCenterUtils {
    private Set<DataCenter> dataCenterSet = new LinkedHashSet<>();

    public Set<DataCenter> getDataCenterSet() {
        return dataCenterSet;
    }

    public void setDataCenterSet(Set<DataCenter> dataCenterSet) {
        this.dataCenterSet = dataCenterSet;
    }

    public void addDataCenter(DataCenter dataCenter){
        this.dataCenterSet.add(dataCenter);
    }

    public DataCenter getDataCenterById(String dataCenterId){
        for(DataCenter dataCenter : this.dataCenterSet){
            if(dataCenter.getDataCenterId().equals(dataCenterId)) return dataCenter;
        }
        System.out.println("Data Center not found for the id "+dataCenterId);
        return null;
    }

    public List<DataCenter> getDataCentersWithMaximumCollingPowerUsage(){
        double maxCoolingPowerUsage = 0.0;
        for(DataCenter dataCenter : this.dataCenterSet){
            if(dataCenter.getCoolingPowerUsage() > maxCoolingPowerUsage) maxCoolingPowerUsage = dataCenter.getCoolingPowerUsage();
        }
        List<DataCenter> dataCenterList = new ArrayList<>();
        for(DataCenter dataCenter : this.dataCenterSet){
            if(dataCenter.getCoolingPowerUsage() == maxCoolingPowerUsage){
                dataCenterList.add(dataCenter);
            }
        }
        return dataCenterList;
    }


}

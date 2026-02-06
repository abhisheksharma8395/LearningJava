package streams_api.example_question.cooltrack;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        DataCenterUtils dataCenterUtils = new DataCenterUtils();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of data centers to be added : ");
        int input = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < input; i++) {
            System.out.println("Enter data center details : ");
            String details = scanner.nextLine();
            String[] dataCenterDetails = details.split(":");
            DataCenter dataCenter = new DataCenter(dataCenterDetails[0], dataCenterDetails[1], dataCenterDetails[2], Double.parseDouble(dataCenterDetails[3]));
            dataCenterUtils.addDataCenter(dataCenter);
        }
        System.out.println("Enter the Data Center ID to get details : ");
        String dataCenterID = scanner.next();
        DataCenter dataCenter1 = dataCenterUtils.getDataCenterById(dataCenterID);
        if (dataCenter1 != null) System.out.println(dataCenter1);

        System.out.println("Data Centers with maximum colling power usage : ");
        List<DataCenter> dataCenterList = dataCenterUtils.getDataCentersWithMaximumCollingPowerUsage();
        for(DataCenter dataCenter2 : dataCenterList){
            System.out.println(dataCenter2);
        }
    }
}

package streams_api.example_question.NeuroQuantum;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Experiment 1 details : ");
        int experimentID1 = scanner.nextInt();
        scanner.nextLine();
        String experimentTitle1 = scanner.nextLine();
        String leadResearcher1 = scanner.nextLine();
        double fundingAmount1 = scanner.nextDouble();
        scanner.nextLine();
        String complexityLevel1 = scanner.nextLine();
        int initiationMonth1 = scanner.nextInt();
        int initiationYear1 = scanner.nextInt();
        ExperimentInfo experiment1 = new ExperimentInfo(experimentID1,experimentTitle1,leadResearcher1,fundingAmount1,complexityLevel1,initiationMonth1,initiationYear1);
        int activeMonth1 = Experiment.getMonthsActive(initiationMonth1,initiationYear1);
        double innovationScore1 = experiment1.calculateInnovationScore(activeMonth1);
        double resourceConsumption1 = experiment1.calculateResourceConsumption(activeMonth1);

        System.out.println("Enter Experiment 2 details : ");
        int experimentID2 = scanner.nextInt();
        scanner.nextLine();
        String experimentTitle2 = scanner.nextLine();
        String leadResearcher2 = scanner.nextLine();
        double fundingAmount2 = scanner.nextDouble();
        scanner.nextLine();
        String complexityLevel2 = scanner.nextLine();
        int initiationMonth2 = scanner.nextInt();
        int initiationYear2 = scanner.nextInt();
        ExperimentInfo experiment2 = new ExperimentInfo(experimentID2,experimentTitle2,leadResearcher2,fundingAmount2,complexityLevel2,initiationMonth2,initiationYear2);
        int activeMonth2 = Experiment.getMonthsActive(initiationMonth2,initiationYear2);
        double innovationScore2 = experiment2.calculateInnovationScore(activeMonth2);
        double resourceConsumption2 = experiment2.calculateResourceConsumption(activeMonth2);

        System.out.println("Experiment Summary : ");
        System.out.println(experiment1.experimentTitle+" by "+experiment1.leadResearcher);
        System.out.println("Month Active : "+activeMonth1);
        System.out.printf("Innovation Score : %.2f\n",innovationScore1);
        System.out.printf("Resource Consumption : %.2f\n",resourceConsumption1);

        System.out.println(experiment2.experimentTitle+" by "+experiment2.leadResearcher);
        System.out.println("Month Active : "+activeMonth2);
        System.out.printf("Innovation Score : %.2f\n",innovationScore2);
        System.out.printf("Resource Consumption : %.2f\n",resourceConsumption2);

        ExperimentInfo highImpactExperiment = experiment1.getHigherExperiment(experiment1,experiment2);
        System.out.println("Higher Impact Experiment Title : "+highImpactExperiment.experimentTitle);

    }
}

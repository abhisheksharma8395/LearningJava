package streams_api.example_question.NeuroQuantum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public interface Experiment {
    double calculateInnovationScore(int monthsActive);
    double calculateResourceConsumption(int monthsActive);
    default ExperimentInfo getHigherExperiment(ExperimentInfo e1, ExperimentInfo e2){
        if((e1.fundingAmount - e2.fundingAmount) >= 0) return e1;
        else return e2;
    }
    static int getMonthsActive(int initiationMonth,int initiationYear){
        LocalDate dateExperimentStarts = LocalDate.of(initiationYear,initiationMonth,1);
        LocalDate currentDate = LocalDate.now();
        int months = Math.toIntExact(ChronoUnit.MONTHS.between(dateExperimentStarts,currentDate));
        return months;
    }

}

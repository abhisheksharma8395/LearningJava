package streams_api.example_question.NeuroQuantum;

public class ExperimentInfo implements Experiment {
    int experimentId;
    String experimentTitle;
    String leadResearcher;
    double fundingAmount;
    String complexityLevel;
    int initiationMonth;
    int initiationYear;

    public ExperimentInfo(int experimentId, String experimentTitle, String leadResearcher, double fundingAmount, String complexityLevel, int initiationMonth, int initiationYear) {
        this.experimentId = experimentId;
        this.experimentTitle = experimentTitle;
        this.leadResearcher = leadResearcher;
        this.fundingAmount = fundingAmount;
        this.complexityLevel = complexityLevel;
        this.initiationMonth = initiationMonth;
        this.initiationYear = initiationYear;
    }

    public int getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }

    public String getExperimentTitle() {
        return experimentTitle;
    }

    public void setExperimentTitle(String experimentTitle) {
        this.experimentTitle = experimentTitle;
    }

    public String getLeadResearcher() {
        return leadResearcher;
    }

    public void setLeadResearcher(String leadResearcher) {
        this.leadResearcher = leadResearcher;
    }

    public double getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(double fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    public String getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(String complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public int getInitiationMonth() {
        return initiationMonth;
    }

    public void setInitiationMonth(int initiationMonth) {
        this.initiationMonth = initiationMonth;
    }

    public int getInitiationYear() {
        return initiationYear;
    }

    public void setInitiationYear(int initiationYear) {
        this.initiationYear = initiationYear;
    }

    public double calculateInnovationScore(int monthsActive){
        switch (this.complexityLevel) {
            case "QubitOpt":
                return (1.5 * monthsActive * this.fundingAmount) / 1000;
            case "Entanglement":
                return (2.5 * monthsActive * this.fundingAmount) / 1000;
            case "Cryptography":
                return (3.5 * monthsActive * this.fundingAmount) / 1000;
            default :
                return 0.0;
        }
    }

    public double calculateResourceConsumption(int monthsActive){
        switch (this.complexityLevel) {
            case "QubitOpt":
                return (0.8 * monthsActive * this.fundingAmount) / 100;
            case "Entanglement":
                return (1.2 * monthsActive * this.fundingAmount) / 100;
            case "Cryptography":
                return (1.8 * monthsActive * this.fundingAmount) / 100;
            default :
                return 0.0;
        }
    }


}

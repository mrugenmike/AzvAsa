package azvasa.model;

public class AlarmModel{
    private String username;
    private String vmname ;
    private String alarmname;
    private String description;
    private String alarmMetric;
    private String alarmOperator;
    private String alarmThresholdValue;
    private String email;

    public AlarmModel(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVmname() {
        return vmname;
    }

    public void setVmname(String vmname) {
        this.vmname = vmname;
    }

    public String getAlarmname() {
        return alarmname;
    }

    public void setAlarmname(String alarmname) {
        this.alarmname = alarmname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlarmMetric() {
        return alarmMetric;
    }

    public void setAlarmMetric(String alarmMetric) {
        this.alarmMetric = alarmMetric;
    }

    public String getAlarmOperator() {
        return alarmOperator;
    }

    public void setAlarmOperator(String alarmOperator) {
        this.alarmOperator = alarmOperator;
    }

    public String getAlarmThresholdValue() {
        return alarmThresholdValue;
    }

    public void setAlarmThresholdValue(String alarmThresholdValue) {
        this.alarmThresholdValue = alarmThresholdValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
package azvasa.controller.model;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.VirtualMachine;
import org.hibernate.validator.constraints.NotEmpty;

public class AlarmCreationRequest {

    private AlarmExpression expression;

    @NotEmpty
    private String operator; // values: >,<

    @NotEmpty
    private String description;

    @NotEmpty
    private String metric;//cpu,memory

    @NotEmpty
    private int redValue;// specifies value to raise alarm

    private int yellowValue; //specified value for yellow state

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setDescription(String description)
    {
        if(metric.equalsIgnoreCase("cpu")) {
            this.description = "CPU Alarm ";
        }
        else
        {
            this.description = "Memory Alarm ";
        }
    }

    public String getDescription()
    {
        if(metric.equalsIgnoreCase("cpu")) {
            this.description = "CPU Alarm ";
        }
        else
        {
            this.description = "Memory Alarm ";
        }
        return description;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public int getRedValue() {
        return redValue;
    }

    public void setRedValue(int redValue) {
        this.redValue = redValue;
    }

    public int getYellowValue() {
        return yellowValue;
    }

    public void setYellowValue(int yellowValue) {
        this.yellowValue = yellowValue;
    }

    public AlarmExpression getExpression()
    {
        return getAlarmExpression();
    }

    private AlarmExpression getAlarmExpression() {
        final MetricAlarmExpression exp = new MetricAlarmExpression();

        if(operator.equals(">"))
        {
            exp.setOperator(MetricAlarmOperator.isAbove);
        }
        else
        {
            exp.setOperator(MetricAlarmOperator.isBelow);
        }
        exp.setMetric(getPerfMetricId());
        exp.setRed(redValue);
        //exp.setYellow(yellowValue);
        exp.setType("VirtualMachine");
        return exp;
    }

    public PerfMetricId getPerfMetricId() {
        final PerfMetricId perfMetricId = new PerfMetricId();
        if(metric.equalsIgnoreCase("cpu"))
        {
            perfMetricId.setCounterId(1);
            perfMetricId.setInstance("*");
        }
        else
        {
            perfMetricId.setCounterId(23);
            perfMetricId.setInstance("*");
        }
        return perfMetricId;
    }

    public AlarmAction getemailAction()
    {
        SendEmailAction action = new SendEmailAction();
        action.setToList("varunac1990@gmail.com");
        action.setCcList("varunac1990@gmail.com");
        action.setSubject("Alarm - {alarmName} on {targetName}\n");
        action.setBody("Description:{eventDescription}\n"
                + "TriggeringSummary:{triggeringSummary}\n"
                + "newStatus:{newStatus}\n"
                + "oldStatus:{oldStatus}\n"
                + "target:{target}");

        AlarmTriggeringAction alarmAction =   new AlarmTriggeringAction();
        alarmAction.setYellow2red(true);
        alarmAction.setAction(action);
        return alarmAction;
    }
}

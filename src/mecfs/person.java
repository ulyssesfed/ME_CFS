/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecfs;

/**
 *
 * @author gf211097
 */
public class person {
    public String name;
    public String Date;
    public double frequency;
    public double severity;
    public String cause;

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", Date=" + Date + ", frequency=" + frequency + ", severity=" + severity + ", cause=" + cause + '}';
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}

import java.util.Objects;

public class Driver {

    private String fullName;
    public boolean licenseYes;
    private int experienceDriver;

    public Driver(String fullName, boolean licenseYes, int experienceDriver) {
        this.fullName = fullName;
        this.licenseYes = licenseYes;
        this.experienceDriver = experienceDriver;
    }

    public Driver() {

    }

    public void goDriver() {
    }

    public void stopDriver() {
    }

    public void refuelCar() {


    }
    public String getFullName() {
        return fullName;
    }

    public boolean isLicenseYes() {
        return licenseYes;
    }

    public void setLicenseYesOrNo(boolean licenseYes) {
        this.licenseYes = licenseYes;
    }

    public int getExperienceDriver() {
        return experienceDriver;
    }

    public void setExperienceDriver(int experienceDriver) {
        this.experienceDriver = experienceDriver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return licenseYes == driver.licenseYes&& experienceDriver == driver.experienceDriver && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, licenseYes, experienceDriver);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", licenseYesOrNo=" + licenseYes +
                ", experienceDriver=" + experienceDriver +
                '}';
    }
}

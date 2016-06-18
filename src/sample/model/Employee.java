package sample.model;

import javafx.beans.property.*;
import java.sql.Date;

/**
 * Created by ONUR BASKIRT on 27.02.2016.
 */
public class Employee {
    //Declare Employees Table Columns
    private IntegerProperty employee_id;
    private StringProperty first_name;
    private StringProperty last_name;
    private StringProperty email;
    private StringProperty phone_number;
    private SimpleObjectProperty<Date> hire_date;
    private StringProperty job_id;
    private IntegerProperty salary;
    private DoubleProperty commission_pct;
    private IntegerProperty manager_id;
    private IntegerProperty department_id;

    //Constructor
    public Employee() {
        this.employee_id = new SimpleIntegerProperty();
        this.first_name = new SimpleStringProperty();
        this.last_name = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.phone_number = new SimpleStringProperty();
        this.hire_date = new SimpleObjectProperty<>();
        this.job_id = new SimpleStringProperty();
        this.salary = new SimpleIntegerProperty();
        this.commission_pct = new SimpleDoubleProperty();
        this.manager_id = new SimpleIntegerProperty();
        this.department_id = new SimpleIntegerProperty();
    }

    //employee_id
    public int getEmployeeId() {
        return employee_id.get();
    }

    public void setEmployeeId(int employeeId){
        this.employee_id.set(employeeId);
    }

    public IntegerProperty employeeIdProperty(){
        return employee_id;
    }

    //first_name
    public String getFirstName () {
        return first_name.get();
    }

    public void setFirstName(String firstName){
        this.first_name.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return first_name;
    }

    //last_name
    public String getLastName () {
        return last_name.get();
    }

    public void setLastName(String lastName){
        this.last_name.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return last_name;
    }

    //email
    public String getEmail () {
        return email.get();
    }

    public void setEmail (String email){
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    //phone_number
    public String getPhoneNumber () {
        return phone_number.get();
    }

    public void setPhoneNumber (String phoneNumber){
        this.phone_number.set(phoneNumber);
    }

    public StringProperty phoneNumberProperty() {
        return phone_number;
    }

    //hire_date
    public Object getHireDate(){
        return hire_date.get();
    }

    public void setHireDate(Date hireDate){
        this.hire_date.set(hireDate);
    }

    public SimpleObjectProperty<Date> hireDateProperty(){
        return hire_date;
    }

    //job_id
    public String getJobId () {
        return job_id.get();
    }

    public void setJobId (String jobId){
        this.job_id.set(jobId);
    }

    public StringProperty jobIdProperty() {
        return job_id;
    }

    //salary
    public int getSalary() {
        return salary.get();
    }

    public void setSalary(int salary){
        this.salary.set(salary);
    }

    public IntegerProperty salaryProperty(){
        return salary;
    }

    //commission_pct
    public double getCommissionPct() {
        return commission_pct.get();
    }

    public void setCommissionPct(double commissionPct){
        this.commission_pct.set(commissionPct);
    }

    public DoubleProperty commissionPctProperty(){
        return commission_pct;
    }

    //manager_id
    public int getManagerId() {
        return manager_id.get();
    }

    public void setManagerId(int managerId){
        this.manager_id.set(managerId);
    }

    public IntegerProperty managerIdProperty(){
        return manager_id;
    }

    //department_id
    public int getDepartmanId() {
        return department_id.get();
    }

    public void setDepartmantId(int departmentId){
        this.manager_id.set(departmentId);
    }

    public IntegerProperty departmentIdProperty(){
        return department_id;
    }
}

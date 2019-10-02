/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nisith
 */
@Entity
@Table(name = "emp", catalog = "employee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Emp.findAll", query = "SELECT e FROM Emp e")
    , @NamedQuery(name = "Emp.findById", query = "SELECT e FROM Emp e WHERE e.id = :id")
    , @NamedQuery(name = "Emp.findByFullName", query = "SELECT e FROM Emp e WHERE e.fullName = :fullName")
    , @NamedQuery(name = "Emp.findByEmail", query = "SELECT e FROM Emp e WHERE e.email = :email")
    , @NamedQuery(name = "Emp.findByCompany", query = "SELECT e FROM Emp e WHERE e.company = :company")
    , @NamedQuery(name = "Emp.findByJobPost", query = "SELECT e FROM Emp e WHERE e.jobPost = :jobPost")
    , @NamedQuery(name = "Emp.findByEmployeeLevel", query = "SELECT e FROM Emp e WHERE e.employeeLevel = :employeeLevel")
    , @NamedQuery(name = "Emp.findByAddress", query = "SELECT e FROM Emp e WHERE e.address = :address")
    , @NamedQuery(name = "Emp.findByTel", query = "SELECT e FROM Emp e WHERE e.tel = :tel")
    , @NamedQuery(name = "Emp.findByAge", query = "SELECT e FROM Emp e WHERE e.age = :age")
    , @NamedQuery(name = "Emp.findBySalary", query = "SELECT e FROM Emp e WHERE e.salary = :salary")
    , @NamedQuery(name = "Emp.findByIsDeleted", query = "SELECT e FROM Emp e WHERE e.isDeleted = :isDeleted")})
public class Emp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @Column(name = "job_post")
    private String jobPost;
    @Basic(optional = false)
    @Column(name = "employee_level")
    private int employeeLevel;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "salary")
    private int salary;
    @Basic(optional = false)
    @Column(name = "is_deleted")
    private boolean isDeleted;

    public Emp() {
    }

    public Emp(Integer id) {
        this.id = id;
    }

    public Emp(Integer id, String fullName, String email, String company, String jobPost, int employeeLevel, String address, String tel, int age, int salary, boolean isDeleted) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.company = company;
        this.jobPost = jobPost;
        this.employeeLevel = employeeLevel;
        this.address = address;
        this.tel = tel;
        this.age = age;
        this.salary = salary;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        String oldCompany = this.company;
        this.company = company;
        changeSupport.firePropertyChange("company", oldCompany, company);
    }

    public String getJobPost() {
        return jobPost;
    }

    public void setJobPost(String jobPost) {
        String oldJobPost = this.jobPost;
        this.jobPost = jobPost;
        changeSupport.firePropertyChange("jobPost", oldJobPost, jobPost);
    }

    public int getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(int employeeLevel) {
        int oldEmployeeLevel = this.employeeLevel;
        this.employeeLevel = employeeLevel;
        changeSupport.firePropertyChange("employeeLevel", oldEmployeeLevel, employeeLevel);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        int oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        boolean oldIsDeleted = this.isDeleted;
        this.isDeleted = isDeleted;
        changeSupport.firePropertyChange("isDeleted", oldIsDeleted, isDeleted);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emp)) {
            return false;
        }
        Emp other = (Emp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Emp[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

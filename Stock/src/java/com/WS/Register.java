/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pawan
 */
@Entity
@XmlRootElement
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Register)) {
            return false;
        }
        Register other = (Register) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    private String Password;

    /**
     * Get the value of Password
     *
     * @return the value of Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Set the value of Password
     *
     * @param Password new value of Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    private String ConfirmPassword;

    /**
     * Get the value of ConfirmPassword
     *
     * @return the value of ConfirmPassword
     */
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    /**
     * Set the value of ConfirmPassword
     *
     * @param ConfirmPassword new value of ConfirmPassword
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    private String Email;

    /**
     * Get the value of Email
     *
     * @return the value of Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Set the value of Email
     *
     * @param Email new value of Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }


    @Override
    public String toString() {
        return "com.WS.Register[ id=" + id + " ]";
    }
    
}

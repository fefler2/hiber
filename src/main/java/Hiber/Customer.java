package Hiber;
import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // which object should be persisted
@Table(name = "customer")
public class Customer implements Serializable{


    private static final long serialVersionUID = 1L;



    @Id
    @Column(name = "custID", unique = true) // kolumna
    private int id;

    @Id
    @Column(name = "firstName", nullable = false) // kolumna
    private String fName;


    @Id
    @Column(name = "lastName", nullable = false) // kolumna
    private String lName;

}

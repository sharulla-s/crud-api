package sharulla.crudapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name="studentDetails")
public class Student {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
     
    @Column(name="name")
    private String name;
     
    @Column(name="email")
    private String email;
     
    @Column(name="phone")
    private Long phone;
    
    @Column(name="gender")
    private String gender;

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="addressid")
    private Address address;


}
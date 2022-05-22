package org.casjedcem.FarmShop.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;


@Data
@Entity
@Table(name="vendors")
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class Vendor extends User {
    
    private boolean isActive;
	
    @OneToMany(mappedBy = "vendor")
    private Set<Product> products;
	

}

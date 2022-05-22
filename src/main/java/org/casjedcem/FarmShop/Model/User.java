package org.casjedcem.FarmShop.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;

@Data
@Entity
@Table(name = "User")
@MappedSuperclass
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long userId;

        @Column(name = "USER_NAME", unique = true, nullable = false)
        private String userName;
        private String userEmail;

        @Embedded
        private Address userAddress;

        private String userPhone;

        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        @Column(name = "USER_PASSWORD", nullable = false)
        private String userPassword;


    }


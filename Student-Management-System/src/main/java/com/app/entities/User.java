package com.app.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //to generate id automatically
	private Long id;
	@Column(nullable=false)
	private String address;
	@Column(nullable = false, unique = true)
    private String username;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Subject> subjects = new HashSet<>();
	
	@ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "role")
    private Set<String> roles;
}

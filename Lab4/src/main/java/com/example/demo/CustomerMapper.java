package com.example.demo;

import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

	CustomerDTO customerToDTO(Customer customer);

}

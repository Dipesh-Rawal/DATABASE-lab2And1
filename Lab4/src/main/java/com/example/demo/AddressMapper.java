package com.example.demo;

import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
	AddressDTO addressToDTO(Address address);

}

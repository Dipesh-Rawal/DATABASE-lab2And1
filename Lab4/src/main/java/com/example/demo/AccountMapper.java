package com.example.demo;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

	AccountDTO accountToDTO(Account account);

}

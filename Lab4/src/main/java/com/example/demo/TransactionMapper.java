package com.example.demo;

import org.mapstruct.Mapper;

@Mapper
public interface TransactionMapper {

	TransactionDTO transactionToDTO(Transaction transaction);

}
